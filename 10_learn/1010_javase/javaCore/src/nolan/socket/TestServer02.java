package nolan.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server;
		DataInputStream dis;
		DataOutputStream dos;
		try {
			server = new ServerSocket(7899);
			Socket socket = server.accept();
			System.out.println("一个客户端已经连入！");
			dis =new DataInputStream( 
							socket.getInputStream()
					);
			dos = new DataOutputStream( 
					socket.getOutputStream()
					);
			while(true){
				String str = dis.readUTF();
				dos.writeUTF("FAQ回馈：" + str);
				dos.flush();
				if(str.equals("bye")){
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
