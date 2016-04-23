package norlando.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
* 基本数据类型+字符串
* DataInputStream   readXxx()
* DataOutputStream  writeXxx()
* 引用类型:
* 1、不是所有的对象都可以序列化  Serializable
* 2、不是所有的属性都需要序列化  transient
* 
* ObjectOutputStream :序列化  writeObject
* ObjectInputStream  :反序列化 readObject
* 
* @author Administrator
*
*/
public class TestObjectIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Person p = new Person("诺兰多",19,true);
		ObjectInputStream ois =null;
		ObjectOutputStream oos = null;
		
		try {
			//反序列化   先序列化 +  顺序一致
			fos = new FileOutputStream("d:/javas/resource/ObjectIO.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			fis = new FileInputStream("d:/javas/resource/ObjectIO.txt");
			ois = new ObjectInputStream(fis);
			Person s = (Person)ois.readObject();
			System.out.println("name:" + s.name +"age:" + s.age +"isMan:"+s.isMan);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}


class Person implements Serializable{
	String name;
	int age;
	boolean isMan;
	
	public Person(String name,int age,boolean isMan){
		super();
		this.name = name;
		this.age = age;
		this.isMan = isMan;
	}
	
}


