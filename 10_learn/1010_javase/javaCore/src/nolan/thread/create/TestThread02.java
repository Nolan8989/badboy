package nolan.thread.create;


/**
 * ѧϰʹ��ʵ�ֽӿ�Runnableʵ�ֶ��̡߳�
 * @author Administrator
 *
 */
public class TestThread02 implements Runnable{
	
	int threadId;
	
	public TestThread02(){
		
	}
	
	public TestThread02(int id){
		super();
		this.threadId = id;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<100;i++){
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new TestThread02(1),"��һ");
		Thread thread2 = new Thread(new TestThread02(2),"�϶�");
		thread1.start();
		thread2.start();
	}

}
