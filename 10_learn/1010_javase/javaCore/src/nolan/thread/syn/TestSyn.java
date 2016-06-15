package nolan.thread.syn;

public class TestSyn implements Runnable {


		private int tickets =20; 
		private boolean flag =true;
		@Override
		public void run() {
			while(flag){			
				test5();
				
			}
		}
		//线程安全 同步块
		//cd 
		public synchronized void test5(){		
			 //b
				if(tickets>=0){ 				
						try {
							//模拟延时
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
							System.out.println(Thread.currentThread().getName()+"-->抢票"+tickets--);
				}else{
					flag =false;
				}
			}//a-->
		
		//线程安全 同步块
		public void test4(){
			// c d 
			synchronized(this){
				//b
				if(tickets>=0){ //0
					
						try {
							//模拟延时
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
							System.out.println(Thread.currentThread().getName()+"-->抢票"+tickets--);
				}else{
					flag =false;
				}
			}//a -->
		}
		
		//范围过小,，线程不安全  
		// a b c d
		public void test3(){
			if(tickets>=0){ //1 
				//b c d				
				synchronized(this){
					//a 
					try {
						//模拟延时
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->抢票"+tickets--);
				}
			}else{
				flag =false;
			}
		}
		//同步属性  ，线程不安全  ,没有的锁全，同步部分
		public void test2(){
			synchronized((Integer)tickets){
				if(tickets>=0){
					try {
						//模拟延时
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->抢票"+tickets--);
				}else{
					flag =false;
				}
			}
		}
		
		//线程不安全 ，不能解决同步问题
		public void test1(){
			if(tickets>=0){
				try {
					//模拟延时
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->抢票"+tickets--);
			}else{
				flag =false;
			}
		}

		
		public static void main(String[] args) {
			//真实角色 目标
			Runnable target =new TestSyn();
			//代理角色 Thread +真实角色的引用
			Thread proxy1 =new Thread(target,"黄牛A");
			Thread proxy2 =new Thread(target,"路人甲"); 
			//代理行为
			proxy1.start(); //启动线程
			proxy2.start();
			new Thread(target,"黄牛c").start();
			new Thread(target,"黄牛d").start();
		}
	}