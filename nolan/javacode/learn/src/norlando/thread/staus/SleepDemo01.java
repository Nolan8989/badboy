package norlando.thread.staus;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����10��
 * ����ʱ10��
 * @author Administrator
 *
 */
public class SleepDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����  -->��������
		Date nowTime =new Date(System.currentTimeMillis()+10*1000);
		long startTime =nowTime.getTime();
		while(true){
			//��ʾʱ��
			System.out.println(new SimpleDateFormat("hh:mm:ss").format(nowTime));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//��һ��
			 nowTime =new Date(nowTime.getTime()-1000);			
			if((nowTime.getTime()+10000)<=startTime){
				break;
			}
		}
		
		
	}
	public static void num(){
		//����10��
		int num =10;		
		while(true){
			try {
				System.out.println(num--);
				//main�߳�����  �ȴ�
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
