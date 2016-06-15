package nolan.socket.udp;


import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/** �ͻ�����������˷�����Ϣ�����ݶ��� */
public class TestUDPServer03 {
		public static void main(String[] args) throws Exception {
			DatagramSocket ds = new DatagramSocket(8999);
			byte[] b = new byte[1024];
			DatagramPacket dp = new DatagramPacket(b, b.length);

			ds.receive(dp); // ����ʽ����

			ByteArrayInputStream bis = new ByteArrayInputStream(dp.getData());
			ObjectInputStream ois = new ObjectInputStream(bis);

			Person person = (Person) ois.readObject();
			System.out.println(person.name);
			ds.close();
		}
	}


/**���ݶ��� */
class Person implements Serializable{
	int age;
	String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
}	