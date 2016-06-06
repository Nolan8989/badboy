package norlando.thread.staus;
/**
 * 1、终止:线程体正常执行完毕
 * 2、外部干涉
 *  1)、线程类 使用标识位
 *  2)、线程体关联该标识位
 *  3)、对外提供改变该标识的方法
 *  4)、外部根据条件调用该方法
 * 
 * @author Administrator
 *
 */
public class StopThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new Study()).start(); //就绪状态
		Study2 stu =new Study2();
		new Thread(stu).start();
		for(int i =0;i<1000;i++){
			if(i==500){
				stu.stop();
			}
			System.out.println(i+"-->一边聊qq");
		}
	}

}

class Study implements Runnable{
	@Override
	public void run() {
		//线程体终止
		for(int i=0;i<1000;i++){
			System.out.println("一边研究helloworld....");
		}
	}
	
}
class Study2 implements Runnable{
	private boolean isRunning =true;
	@Override
	public void run() {
		while(isRunning){
			System.out.println("拜读io源代码......");
		}
	}
	//对外提供改变该标识位的方法
	public void stop(){
		this.isRunning =false;
	}
}

