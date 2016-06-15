package nolan.thread.info;
/**
 * MAX_PRIORITY  最大值 10
 * MIN_PRIORITY  最小值1
 * NORMAL_PRIORITY 中间值 5 (默认值)
	getPriority()
	setPriority();

出现的概率,不代表绝对的先后顺序
 * @author Administrator
 *
 */
public class InfoDemo02 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//默认值
		System.out.println(Thread.currentThread().getPriority());
		MyThread t1 =new MyThread();
		MyThread t2 =new MyThread();
		Thread proxy1 =new Thread(t1,"线程A");
		Thread proxy2 =new Thread(t2,"线程B");
		
		proxy1.setPriority(Thread.MIN_PRIORITY);
		proxy2.setPriority(Thread.MAX_PRIORITY);
		
		//启动线程
		proxy1.start();
		proxy2.start();
		
		Thread.sleep(1000);
		t1.terminate();
		t2.terminate();
		
		
	}

}
