package nolan.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ≤‚ ‘ByteArrayInputStream 
 */
public class TestByteArrayInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteArrayInputStream bais = null;
		StringBuilder sb = null;
		int temp = 0;
		int num = 0;
		byte[] b = "abcdefghigklmnopqrstuvwxyz".getBytes();
		
		
			
			bais = new ByteArrayInputStream(b,0,3);
			sb = new StringBuilder();
			while( (temp =bais.read()) != -1){
				sb.append((char)temp);
			}
			System.out.println(sb);
		//new File("d:" + File.separator + "a.txt");
			try {
				FileInputStream fis = new FileInputStream("d:\\javas\\resource\\astream.txt");
				byte[] u = getByteFromIS(fis);
				System.out.println(new String(u));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	static byte[] getByteFromIS(FileInputStream fis){
		ByteArrayOutputStream baos = null;
		int temp = 0;
		
		baos = new ByteArrayOutputStream();
		try {
			while((temp = fis.read()) != -1){
				baos.write(temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return baos.toByteArray();

	}
	


}
