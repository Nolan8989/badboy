package norlando.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ����CheckedException
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
		
		
		//System.out.println("##############");
		
	}
}
