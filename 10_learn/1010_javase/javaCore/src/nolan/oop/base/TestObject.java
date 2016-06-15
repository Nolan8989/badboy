package nolan.oop.base;

public class TestObject {
	public static void main(String[] args) {
		Man m  = new Man("����");
		Man m2 = m;
		System.out.println(m);  //ֱ�Ӵ�ӡһ������Ĭ�Ͼ��ǵ�����toString������
		System.out.println(m.toString());
		System.out.println(m==m2);
		System.out.println(m.equals(m2));
		
	}
}


class Man {
	String name;
	
	public Man(String name){
		this.name = name;
	}
	
	public String toString() {
		return "����������"+name;
	}
	
}
