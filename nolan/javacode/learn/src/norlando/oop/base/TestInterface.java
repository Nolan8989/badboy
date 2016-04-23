package norlando.oop.base;

public class TestInterface {
	public static void main(String[] args) {
		Flyable f = new Plane();
		
	}
}
 interface MyInterface {  //在这个文件里不能用public修饰。
	//接口内部只能定义：常量、抽象方法！
	/*public static final*/ String  SCHOOL = "尚学堂";
	
	/*public abstract*/ void run();
	void run2();	
}

interface Flyable {
	void fly();
}

interface Attack {
	void attack();
}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("飞机靠着发动机和翅膀飞！");
	}	
}

class Bullet implements Flyable,Attack {

	@Override
	public void fly() {
		System.out.println("子弹靠着火药飞！");
	}

	@Override
	public void attack() {
		System.out.println("袭击！");
	}
}
