package norlando.thread.create;
/**
 * 启动线程
 * 1、创建子类的对象
 * 2、调用start(),不能调用run方法（只是普通方法的调用，不是启动线程）
 * @author Administrator
 *
 */
public class RabbitApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t =new Thread();
		t.start(); //空方法
		Thread r =new Rabbit();
		r.start();
		
		//当引用只使用一次的情况可以使用  匿名 (没有引用),匿名对象只能访问一次
		new Tortoise().start();
		
	}

}
