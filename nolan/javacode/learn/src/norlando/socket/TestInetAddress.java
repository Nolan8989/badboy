package norlando.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
* ��������ǣ���װ���ݺʹ������ݡ�
* InetAdrress����װ��ip��dns��Ϣ��
*
*/
public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
//		ʹ��getLocalHost��������InetAddress����
		InetAddress addr1 = InetAddress.getLocalHost();
		System.out.println(addr1.getHostAddress());
		System.out.println(addr1.getHostName());
		
//		���������õ�InetAddress����
		InetAddress addr2 = InetAddress.getByName("www.baidu.com");
		System.out.println(addr2.getHostAddress());
		System.out.println(addr2.getHostName());
		
//		����ip�õ�InetAddress����
		InetAddress addr3 = InetAddress.getByName("61.135.253.15");
		System.out.println(addr3.getHostAddress());
		System.out.println(addr3.getHostName());  //���ip������������������IP�� ַ�����ڻ�DNS���������������IP��ַ��������ӳ�䣬getHostName������ֱ�ӷ������IP��ַ��

		
	}

}
