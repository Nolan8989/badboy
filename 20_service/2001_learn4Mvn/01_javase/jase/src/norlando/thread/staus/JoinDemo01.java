package norlando.thread.staus;
/**
 * �ϲ��߳�
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
					//�ϲ��߳� main�̵߳ȴ� t�߳�ִ����� 
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
