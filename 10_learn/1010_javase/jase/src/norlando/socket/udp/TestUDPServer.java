package norlando.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**�ͻ�����������˷�����Ϣ��������Ĳ����� */
public class TestUDPServer {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8999);
		byte[] b = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b,b.length);
		
		ds.receive(dp);  //����ʽ����

		String string = new String(dp.getData(),0,dp.getLength());  //dp.getLength()����ʵ���յ������ݵ��ֽ���
		System.out.println(string);
		ds.close();
	
		DatagramSocket ds2 = new DatagramSocket(7777);
		byte[] buff = new byte[1024];
	}
	
}
