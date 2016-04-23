package norlando.thread.create;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * �����߳�
 * 1���̶߳���
 * 2��ִ�е��ȷ��� ExecutorService,��ȡFuture����
 * @author Administrator
 *
 */
public class RaceApp {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws ExecutionException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Race rabbit =new Race(100);
		Race tortoise=new Race(150); 
		
		//ִ�е���
		ExecutorService  ser =Executors.newFixedThreadPool(2);
		//Future
		Future<Integer> result1 =ser.submit(rabbit);
		Future<Integer> result2 =ser.submit(tortoise);
		Thread.sleep(2000);
		//ֹͣ�߳�
		rabbit.setFlag(false);
		tortoise.setFlag(false);
		//��ȡֵ
		System.out.println(result1.get());
		System.out.println(result2.get());
		
		//ֹͣ���������
		ser.shutdownNow();
		
		
	}

}
