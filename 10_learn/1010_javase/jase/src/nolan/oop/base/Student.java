package nolan.oop.base;

public class Student {
	int id;
	String name;
	String gender;
	int score01 ;
	int score02 ;
	int score03 ;
	String university;
	
	public void study(){
		System.out.println(name + "正在学习中...");
	}
	
	public void eat(){
		System.out.println(name + "正在吃饭...");
	}
	
	public void sleep(){
		System.out.println(name + "正在睡觉...");
	}
	
	public Student(){  //构造方法：不能写返回类型。方法名必须和类名保持一致！
		System.out.println("创建一个学生对象");
	}
}
