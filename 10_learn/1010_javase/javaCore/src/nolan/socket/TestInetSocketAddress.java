package nolan.socket;

import java.net.InetSocketAddress;

/**
* 面向对象;封装数据、处理数据。
* 
* InetSocketAddress：封装了：ip、dns,端口的信息。  因此，可以在socket通信中使用！
*
*/
public class TestInetSocketAddress {
	public static void main(String[] args) {
		//包含端口
		InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
		InetSocketAddress socketAddress2 = new InetSocketAddress("localhost",9000);
		System.out.println(socketAddress.getHostName());
		System.out.println(socketAddress2.getAddress());

	}
}