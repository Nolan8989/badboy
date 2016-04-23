package norlando.exception;

import java.io.*;
/**
 * 测试异常
 * @author Administrator
 *
 */
public class TestExcepiton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}
	

}

class MyException01 extends RuntimeException{//这种异常使用的时候不用逮，交给jre即可。
	public MyException01(){
	}
	
	public MyException01(String e){
		super(e);
	}
}

class MyException02 extends Exception{//这种异常使用的时候需要逮，否则编译器会报错！！！
	public MyException02(){
	}
	
	public MyException02(String e){
		super(e);
	}
}

