package nolan.thread.format;

	
	
	//��ش�Ҷ�SimpleDateFormat����İ�������������Ƿ�֪����SimpleDateFormat�����̰߳�ȫ�ģ�thread safe��	��
	//����ζ�ţ�����Ĵ����ڶ��̻߳��������н��������������Ը - ��ʱ���������ȷ�����ڣ���ʱ����������ģ�����.Tue Aug 11 00:00:00 CST 48201����
	//��Щʱ���������׳�NumberFormatException����������Ȼ���ڵ��̻߳����ǣ���δ�������ȫû������ģ�
	  
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
//	        //����5���̵߳����  
//	        ExecutorService exec = Executors.newFixedThreadPool(5);  
//	        List<Future<Date>> results = new ArrayList<Future<Date>>();  
//	           
//	        //ʵ��100������ת��  
//	        for(int i =0; i <100; i++){  
//	            results.add(exec.submit(task));  
//	        }  
//	          
//	        exec.shutdown();  
//	           
//	        //�鿴���  
//	        for(Future<Date> result : results){  
//	            System.out.println(result.get());  
//	        }  
//	    }  
//	  
//	}  
//	���н����
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
//	�����������ǿ���ΪʲôDateFormat�����̰߳�ȫ�ġ�
//
//	���Ǿ�Ҫ��JDK��Դ�룬��format�����������һ�δ��룺
//
//	calendar.setTime(date);
//	���У�calendar��DateFormat��protected�ֶΡ��������ı���calendar���Ժ�calendar�����õ�����subFormat����������������������ĸ�Դ��
//
//	����һ�£���һ�����̻߳����£��������̳߳�����ͬһ��SimpleDateFormat��ʵ�����ֱ����format������
//
//	�߳�1����format�������ı���calendar����ֶΡ�
//	�ж����ˡ�
//	�߳�2��ʼִ�У���Ҳ�ı���calendar��
//	���ж��ˡ�
//	�߳�1�����ˣ���ʱ��calendar��Ȼ�����������ֵ�������������߳�2��Ƶĵ�·��
//	BANG������ ��΢����ʱ�����һ��format��ʵ�֣����Ǳ㲻�ѷ��֣��õ�calendar��Ψһ�ĺô��������ڵ���subFormatʱ������һ��������ȴ���������������⡣��ʵ��ֻҪ��������һ���ֲ�������һ·������ȥ���������ⶼ��ӭ�ж��⡣
//	������ⱳ��������һ����Ϊ��Ҫ�����⣺��״̬��
//
//	��״̬�����ĺô�֮һ���������ڸ��ֻ����£������԰�ȫ�ĵ��á�����һ�������Ƿ�����״̬�ģ��Ϳ����Ƿ�Ķ��������Ķ���������ȫ�ֱ���������ʵ�����ֶΡ�format���������й����иĶ���SimpleDateFormat��calendar�ֶΣ����ԣ�������״̬�ġ�
//
//	���ԣ�д��������Ҫ������д��״̬������
//
//
//	��ô����������ڶ��߳��е�ʹ��DateFormat�أ�
//
//	1. ͬ��
//	��򵥵ķ���������������ת��֮ǰ��ΪDateFormat������������ַ���ʹ��һ��ֻ����һ���̷߳���DateFormat���󣬶������߳�ֻ�ܵȴ���
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
//	//2. ʹ��ThreadLocal
//	//����һ����������ʹ��ThreadLocal����ȥ����DateFormat����Ҳ����˵ÿ���̶߳���һ�������Լ��ĸ�����������ȴ������߳�ȥ�ͷ��������ַ������ʹ��ͬ�������Ч��
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
//	Joda-Time ��һ���ܰ��Ŀ�Դ�� JDK �����ں����� API �����Ʒ���� DateTimeFormat ���̰߳�ȫ���Ҳ���ġ�
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

	//4.ʹ����ʱ����(���Ƽ�)
	// ��Ϊһ��רҵ����Ա�����ǵ�Ȼ֪��������ڹ���һ�������Ŀ���Ҫ��ÿ�δ���С������һ��ʵ������ȡ���ڸ�ʽ��Ƚϸ�Ч����Ϊϵͳ����Ҫ��λ�ȡ�������Ժ͹��ҡ�
	//[java] view plaincopy
	 class DateFormatTest3 {  
	    public Date convert(String source) throws ParseException {  
	        DateFormat format = new SimpleDateFormat("yyyyMMdd");  
	        return format.parse(source);  
	    }  
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	

