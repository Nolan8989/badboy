package com.bjsxt.test.exception;

public class Test05 {
	public static void main(String[] args) {
		new Test05().test01(-3);
	}
	
	public void test01(int index){
		if(index<0){
//			throw new IndexOutOfBoundsException();  //IndexOutofBoundsException()是RuntimeException的子类，所以不需要trycatch！
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
