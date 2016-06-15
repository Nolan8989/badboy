package nolan.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**客户端向服务器端发送信息（最基本的操作）
UDP没有严格意义上的服务器和客户端之分。
*/
public class TestUDPClient {
	public static void main(String[] args) throws Exception {
		byte[] b = "aaaa".getBytes();
		
		//必须告诉数据包要发到哪里去
		DatagramPacket dp = new DatagramPacket(b,b.length,new InetSocketAddress("localhost",8999));

		//我本身占用9000端口向外面机器发数据包
		DatagramSocket ds = new DatagramSocket(9000);
		ds.send(dp);
		ds.close();
	}
}