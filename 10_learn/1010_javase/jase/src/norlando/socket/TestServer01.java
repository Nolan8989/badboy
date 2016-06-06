package norlando.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestServer01 {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new TestServer01().test2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public	void  test() throws IOException{
		ServerSocket server = new ServerSocket(7899);
		Socket socket = server.accept();
		System.out.println("一个客户端已经连入！");
		
		DataInputStream dis = new DataInputStream(
					socket.getInputStream()
				);
		
		System.out.println(dis.readUTF());
	}
	
	public void test2() throws UnknownHostException,IOException{
		ServerSocket server = new ServerSocket(7899);
		Socket socket = server.accept();
		System.out.println("一个客户端已经连入！");
		BufferedReader br =new BufferedReader( 
				new InputStreamReader(
							socket.getInputStream()
						)
			);
		System.out.println(br.readLine());
	}

}
