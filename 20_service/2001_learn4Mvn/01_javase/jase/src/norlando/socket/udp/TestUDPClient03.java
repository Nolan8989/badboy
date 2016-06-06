package norlando.socket.udp;


import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/** �ͻ�����������˷�����Ϣ�����ݶ��� */
public class TestUDPClient03 {
		public static void main(String[] args) throws Exception {
			Person person = new Person(18, "���");
			
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(person);
			byte[] b = bos.toByteArray();

			// ����������ݰ�Ҫ��������ȥ
			DatagramPacket dp = new DatagramPacket(b, b.length,
					new InetSocketAddress("localhost", 8999));
			// �ұ���ռ��9000�˿���������������ݰ�
			DatagramSocket ds = new DatagramSocket(9000);
			ds.send(dp);
			ds.close();
		}
	}
