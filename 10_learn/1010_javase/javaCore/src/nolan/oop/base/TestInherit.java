package nolan.oop.base;
/*
 * �̳С�
 * ���ۣ�����̳и��༴�̳��˸��ࣨ���˹���������Private���η������������һ��!!
 * �ô�����ģ�������ظ����롢��ߴ��븴���ԣ�
 * 
 */
public class TestInherit {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
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
	
	public void grewBone(){
		System.out.println("�й�ͷ��");
	}
	
}

class Cat extends Animal {
	
	public void catchMouse(){
		System.out.println("ץ����!");
	}
}

class Human extends Animal {
	
	
	
	public void think(){
		System.out.println("����˼����");
	}
	
}
