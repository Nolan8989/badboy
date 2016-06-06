package norlando.oop.base;



/**
 * �����ڴ����
 * @author Administrator
 *
 */
public class Test内存分析 {
	
	static int a = 10;
	
	public static void main(String[] args) {
		
//		int hang = 1+(int)(Math.random()*8);
//		int lie = 1+(int)(Math.random()*8);
//		System.out.println("�У�"+hang+"�У�"+lie);
		
		
		Teacher t = new Teacher();
		t.id=300;
		t.name="�ϸ�";
		t.sayHello();
		
		Computer c = new Computer();
		c.brand = "������";
		
		t.com = c;
		
		t.com.brand="������";
		System.out.println(c.brand); 
		
		
		
	}
}

/*
	1. java Test2
	2. JVM���classpath��Ѱ��Test2.class�����ҽ��м��أ����ص��������С�
	3. ��ʼѰ��main��ڡ�
	4. ����Teacher��
	

*/