 package nolan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * �����ļ���ȡ���������黺��֮����Զ�ȡ���ġ�
 * @author Administrator
 *
 */
public class TestFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		StringBuilder sb ;
		try {
			fis = new FileInputStream("D:\\javas\\works\\Test\\src\\norlando\\io\\TestFileInputStream.java");
			sb = new StringBuilder();
			int temp = 0;
			byte[] buf = new byte[1024];
			while((temp=fis.read(buf)) != -1){//temp ����ֵ�Ƕ�ȡ�ĸ������Ͳ���������rean()�����������ܴ�
//System.out.println(temp); // 3;
				String str = new String(buf,0,temp);
				sb.append(str);
			}
			System.out.println(sb.toString());
//			System.out.println(sb);
//			System.out.println(temp); //������֮��temp�ͱ�Ϊ-1��
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
