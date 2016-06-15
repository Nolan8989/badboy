package nolan.io;
/*
 * 用FileInputStream 和FileOutputStream 复制一个文件
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileIOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		StringBuilder sb = new StringBuilder();
		int temp = 0;
		long date1 = System.currentTimeMillis();
		byte buf[] = new byte[1024];
		try {
			fis = new FileInputStream("d:\\javas\\resource\\51cfabdabfecc3baec9d506e3a027629.jpg");
			fos = new FileOutputStream("d:\\javas\\resource\\copy51cfabdabfecc3baec9d506e3a027629.jpg");
			while((temp = fis.read(buf)) != -1){
				//String str = new String(buf,0,temp);
				fos.write(buf, 0, temp);
				//byte[] by = new byte[1024];
				//by = str.getBytes();
				//fos.write(str.getBytes());如果是在把字符串写到文件可以用这个方法；
				//sb.append(str);
			}
			//System.out.println(sb);
			
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if(fos != null){
					fos.close();
				}
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		//new File("d:"+ File.separator +"a.txt");
		long date2 = System.currentTimeMillis();
		System.out.println(date2 + "-" + date1 + "=" + (date2-date1));
		
	}

}
