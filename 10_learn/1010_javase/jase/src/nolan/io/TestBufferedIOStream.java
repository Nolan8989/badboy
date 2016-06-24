package nolan.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedIOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyFile("d:/javas/resource/astream.txt","d:/javas/resource/astreambuffered.txt");

	}
	static void copyFile(String src,String dec){
		/*
		 * 使用BufferedInputStream和BufferedOutputStream 复制文件
		 */
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bais = null;
		BufferedOutputStream baos = null;
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			bais = new BufferedInputStream(fis);
			baos = new BufferedOutputStream(fos);
			while((temp =bais.read())!= -1){
//System.out.println(temp);
				baos.write(temp);//将指定的字节写入此缓冲的输出流.
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try {
				if( baos != null){
					baos.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				if( bais != null){
					bais.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				if( fos != null){
					fos.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				if( fis != null){
					fis.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
