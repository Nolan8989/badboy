package nolan.array;

/**
 * 测试String的基本用法
 *  作业：
 *  1. 基本作业：完成如下所有代码的测试。并且尝试去看String类的源码。尽量看，看不懂没关系！先培养好的习惯。
 *  2. 提高作业：学有余力的同学，可以尝试自己写个：MyString 
 *
 */
public class TestString {
	public static void main(String[] args) {
		
		//如下代码共创建：1002个对象！非常浪费，以后遇到这种循环迭代时绝对不要使用String类！
		String str = new String("abcdefg");
		for(int i=0;i<1000;i++){
			str  = str + i;
		}
		
		String str2 = new String("abc");
		String str3 = new String("abc");
		String str4 = "def";
		String str5 = "def";
		System.out.println(str2==str3);  //str2和str3指向了不同的新的字符串对象！
		System.out.println(str4==str5);  //str4和str5指向了常量池中的同一个对象！
		
		
		System.out.println(str2.equals(str3));
		
		char c = str.charAt(2);
		
		System.out.println(str2.equalsIgnoreCase("ABC"));
		
		
		int idx = "abcdefghijklmndefopq".indexOf("def");
		int idx2 = "abcdefghijklmndefopq".indexOf("ddd");
		int idx3 = "abcdefghijklmndefopq".lastIndexOf("def");
		System.out.println(idx);
		System.out.println(idx2);
		System.out.println(idx3);
		
		System.out.println(str.length());
		
		String str6 = "abcdefgtyqc";   //ab*defgtyq*
		str6.replace('c', '*');
		System.out.println(str6);
		
		System.out.println("abcefg".startsWith("abc"));
		System.out.println("abcdefg".endsWith("efg"));
		
		
		String str7 = "abcdefghijklmn";
		String str8 = str7.substring(2,8);  //截取时，包头不包尾
		System.out.println(str8);
		
		
		System.out.println("abcd".toUpperCase());
		System.out.println("aBCd".toLowerCase());
		
		System.out.println("  ab c  ".trim().length());
		
		
		
	}
}
