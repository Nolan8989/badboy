package nolan.thread.staus;


/**
 * ģ����ʱ:����ͬ�� �̰߳�ȫ������̷߳���ͬһ����Դ��
 * @author Administrator
 *
 */
public class SleepDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʵ��ɫ Ŀ��
		Runnable target =new Web12306();
		//�����ɫ Thread +��ʵ��ɫ������
		Thread proxy1 =new Thread(target,"��ţA");
		Thread proxy2 =new Thread(target,"·�˼�"); 
		//������Ϊ
		proxy1.start(); //�����߳�
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
					//ģ����ʱ
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->��Ʊ"+tickets--);
			}else{
				flag =false;
			}
			
		}
	}

}

