package nolan.thread.staus;
/**
 * 合并线程
 * @author Administrator
 *
 */
public class JoinDemo01  implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JoinDemo01 demo =new JoinDemo01();
		Thread t =new Thread(demo);
		t.start();
		
		
		for(int i=0;i<1000;i++){		
			if(i==50){
				try {
					//合并线程 main线程等待 t线程执行完毕 
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
			System.out.println(i+"-->.........");
		}
	}

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			
			System.out.println("yield.....");
		}
	}


}
