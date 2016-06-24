package nolan.socket.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**UDP传递数据：（传递基本类型数据） */
public class TestUDPClient02 {


		public static void main(String[] args) throws Exception {
		long n = 2000L;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeLong(n);
		byte[] b = bos.toByteArray();

		//必须告诉数据包要发到哪里去
		DatagramPacket dp = new DatagramPacket(b,b.length,new InetSocketAddress("localhost",8999));
		//我本身占用9000端口向外面机器发数据包
		DatagramSocket ds = new DatagramSocket(9000);
		ds.send(dp);
		ds.close();
		}
	}	
