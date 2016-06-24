package nolan.thread.create;
/**
 * 1、启动线程  使用静态代理设计模式
 *  1)、真实角色 目标
 * 
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class WebApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//真实角色 目标
		Runnable target =new Web12306();
		//代理角色 Thread +真实角色的引用
		Thread proxy1 =new Thread(target,"黄牛A");
		Thread proxy2 =new Thread(target,"路人甲"); 
		//代理行为
		proxy1.start(); //启动线程
		proxy2.start();
	}

}
