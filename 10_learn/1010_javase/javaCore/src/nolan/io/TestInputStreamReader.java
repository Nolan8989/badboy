package nolan.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(System.in,"gbk") //���롣
					);
			System.out.println("������");
			System.out.println("����������ǣ�" + br.readLine());//�����������������ȴ��û����롣
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
