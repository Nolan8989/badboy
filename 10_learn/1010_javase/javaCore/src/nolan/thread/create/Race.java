package nolan.thread.create;

import java.util.concurrent.Callable;

/**
 * �˽⣺�����̵߳�����
 * 1��ʵ�� Callable�ӿڣ�+call����
 * @author Administrator
 *
 */
public class Race implements Callable<Integer>{
	
	private boolean flag =true;
	private int time;
	private int num;
	public Race() {
	}
	
	
	
	public Race(int time) {
		super();
		this.time = time;
	}



	@Override
	public Integer call() throws Exception {
		//�߳���
		while(flag){
			Thread.sleep(time);
			num++;
		}
		return num;
	}



	public boolean isFlag() {
		return flag;
	}



	public void setFlag(boolean flag) {
		this.flag = flag;
	}



	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}

	
	
	

}
