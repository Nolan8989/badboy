package norlando.thread.create;

public class Tortoise extends Thread {
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("tortoise-->"+i+"-->step");
		}
	}
	

}
