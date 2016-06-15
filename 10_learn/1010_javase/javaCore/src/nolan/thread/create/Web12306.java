package nolan.thread.create;
/**
 * Ä£ÄâÊÛÆ±:
 * @author Administrator
 *
 */
public class Web12306 implements Runnable  {
	private int tickets =100; 
	@Override
	public void run() {
		while(true){
			if(tickets<=0){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"-->ÇÀÆ±"+tickets--);
			
		}
	}

}
