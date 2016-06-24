package nolan.socket;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient01 {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new TestClient01().test2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public	void  test() throws UnknownHostException,IOException{
		//1、创建客户端  Socket 同时指定 服务器的地址 与端口
		Socket socket = new Socket("127.0.0.1",7899);//throws UnknownHostException, IOException
	
		//2、发送信息 (输出流)
				/*
				client.getInputStream();
				client.getOutputStream();
				*/
		DataOutputStream dos = new DataOutputStream(
					socket.getOutputStream() //throws IOException
				);
		String str = "Hello Server...";
		dos.writeUTF(str); //throws IOException
		dos.flush(); //throws IOException
	}
	
	public void test2() throws UnknownHostException,IOException{
		Socket socket = new Socket("127.0.0.1",7899);
		
		BufferedWriter bw =new BufferedWriter( 
								new OutputStreamWriter(
											socket.getOutputStream()
										)
							);
		
		String str = "Hi Server... \n";//必须给定结束符  \r\n  newLine()
		bw.write(str);
		bw.newLine();
		bw.flush();
		
	}

}
