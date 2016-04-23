package norlando.oop.keywords;

/**
 * 测试static的用法
 *
 *普通属性，普通方法，从属于对象。调用必须通过对象去调用！
 *静态属性、静态方法，从属于类，可以被共享。  通过类名.静态属性(方法)来调用！
 *
 *static方法中不能使用this！
 */
public class TestStatic {
	public static void main(String[] args) {
		Human.headNum = 2;
		System.out.println(Human.headNum);
		Human.sleep();
	}
}


class Human {
	String name;
	int id;
	static int headNum=1;
	
	void eat(){
		sleep();
	}
	
	void eat3(){
		eat();
	}
	
	static void sleep(){
//		eat();                    //static方法中不能直接调用非static的变量和方法
//		System.out.println(this.name);    //static方法中不能使用this！
		System.out.println("zzzzz");
	}
	
}