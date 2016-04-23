package norlando.socket.udp;


import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/** 客户端向服务器端发送信息（传递对象） */
public class TestUDPClient03 {
		public static void main(String[] args) throws Exception {
			Person person = new Person(18, "高淇");
			
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(person);
			byte[] b = bos.toByteArray();

			// 必须告诉数据包要发到哪里去
			DatagramPacket dp = new DatagramPacket(b, b.length,
					new InetSocketAddress("localhost", 8999));
			// 我本身占用9000端口向外面机器发数据包
			DatagramSocket ds = new DatagramSocket(9000);
			ds.send(dp);
			ds.close();
		}
	}
