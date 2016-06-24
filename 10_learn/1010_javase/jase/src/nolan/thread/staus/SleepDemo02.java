package nolan.thread.staus;


/**
 * 模拟延时:加入同步 线程安全（多个线程访问同一个资源）
 * @author Administrator
 *
 */
public class SleepDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//真实角色 目标
		Runnable target =new Web12306();
		//代理角色 Thread +真实角色的引用
		Thread proxy1 =new Thread(target,"黄牛A");
		Thread proxy2 =new Thread(target,"路人甲"); 
		//代理行为
		proxy1.start(); //启动线程
		proxy2.start();
	}

}
class Web12306 implements Runnable  {
	private int tickets =20; 
	private boolean flag =true;
	@Override
	public void run() {
		while(flag){			
			if(tickets>=0){
				try {
					//模拟延时
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->抢票"+tickets--);
			}else{
				flag =false;
			}
			
		}
	}

}

