package norlando.oop.base;



public class Teacher {
	public Teacher(){
		System.out.println("i'am a teacher");
	}
	
	int id ;
	String name;
	String sex;
	String clas;
	Computer com;
	
	public void teach(){
		System.out.println("�����Ͽ�");
	}
	public void sayHello(){
		System.out.println("��Һã��Ͽ�����");
	}
	
}

class  Computer {
	String brand;
}