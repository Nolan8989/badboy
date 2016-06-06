package norlando.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**客户端向服务器端发送信息（最基本的操作） */
public class TestUDPServer {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8999);
		byte[] b = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b,b.length);
		
		ds.receive(dp);  //阻塞式方法

		String string = new String(dp.getData(),0,dp.getLength());  //dp.getLength()返回实际收到的数据的字节数
		System.out.println(string);
		ds.close();
	
		DatagramSocket ds2 = new DatagramSocket(7777);
		byte[] buff = new byte[1024];
	}
	
}
