package norlando.oop.base;

public class Student {
	int id;
	String name;
	String gender;
	int score01 ;
	int score02 ;
	int score03 ;
	String university;
	
	public void study(){
		System.out.println(name + "����ѧϰ��...");
	}
	
	public void eat(){
		System.out.println(name + "���ڳԷ�...");
	}
	
	public void sleep(){
		System.out.println(name + "����˯��...");
	}
	
	public Student(){  //���췽��������д�������͡��������������������һ�£�
		System.out.println("����һ��ѧ������");
	}
}
