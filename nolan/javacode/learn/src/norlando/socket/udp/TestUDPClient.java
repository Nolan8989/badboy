package norlando.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**�ͻ�����������˷�����Ϣ��������Ĳ�����
UDPû���ϸ������ϵķ������Ϳͻ���֮�֡�
*/
public class TestUDPClient {
	public static void main(String[] args) throws Exception {
		byte[] b = "aaaa".getBytes();
		
		//����������ݰ�Ҫ��������ȥ
		DatagramPacket dp = new DatagramPacket(b,b.length,new InetSocketAddress("localhost",8999));

		//�ұ���ռ��9000�˿���������������ݰ�
		DatagramSocket ds = new DatagramSocket(9000);
		ds.send(dp);
		ds.close();
	}
}