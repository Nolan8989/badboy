package nolan.thread.meth.app;

import nolan.thread.meth.mythread.Plus;
/**
 * 
 * @author andong
 *
 */
public class AppPlus {

	public void startPlus(){
		Thread thread =  new Plus();
		thread.start();
	}
	
	
	public static void main(String[] args) {
		AppPlus appPlus = new AppPlus();
		System.out.println("the method 'main'  is begin!!");
		appPlus.startPlus();
		System.out.println("the method 'main'  is done!");
		
	}
	
}
