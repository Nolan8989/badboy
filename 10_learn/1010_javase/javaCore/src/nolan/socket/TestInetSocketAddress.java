package nolan.socket;

import java.net.InetSocketAddress;

/**
* �������;��װ���ݡ��������ݡ�
* 
* InetSocketAddress����װ�ˣ�ip��dns,�˿ڵ���Ϣ��  ��ˣ�������socketͨ����ʹ�ã�
*
*/
public class TestInetSocketAddress {
	public static void main(String[] args) {
		//�����˿�
		InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
		InetSocketAddress socketAddress2 = new InetSocketAddress("localhost",9000);
		System.out.println(socketAddress.getHostName());
		System.out.println(socketAddress2.getAddress());

	}
}