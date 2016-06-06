package norlando.thread.others;

import java.util.Timer;
import java.util.*;
//spring 任务调度 借助 Timer
//组件:Quartz  任务调度
public class TimeDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Timer task =new Timer();
		task.schedule(new MyTask(), 1000,1000);
	}

}
class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("helloworld...");
	}
	
}
