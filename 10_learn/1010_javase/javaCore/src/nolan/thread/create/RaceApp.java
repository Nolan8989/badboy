package nolan.thread.create;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 启动线程
 * 1、线程对象
 * 2、执行调度服务 ExecutorService,获取Future对象
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
		
		//执行调度
		ExecutorService  ser =Executors.newFixedThreadPool(2);
		//Future
		Future<Integer> result1 =ser.submit(rabbit);
		Future<Integer> result2 =ser.submit(tortoise);
		Thread.sleep(2000);
		//停止线程
		rabbit.setFlag(false);
		tortoise.setFlag(false);
		//获取值
		System.out.println(result1.get());
		System.out.println(result2.get());
		
		//停止服务调度器
		ser.shutdownNow();
		
		
	}

}
