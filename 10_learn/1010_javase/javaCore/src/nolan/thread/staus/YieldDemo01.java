package nolan.thread.staus;

public class YieldDemo01  implements Runnable{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//新生状态
		YieldDemo01 demo =new YieldDemo01();
		//就绪
		new Thread(demo).start();		
		for(int i=0;i<100;i++){		
			Thread.sleep(200);
			if(i%25==0){
				Thread.yield(); //main线程 ,让出cpu调度
			}
			System.out.println(i+"-->.........");
		}
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("yield.....");
		}
	}

}
