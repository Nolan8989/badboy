package nolan.socket.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**UDP�������ݣ������ݻ����������ݣ� */
public class TestUDPClient02 {


		public static void main(String[] args) throws Exception {
		long n = 2000L;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeLong(n);
		byte[] b = bos.toByteArray();

		//����������ݰ�Ҫ��������ȥ
		DatagramPacket dp = new DatagramPacket(b,b.length,new InetSocketAddress("localhost",8999));
		//�ұ���ռ��9000�˿���������������ݰ�
		DatagramSocket ds = new DatagramSocket(9000);
		ds.send(dp);
		ds.close();
		}
	}	
