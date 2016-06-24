package nolan.thread.syn;


public class SingleApp {

	public static void main(String[] args) {
		new Thread(new TestThread(1000)).start();
		new Thread(new TestThread(2000)).start();
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
		System.out.println(Singleton2.getInstance1(time));
	}
	
}