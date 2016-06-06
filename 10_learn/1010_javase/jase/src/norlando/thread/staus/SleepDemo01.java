package norlando.thread.staus;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 倒数10个
 * 倒计时10秒
 * @author Administrator
 *
 */
public class SleepDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//日期  -->长整形数
		Date nowTime =new Date(System.currentTimeMillis()+10*1000);
		long startTime =nowTime.getTime();
		while(true){
			//显示时间
			System.out.println(new SimpleDateFormat("hh:mm:ss").format(nowTime));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//下一秒
			 nowTime =new Date(nowTime.getTime()-1000);			
			if((nowTime.getTime()+10000)<=startTime){
				break;
			}
		}
		
		
	}
	public static void num(){
		//倒数10个
		int num =10;		
		while(true){
			try {
				System.out.println(num--);
				//main线程阻塞  等待
				Thread.sleep(1000);
				if(num<0){
					break;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
