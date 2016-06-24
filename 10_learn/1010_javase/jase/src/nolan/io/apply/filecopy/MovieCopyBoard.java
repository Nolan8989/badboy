package nolan.io.apply.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝 实现类
 * @author andong
 * 
 */
public class MovieCopyBoard {
	
	
	public static void main(String[] args) {
		copyFile("d:/astream.txt","d:/astreambuffered.txt");
	}

	static void copyFile(String src, String dec) {
		/*
		 * 使用BufferedInputStream和BufferedOutputStream 复制文件
		 */
		FileInputStream fileInputStream = null;
		FileOutputStream fileOuputStream = null;
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		int streamCacheTemp = 0; 
		try {
			fileInputStream = new FileInputStream(src);
			fileOuputStream = new FileOutputStream(dec);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			bufferedOutputStream = new BufferedOutputStream(fileOuputStream);
			while ((streamCacheTemp = bufferedInputStream.read()) != -1) {
//				 System.out.println(streamCacheTemp);
				bufferedOutputStream.write(streamCacheTemp);// 将指定的字节写入此缓冲的输出流.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedOutputStream != null) {
					bufferedOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (bufferedInputStream != null) {
					bufferedInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fileOuputStream != null) {
					fileOuputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
