package com.bjsxt.test.exception;

public class Test06 {
	public static void main(String[] args) {
		new Test06().test01(-3);
	}
	
	public void test01(int index){
		if(index<0){
			throw new MyIndexException();
		}
	}
}


class MyIndexException extends RuntimeException{
	public MyIndexException(String msg){
		super(msg);
	}
	public MyIndexException(){
	}
}