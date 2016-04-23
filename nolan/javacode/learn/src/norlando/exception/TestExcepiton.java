package norlando.exception;

import java.io.*;
/**
 * �����쳣
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
			
		}catch (FileNotFoundException e) {  //�������쳣֮���и��ӹ�ϵ���ȷ������Ÿ��࣡
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//finally�еĴ��룬������û���쳣������ִ�У�
			System.out.println("����finally���棡����");
			try {
				if(fr!=null){
					fr.close();   //IO������ʹ��������������쳣������Ҫ�رգ�
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}

class MyException01 extends RuntimeException{//�����쳣ʹ�õ�ʱ���ô�������jre���ɡ�
	public MyException01(){
	}
	
	public MyException01(String e){
		super(e);
	}
}

class MyException02 extends Exception{//�����쳣ʹ�õ�ʱ����Ҫ��������������ᱨ������
	public MyException02(){
	}
	
	public MyException02(String e){
		super(e);
	}
}

