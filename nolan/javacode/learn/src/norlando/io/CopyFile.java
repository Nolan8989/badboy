package norlando.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * ʵ���ļ���Ŀ¼�ĸ��ơ�
 * ����ʵ�ּ�txt�ĵ����ƣ�
 * 
 * 
 */
public class CopyFile {
	
	static int dir = 0;
	static int fil = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//һ���ļ����Ƶ������һ���ļ�;
		File file1 = new File("d:\\javas\\resource\\1");
		File file2 = new File("d:\\javas\\resource\\2");
		
		
		copyDir(file1,file2);
	}
		
	
	
	
	
	static void copyDir(File src,File dest){
		File copyfile = new File(dest,src.getName());
		boolean b = copyfile.mkdir();//������Ϊfile1.getName()���ļ�������file2�涨��·����
															
		System.out.println(b);
		//copyFile(new File(file1,"22.txt"),new File(file2,"22.txt"));
		File[] files = src.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				copyDir(f,copyfile);
				dir++;
			}
			if(f.isFile()){
				copyFile(f, copyfile);
				fil++;
			}
			
		}
		//System.out.println(src.getName() + "Ŀ¼�� ����" + dir+"��Ŀ¼��"+fil +"���ļ�");
	}
	/**	
	 * ���￼�����ֽ�����
	 * @param src
	 * @param dest
	 */
	static void copyFile(File src,File dest){
		if(src == null || ! src.exists()){
			return ;
		}
		File dec = new File(dest , src.getName());
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] a = new byte[1024];
		int len = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			while((len = bis.read(a)) != -1){
				bos.write(a,0,len);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if (bos != null){
					bos.close();
				}
				if (bis != null){
					bis.close();
				}
				if(fis != null){
					fis.close();
				}
				if(fos != null){
					fos.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
	}

	

}
