package norlando.thread.produce1;
/**
 * 场景 信号灯法
 * @author Administrator
 *
 */
public class Movie {
	private String pic;
	//true 可以生产，不能消费，消费者等待
	//false 可以消费，不能生产，生产者等待
	private boolean flag =true;
	
	//播放  生产
	public synchronized void play(String pic){
		if(!flag){ //可以消费，不能生产，生产者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//可以生产
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.pic =pic;
		//改变标识
		this.flag =false;
		//通知消费		
		this.notifyAll();
	}
	
	//观看  消费
	public synchronized void watch(){
		if(flag){ //可以生产，不能消费，消费者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//可以消费
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println(this.pic);
		//改变标识
		this.flag =true;
		//通知生产		
		this.notifyAll();
	}
}
