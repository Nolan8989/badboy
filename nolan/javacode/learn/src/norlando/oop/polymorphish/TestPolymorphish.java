package norlando.oop.polymorphish;
/*
 * 多态
 */

public class TestPolymorphish {
	
	public static void test(Animal a){   //Animal a = d;
		System.out.println("测试谁在跑！");
		a.run();   //此处形成多态。这一段相同的代码，运行时可以对应子类不同的方法！
		
		if(a instanceof Dog){//判断Dog是否是 引用a的所属类或者类的子类；
			Dog d = (Dog) a;
			d.lookDoor();
		}
		
		if (a instanceof Human) {
			Human h = (Human) a;
			h.think();
		}
		
	}
		
	
	//多态的三个要素：继承、方法重写、父类引用指向子类对象
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
		System.out.println("呼吸！");
	}	
	
	public void run(){
		System.out.println("动物再跑！");
	}
}

class Dog extends Animal {
	
	public void run(){
		System.out.println("狗狗再跑！");
	}
	
	public void lookDoor(){
		System.out.println("看门！");
	}
	
}

class Cat extends Animal {
	
	public void run(){
		System.out.println("猫再跑！");
	}
}

class Human extends Animal {
	
	public void run(){
		System.out.println("人在溜达！");
	}
	
	public void  think(){
		System.out.println("我在思考！");
	}
	
}
