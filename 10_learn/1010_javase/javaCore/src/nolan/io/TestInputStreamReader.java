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
					new InputStreamReader(System.in,"gbk") //解码。
					);
			System.out.println("请输入");
			System.out.println("输入的内容是：" + br.readLine());//到这里程序会阻塞，等待用户输入。
			
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
