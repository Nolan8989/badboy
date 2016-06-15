package nolan.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
* 面向对象是：封装数据和处理数据。
* InetAdrress：封装了ip、dns信息！
*
*/
public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
//		使用getLocalHost方法创建InetAddress对象
		InetAddress addr1 = InetAddress.getLocalHost();
		System.out.println(addr1.getHostAddress());
		System.out.println(addr1.getHostName());
		
//		根据域名得到InetAddress对象
		InetAddress addr2 = InetAddress.getByName("www.baidu.com");
		System.out.println(addr2.getHostAddress());
		System.out.println(addr2.getHostName());
		
//		根据ip得到InetAddress对象
		InetAddress addr3 = InetAddress.getByName("61.135.253.15");
		System.out.println(addr3.getHostAddress());
		System.out.println(addr3.getHostName());  //输出ip而不是域名。如果这个IP地 址不存在或DNS服务器不允许进行IP地址和域名的映射，getHostName方法就直接返回这个IP地址。

		
	}

}
