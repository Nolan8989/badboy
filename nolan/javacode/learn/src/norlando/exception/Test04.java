package com.bjsxt.test.exception;

import java.io.FileNotFoundException;

public class Test04 {
	public static void main(String[] args) {
		
	}
}

class A {
	public void test01() throws FileNotFoundException{
		System.out.println("A.test01()");
	}
}

class B extends A {
	public void test01() /*throws IOException*/ {
		
	}
}