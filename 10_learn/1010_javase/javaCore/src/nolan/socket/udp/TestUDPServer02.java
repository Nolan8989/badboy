package nolan.socket.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**UDP��ʽ:�����ݻ����������ݣ� */ 
public class TestUDPServer02 {
	public static void main(String[] args) throws Exception {
	DatagramSocket ds = new DatagramSocket(8999);
	byte[] b = new byte[1024];
	DatagramPacket dp = new DatagramPacket(b,b.length);
		
	ds.receive(dp);  //����ʽ����
	ByteArrayInputStream bis = new ByteArrayInputStream(dp.getData());
	DataInputStream dis = new DataInputStream(bis);
	
	System.out.println(dis.readLong());

	ds.close();	
	}
}