package nolan.oop.keywords;
/* 测试:
 * 		1.final修饰局部、成员变量、方法；
 * 		2.final修饰引用类型；
 * 		3.final修饰方法的重载
 * 总结：
 * 		1.final修饰类；该类不能有子类，不能被继承。
 * 		2.修饰成员变量：需要进行初始化，一旦赋了初值，就不能改变。
 * 		3.修饰引用类型 : 引用的值不可改变，对应对象的属性可以改变。
 * 		4.修饰成员方法：该方法不能被子类重写，但是可以被继承、重载。
 * 		5.如果父类方法是private final，那么对子类完全不可见，子类可以定义自己的同名方法，这个不是重写，而是子类定义了自己的新方法；
 * 问题：
 * 		1.修饰变量的时候，为什么需要要加static？
 */
public class Final {

	public static void main(String[] args) {
		final int MAX_WIDTH = 100;//测试final修饰局部变量
		final int b;
		b=3;		
		
		final Animal animal = new Animal();//测试final修饰引用类型
		//animal = new Animal(); final 修饰的引用变量不能再改变！
		animal.eye = "big";//对象的属性可以改变！

		
		Animal1 animal1 = new Animal1();//测试final修饰方法可以被重载；
		animal1.shout(9);
		
	}
}

final class Animal { //final修饰的类,此类不可以被继承！
	String eye;
	String nose;
	//成员变量定义成常量
	public static final String EAR="ddd";
	final int age = 8 ;
	
	public void breath(){
		System.out.println("呼吸！");
	}	
	
	public final void run(){
		System.out.println("动物再跑！");
	}
}

class Animal1{ 
	final  void shout(){
		System.out.println("叫了一声！");
	}
	
	 public void shout(int a){ //可以被重载！
		System.out.println("重新叫了一声！");
	}
}

class Dog1 extends Animal1{
	//public void shout(){} //因为父类此方法是final，所以子类不能重写该方法！
	public void run(){
		super.shout();
	}
}