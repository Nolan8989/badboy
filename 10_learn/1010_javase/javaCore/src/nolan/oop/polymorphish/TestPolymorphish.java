package nolan.oop.polymorphish;
/*
 * ��̬
 */

public class TestPolymorphish {
	
	public static void test(Animal a){   //Animal a = d;
		System.out.println("����˭���ܣ�");
		a.run();   //�˴��γɶ�̬����һ����ͬ�Ĵ��룬����ʱ���Զ�Ӧ���಻ͬ�ķ�����
		
		if(a instanceof Dog){//�ж�Dog�Ƿ��� ����a�����������������ࣻ
			Dog d = (Dog) a;
			d.lookDoor();
		}
		
		if (a instanceof Human) {
			Human h = (Human) a;
			h.think();
		}
		
	}
		
	
	//��̬������Ҫ�أ��̳С�������д����������ָ���������
	public static void main(String[] args) {
		Dog d = new Dog();
		test(d);
		
		Cat c = new Cat();
		test(c);
		
		Human h = new Human();
		test(h);
		
	}
}



class Animal {
	String eye;
	String nose;
	String ear;
	
	public void breath(){
		System.out.println("������");
	}	
	
	public void run(){
		System.out.println("�������ܣ�");
	}
}

class Dog extends Animal {
	
	public void run(){
		System.out.println("�������ܣ�");
	}
	
	public void lookDoor(){
		System.out.println("���ţ�");
	}
	
}

class Cat extends Animal {
	
	public void run(){
		System.out.println("è���ܣ�");
	}
}

class Human extends Animal {
	
	public void run(){
		System.out.println("������");
	}
	
	public void  think(){
		System.out.println("����˼����");
	}
	
}
