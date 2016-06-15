package nolan.thread.format;

	
	
	//想必大家对SimpleDateFormat并不陌生。不过，你是否知道，SimpleDateFormat不是线程安全的（thread safe）	。
	//这意味着，下面的代码在多线程环境下运行结果并非如我们所愿 - 有时候，它输出正确的日期，有时候会输出错误的（例如.Tue Aug 11 00:00:00 CST 48201），
	//有些时候甚至会抛出NumberFormatException！！！（当然，在单线程环境是，这段代码是完全没有问题的）
	  
	import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//	public class TestDateFormat {
//	    private final DateFormat format = new SimpleDateFormat("yyyyMMdd");  
//	  
//	    public Date convert(String source) throws ParseException {  
//	        return format.parse(source);  
//	    }  
//	}  

	  
//	 class Test {
//		 
//	    public static void main(String[] args) throws Exception {  
//	        final DateFormatTest t =new DateFormatTest();  
//	          
//	        Callable<Date> task =new Callable<Date>(){  
//	            public Date call()throws Exception {  
//	                return t.convert("20100811");  
//	            }  
//	        };  
//	           
//	        //尝试5个线程的情况  
//	        ExecutorService exec = Executors.newFixedThreadPool(5);  
//	        List<Future<Date>> results = new ArrayList<Future<Date>>();  
//	           
//	        //实现100次日期转换  
//	        for(int i =0; i <100; i++){  
//	            results.add(exec.submit(task));  
//	        }  
//	          
//	        exec.shutdown();  
//	           
//	        //查看结果  
//	        for(Future<Date> result : results){  
//	            System.out.println(result.get());  
//	        }  
//	    }  
//	  
//	}  
//	运行结果：
//
//	Wed Aug 11 00:00:00 CST 2010
//	Tue Aug 11 00:00:00 CST 48201
//	Wed Aug 11 00:00:00 CST 2010
//	Exception in thread "main" java.util.concurrent.ExecutionException: java.lang.NumberFormatException: For input string: "E.1118E1"
//	at java.util.concurrent.FutureTask$Sync.innerGet(FutureTask.java:222)
//	at java.util.concurrent.FutureTask.get(FutureTask.java:83)
//	at com.uppower.test.DateFormatTest.main(DateFormatTest.java:44)
//	Caused by: java.lang.NumberFormatException: For input string: "E.1118E1"
//	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1224)
//	at java.lang.Double.parseDouble(Double.java:510)
//	at java.text.DigitList.getDouble(DigitList.java:151)
//	at java.text.DecimalFormat.parse(DecimalFormat.java:1303)
//	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1589)
//	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1312)
//	at java.text.DateFormat.parse(DateFormat.java:335)
//	at com.uppower.test.DateFormatTest.convert(DateFormatTest.java:20)
//	at com.uppower.test.DateFormatTest$1.call(DateFormatTest.java:28)
//	at com.uppower.test.DateFormatTest$1.call(DateFormatTest.java:1)
//	at java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
//	at java.util.concurrent.FutureTask.run(FutureTask.java:138)
//	at java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
//	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
//	at java.lang.Thread.run(Thread.java:619)
//
//
//	接下来，我们看看为什么DateFormat不是线程安全的。
//
//	我们就要打开JDK的源码，在format方法里，有这样一段代码：
//
//	calendar.setTime(date);
//	其中，calendar是DateFormat的protected字段。这条语句改变了calendar，稍后，calendar还会用到（在subFormat方法里），而这就是引发问题的根源。
//
//	想象一下，在一个多线程环境下，有两个线程持有了同一个SimpleDateFormat的实例，分别调用format方法：
//
//	线程1调用format方法，改变了calendar这个字段。
//	中断来了。
//	线程2开始执行，它也改变了calendar。
//	又中断了。
//	线程1回来了，此时，calendar已然不是它所设的值，而是走上了线程2设计的道路。
//	BANG！！！ 稍微花点时间分析一下format的实现，我们便不难发现，用到calendar，唯一的好处，就是在调用subFormat时，少了一个参数，却带来了这许多的问题。其实，只要在这里用一个局部变量，一路传递下去，所有问题都将迎刃而解。
//	这个问题背后隐藏着一个更为重要的问题：无状态。
//
//	无状态方法的好处之一，就是它在各种环境下，都可以安全的调用。衡量一个方法是否是有状态的，就看它是否改动了其它的东西，比如全局变量，比如实例的字段。format方法在运行过程中改动了SimpleDateFormat的calendar字段，所以，它是有状态的。
//
//	所以，写程序，我们要尽量编写无状态方法。
//
//
//	那么，我们如何在多线程中的使用DateFormat呢？
//
//	1. 同步
//	最简单的方法就是在做日期转换之前，为DateFormat对象加锁。这种方法使得一次只能让一个线程访问DateFormat对象，而其他线程只能等待。
//	 class DateFormatTest2 {  
//	    private final DateFormat format = new SimpleDateFormat("yyyyMMdd");  
//	      
//	    public Date convert(String source) throws ParseException {  
//	        synchronized(format) {  
//	            return format.parse(source);  
//	        }  
//	    }  
//	}  
//
//	//2. 使用ThreadLocal
//	//另外一个方法就是使用ThreadLocal变量去容纳DateFormat对象，也就是说每个线程都有一个属于自己的副本，并无需等待其他线程去释放它。这种方法会比使用同步块更高效。
//	 class DateFormatTest2 {  
//	  
//	    private final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {  
//	  
//	        @Override  
//	        protected DateFormat initialValue() {  
//	            return new SimpleDateFormat("yyyyMMdd");  
//	        }  
//	    };  
//	  
//	    public Date convert(String source) throws ParseException {  
//	        return df.get().parse(source);  
//	    }  
//	}  


//	3. Joda-Time
//	Joda-Time 是一个很棒的开源的 JDK 的日期和日历 API 的替代品，其 DateTimeFormat 是线程安全而且不变的。
//	[java] view plaincopy
	  
//	import org.joda.time.DateTime;  
//	import org.joda.time.format.DateTimeFormat;  
//	import org.joda.time.format.DateTimeFormatter;  
//	import java.util.Date;  
//	  
//	public class DateFormatTest {  
//	    private final DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMdd");  
//	          
//	    public Date convert(String source){  
//	        DateTime d = fmt.parseDateTime(source);  
//	        returnd.toDate();  
//	    }  
//	}  

	//4.使用临时变量(不推荐)
	// 作为一个专业程序员，我们当然知道，相比于共享一个变量的开销要比每次创建小。创建一个实例来获取日期格式会比较高效，因为系统不需要多次获取本地语言和国家。
	//[java] view plaincopy
	 class DateFormatTest3 {  
	    public Date convert(String source) throws ParseException {  
	        DateFormat format = new SimpleDateFormat("yyyyMMdd");  
	        return format.parse(source);  
	    }  
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	

