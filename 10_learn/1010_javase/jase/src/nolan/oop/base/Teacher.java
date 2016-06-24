package nolan.oop.base;



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
		System.out.println("正在上课");
	}
	public void sayHello(){
		System.out.println("大家好！上课啦！");
	}
	
}

class  Computer {
	String brand;
}