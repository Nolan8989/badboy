package nolan.thread.staus;
/**
 * 单例:确保一个类仅有一个对象
 * @author Administrator
 *
 */
public class SleepDemo03 {
	public static void main(String[] args) {
		new Thread(new TestThread(100)).start();
		new Thread(new TestThread(200)).start();
	}
}
//模拟延时
class TestThread implements Runnable{
	private int time;
	public TestThread() {
	}
	public TestThread(int time) {
		super();
		this.time = time;
	}
	@Override
	public void run() {
		System.out.println(Singleton2.getInstance(time));
	}
	
}



/**
 * 懒汉式
 * 1、构造器私有化
 * 2、设置一个私有的静态属性  
 * 3、提供一个公共的静态方法访问该属性
 * @author Administrator
 *
 */
class Singleton2{
	//构造器私有化
	private Singleton2(){		
	}
	//设置一个私有的静态属性 实例化该对象
	private static Singleton2 instance;
	//提供一个公共的静态方法访问该属性
	public static  Singleton2 getInstance(int time){
		if(null==instance){
			try {
				//模拟延时，放大发生的可能性
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance =new Singleton2();
		}
		return instance;
	}
}





/**
 * 没有任何问题的单例:饿汉式
 * 1、构造器私有化
 * 2、设置一个私有的静态属性 实例化该对象
 * 3、提供一个公共的静态方法访问该属性
 */
class Singleton1 {
	//构造器私有化
	private Singleton1(){		
	}
	//设置一个私有的静态属性 实例化该对象
	private static Singleton1 instance=new Singleton1();
	//提供一个公共的静态方法访问该属性
	public static  Singleton1 getInstance(){
		return instance;
	}
	
}

