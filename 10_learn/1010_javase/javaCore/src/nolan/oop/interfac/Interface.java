package nolan.oop.interfac;
/**
 * 
 * //接口中不能有普通数据成员，只能够有静态的不能被修改的数据成员,static表示全局，final表示不可修改，可以不用static final 修饰，会隐式的声明为static和final
 * @author andong
 *
 */
public class Interface {
	public static void main(String[] args) {
		Flyable f = new Plane();
		
	}
}

 interface MyInterface {  //在这个文件里不能用public修饰。
	//接口内部只能定义：常量、抽象方法！
	/*public static final*/ String  SCHOOL = "华北科技学院";
	
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
