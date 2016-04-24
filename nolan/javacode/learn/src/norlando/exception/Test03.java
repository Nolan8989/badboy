package com.bjsxt.test.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
	public static void main(String[]  args){
		String str =new Test03().openFile();
		System.out.println(str);
	}
	
	String openFile(){
		try{
			System.out.println("aaa");
			FileReader fis = new FileReader("d:/ad.txt");   //checked!!!
			int a = fis.read();		
			System.out.println("bbb");//先确定返回的值，并不会直接结束运行！
			return "step1";
		}catch(FileNotFoundException  e){
			System.out.println("catching!!!!");
			e.printStackTrace();
			return "step2";     //先确定返回的值，并不会直接结束运行！
		}catch(IOException  e){
			e.printStackTrace();
			return "step3";
		}finally{
			System.out.println("finally!!!!");
//			return "fff";    //尽量不要再finally中使用return！
		}
	}
}

