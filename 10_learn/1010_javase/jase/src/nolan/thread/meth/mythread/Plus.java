package nolan.thread.meth.mythread;
/**
 * 
 * @author andong
 *
 */
public class Plus extends Thread {

	 @Override
	    public void run() {
		 int count= 0;
			for(int i=0;i<100;i++){
				try {
					Thread.sleep(20);
					count++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("comput is done !! result is "+count);
	    }
	
	
	
}
