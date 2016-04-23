package norlando.oop.base;
/*
 * 测试继承。
 * 结论：子类继承父类即继承了父类（除了构造器和用Private修饰方法或变量）的一切!!
 * 好处：建模、减少重复代码、提高代码复用性；
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
	
	public void grewBone(){
		System.out.println("啃骨头！");
	}
	
}

class Cat extends Animal {
	
	public void catchMouse(){
		System.out.println("抓老鼠!");
	}
}

class Human extends Animal {
	
	
	
	public void think(){
		System.out.println("我在思考！");
	}
	
}
