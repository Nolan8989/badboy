package nolan.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData();

	}
	static void TestData(){
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("d:/javas/resource/datatest.txt")
								)
					);
			dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream("d:/javas/resource/datatest.txt")
							)
					);
			
			dos.writeLong(Math.round(Math.random()* 100));
			dos.writeLong(Math.round(Math.random()* 100));
			dos.writeUTF("sadasdada");
			dos.writeUTF("JOJoijoi");
			dos.writeChar('a');
			dos.writeBoolean(true);
			dos.writeDouble(Math.random()*10);
			dos.flush();
			
			/*
			 * 读取时候需要知道源文件的 类型顺序，否则是乱码；
			 * 下面读取的时候，显示读取一个long 类型数据，然后从读取的位置之后读取下一个；
			 */
			System.out.println("Long:"+ dis.readLong());
			System.out.println("Long:"+ dis.readLong());
			System.out.println("Utf:" + dis.readUTF());
			System.out.println("Utf:" + dis.readUTF());
			System.out.println("Char:"+ dis.readChar());
			System.out.println("Boolean:"+ dis.readBoolean());
			System.out.println("Double:" + dis.readDouble());
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				dos.close();
			} catch (IOException  e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				dis.close();
			} catch (IOException  e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
