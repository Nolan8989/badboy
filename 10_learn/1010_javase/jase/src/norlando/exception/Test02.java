package com.bjsxt.test.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试CheckedException
 *
 */
public class Test02 {
	public static void main(String[] args)  {
		FileReader fr = null;
		try{
			fr = new FileReader("d:/a.txt");
			StringBuilder sb = new StringBuilder();
			
			int temp = 0;
			while( (temp=fr.read())!=-1){
//				System.out.println((char)temp);
				sb.append((char)temp);
			}
			
			System.out.println(sb);
			
		}catch (FileNotFoundException e) {  //如果多个异常之间有父子关系，先放子类后放父类！
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//finally中的代码，无论有没有异常，都会执行！
			System.out.println("我在finally里面！！！");
			try {
				if(fr!=null){
					fr.close();   //IO流对象使用完后，无论有无异常，都需要关闭！
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//System.out.println("##############");
		
	}
}
