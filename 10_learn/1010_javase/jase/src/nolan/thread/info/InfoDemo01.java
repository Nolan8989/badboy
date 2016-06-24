package nolan.thread.info;
/**
 * 线程的信息
 * 1、isAlive :查看线程的状态
	2、静态方法  currentThread() 获取当前运行的线程
	3、设置名称 和获取名称   建议在线程启动前
     setName()
     getName()
 * @author Administrator
 *
 */
public class InfoDemo01 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//启动线程
		MyThread real =new MyThread();
		Thread t =new Thread(real,"线程A");
		t.setName("线程B");
		System.out.println("开始前："+t.isAlive());
		Thread.sleep(200);
		t.start();
		System.out.println("开始后："+t.isAlive());
		Thread.sleep(200);		
		System.out.println("结束前后："+t.isAlive());
		real.terminate();
		Thread.sleep(200);	
		System.out.println("结束后："+t.isAlive());
		//main线程的名称
		System.out.println(Thread.currentThread().getName());
	}

}
class MyThread implements Runnable{
	private boolean flag=true;
	@Override
	public void run() {
		int num =0;
		while(flag){
			System.out.println(Thread.currentThread().getName()+"-->"+num++);
		}
	}
	//结束线程的方法
	public void terminate(){
		this.flag =false;
	}
	
}