package com.bjsxt.test.exception;

/**
 * 测试RuntimeException
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
//		int i = 1/0;
		
		Student stu = null;
		if(stu!=null){
			stu.getName();   //空指针异常，就是：对象是null，我们调用了对象的方法或属性！
		}
		
//		Integer a = Integer.parseInt("abc");
	
		
		
	}
}
