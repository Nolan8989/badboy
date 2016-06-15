package nolan.thread.create;
/**
 * 学习使用继承Thread抽象类实现多线程。
 * @author Administrator
 *
 */
public class TestThread01 extends Thread{
	
	public void run(){
		for(int i=1; i<100; i++){
			System.out.println(this.getName() + ":" + i);//getName()
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread01 tt1 = new TestThread01();
		tt1.start();//启动线程.
		TestThread01 tt2 = new TestThread01();
		tt2.start();
	}

}
