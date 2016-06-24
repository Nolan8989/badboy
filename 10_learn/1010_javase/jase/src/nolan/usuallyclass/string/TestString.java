package nolan.usuallyclass.string;

import java.util.StringTokenizer;

/**
 * test:String的基本用法
 *  作业：
 *  1. 基本作业：完成如下所有代码的text:。并且尝试去看String类的源码。尽量看，看不懂没关系！先培养好的习惯。
 *  2. 提高作业：学有余力的同学，可以尝试自己写个：MyString 
 *
 *
 * 字符串常用方法 :不可改变的字符序列
 * 1、 == equals
 * 2、常量池
 * 3、intern
 * 4、+ 拼接 产生大量的垃圾对象
 * 5、String() 
 *   String(String original) 
 * 6、字节数组与字符串转换
 *    String(byte[] bytes, int offset, int length)   
 *    //字节 -->字符  解码
 *    String(byte[] bytes, int offset, int length, String charsetName)  *    
 *    getBytes() 
 *    //编码
 *    getBytes(String charsetName) 
 * 7、字符数组与字符串转换
 *    String(char[] value, int offset, int count)    
 * 8、charAt(int index)  获取对应索引的单个字符
      concat(String str)   拼接
      endsWith(String suffix)  结尾
      startsWith(String prefix) 开头
      indexOf(String str)   子串第一次出现的位置
      lastIndexOf(String str) 子串最后一次出现的位置
      length()  长度
      matches(String regex)  匹配正则
      replace(char oldChar, char newChar)  替换字符串，不支持正则
      replaceAll(String regex, String replacement) 
      split(String regex) -->分割字符串
	  substring(int beginIndex, int endIndex)  获取子串
	  trim()  去除前后空格
	  valueOf(Xxx b)  ：其他类型  转成字符串  
	  
  9、分割字符串 
   1)、split()
   2)、StringTokenizer	 不支持正则  
	StringTokenizer(String str, String delim)  默认""
 * 
 * @author Administrator
 *
 */
public class TestString {

	public static void main(String[] args) {
		//如下代码共创建：1002个对象！非常浪费，以后遇到这种循环迭代时绝对不要使用String类！
		String str = new String("abcdefg");
		for(int i=0;i<1000;i++){
			str  = str + i;
		}
		
		
		String g1 = "Hello World!";
		String g2 = "Hello World!";
		String s1 = new String("Hello World!");
		String s2 = new String("Hello World!");
		boolean b1 = g1.equals(g2);
		boolean b2 = (g1==g2);
		boolean b3 = (s1.equals(s2));
		boolean b4 = (s1==s2);
		
		
		/**
		 * test:equals()和“==”、equalsIgnoreCase();
		 */
		System.out.println("g1.equals(g2)是否相等 ：" + (b1? "相等":"不相等"));
		System.out.println("g1 == g2是否相等 ：" + (b2? "相等":"不相等"));
		System.out.println("s1.equals(s2)是否相等 ：" + (b3? "相等":"不相等"));
		System.out.println("s1 == s2是否相等 ：" + (b4? "相等":"不相等")); //判断的是内存地址。
		System.out.println("equalsIgnoreCase()忽略大小写 判断HELLO和hello是否equals ： " + "HELLO".equalsIgnoreCase("hello"));
		
		/**
		 * test:length();
		 */
		System.out.println( "g1的长度为：" + g1.length());

		
		/**
		 * test:replace();
		 */
		String g1replace = g1.replace(' ' , '$');
		System.out.println("g1===>" + g1 +"\n"+ "g1replace===>" + g1replace);
		
		/**
		 * test: indexOf();
		 * 可以查找数字、字符、字符串（字符和字符串还可以从指定位置找）
		 */
		System.out.println("找到第一个l的位置 ：" + g1.indexOf("l"));
		System.out.println("从第4个字符之后找到l的位置 ：" + g1.indexOf("l",3));
		System.out.println(g1.indexOf("ll"));
		/**
		 * test:statsWith();是否已指定字符串开头，（也可以自己指定）。
		 * 		endsWith();
		 * 区分大小写。
		 */
		System.out.println("startsWith=====>" + g1.startsWith("l",3));
		System.out.println("endsWith=====>" + g1.endsWith("ing"));
		
		/**
		 *test: charAt();
		 */
		char c = g1.charAt(6);
		System.out.println("g1第6个字符为:" + c);
		
		/**
		 * test: substring();
		 */
		System.out.println("substring====>" + g1.substring(2));
		System.out.println("substring====>" + g1.substring(5, 6));//包头不包尾
		
		/**
		 * test:toUpperCase()/toLowerCase();
		 */
		System.out.println("toUpperCase====>" + g1.toUpperCase());
		System.out.println("toLowerCase====>" + g1.toLowerCase());
		
		/**
		 * test: trim();
		 */
		System.out.println("trim()去掉头和尾的空格" + " nihao ".trim());
		
		/**
		 * test: compareTo();
		 */
		System.out.println("compareTo() 按字典顺序比较两个字符串" + "a".compareTo("a"));
		
		
		/**
		 * test:  String's constructor
		 */
		char[] ar = {'a','b','c','d','e','f','g'};
		System.out.println(new String(ar)); //参数为字符串数字。
		byte[] by = {97,98,99,100,101,102,103};
		System.out.println(new String(by));
		
		int a =1;
		String srr ="abc";
		srr = String.valueOf(a); // 内部调用的是Integer.toString(a);由此可见静态方法的好处。
		System.out.println(srr);
		
		String ko = String.valueOf('c');
		
		String s="true"; 
		Boolean flag = Boolean.valueOf (s);
		
		test2();
		test1();
	}
	/**
	 * 测试连接符 +
	 */
	public static void test2(){
		//+ 编译期与运行期行为  
		//编译期 1、类型检查  2、 优化 常量|字面值   运算 直接确定值
		//运行期:变量参与运算  运行确定值 (堆中)
		System.out.println("=================test2===================");
		String str ="ab";//方法区
		String str1 ="a";
		String str2 ="b";		
		System.out.println(str ==(str1+str2)); // result : false;
		System.out.println(str ==("a"+"b")); // result : true;
		//字面值   优化
		String str3 ="a"+"b"; //String str3 ="ab"; //方法区
		System.out.println(str ==str3);
		
		//final 编译确定
		final String str4="a";
		System.out.println(str==(str4+"b"));
		
		//final 值 来自于方法,运行确定值
	//	final String str5 =getValue();
	//	System.out.println(str==(str5+"b"));
	}

	public static void test1(){
		// == equals
		System.out.println("============test1=================");
		String str1 ="abc"; //常量池
		String str2 =new String("abc"); //堆中		
		System.out.println(str1 ==str2); //比较地址  false
		System.out.println(str1.equals(str2));//比较内容  true
		
		//常量池 不存在  第一次放入，存在获取使用
		str1 ="abc";
		str2 ="abc";
		System.out.println(str1 ==str2); //result:true
		
		//intern 始终返回常量池的地址
		str1 ="abc"; //常量池
		str2 =new String("abc"); //堆中		
		System.out.println(str1 == str2.intern()); //result:true
	}
	
	/**
	 * 分割字符串
	 */
	public static void split(){		
		String str="this is a cat and that is a mice where is the food";	
		StringTokenizer token =new StringTokenizer(str," "); // java.util
		while(token.hasMoreElements()){
			System.out.println(token.nextElement());
		}
		
		
		
		/*
		String[] strArr =str.split("\\s+");
		for(String strTemp:strArr){
			System.out.println(strTemp);
		}*/
	}

	
}

