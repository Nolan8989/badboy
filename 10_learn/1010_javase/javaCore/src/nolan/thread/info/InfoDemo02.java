package nolan.thread.info;
/**
 * MAX_PRIORITY  ���ֵ 10
 * MIN_PRIORITY  ��Сֵ1
 * NORMAL_PRIORITY �м�ֵ 5 (Ĭ��ֵ)
	getPriority()
	setPriority();

���ֵĸ���,��������Ե��Ⱥ�˳��
 * @author Administrator
 *
 */
public class InfoDemo02 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Ĭ��ֵ
		System.out.println(Thread.currentThread().getPriority());
		MyThread t1 =new MyThread();
		MyThread t2 =new MyThread();
		Thread proxy1 =new Thread(t1,"�߳�A");
		Thread proxy2 =new Thread(t2,"�߳�B");
		
		proxy1.setPriority(Thread.MIN_PRIORITY);
		proxy2.setPriority(Thread.MAX_PRIORITY);
		
		//�����߳�
		proxy1.start();
		proxy2.start();
		
		Thread.sleep(1000);
		t1.terminate();
		t2.terminate();
		
		
	}

}
