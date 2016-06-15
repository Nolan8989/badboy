package nolan.usuallyclass.string;

/**
 * 测试StringBuilder，可变字符序列
 *  String：不可变字符序列
 *  StringBuilder：可变字符序列，线程不安全，效率高. 我们一般用它！
 *  StringBuffer:可变字符序列，线程安全，效率低
 *  数组的扩容：其实就是新创建一个容量更大的数组，将老数组中的内容copy到新数组中即可！
 *  
 *  
 *  //课堂作业：自己实现数组拷贝。功能类似于：System.arraycopy();
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("def");
		StringBuffer sbf = new StringBuffer("dde");
		sb.append("12").append("23");
		sb.append(123).append(true);
		
		for(int i=0;i<100;i++){
			sb.append(i);
		}
		
		System.out.println("######################");
		
		StringBuilder sb2 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		sb2.deleteCharAt(2);
		System.out.println(sb2);
//		sb2.delete(2, 5);
		sb2.reverse();
		System.out.println(sb2);

		
		
		
	}
}
