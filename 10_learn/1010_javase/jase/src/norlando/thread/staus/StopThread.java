package norlando.thread.staus;
/**
 * 1����ֹ:�߳�������ִ�����
 * 2���ⲿ����
 *  1)���߳��� ʹ�ñ�ʶλ
 *  2)���߳�������ñ�ʶλ
 *  3)�������ṩ�ı�ñ�ʶ�ķ���
 *  4)���ⲿ�����������ø÷���
 * 
 * @author Administrator
 *
 */
public class StopThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new Study()).start(); //����״̬
		Study2 stu =new Study2();
		new Thread(stu).start();
		for(int i =0;i<1000;i++){
			if(i==500){
				stu.stop();
			}
			System.out.println(i+"-->һ����qq");
		}
	}

}

class Study implements Runnable{
	@Override
	public void run() {
		//�߳�����ֹ
		for(int i=0;i<1000;i++){
			System.out.println("һ���о�helloworld....");
		}
	}
	
}
class Study2 implements Runnable{
	private boolean isRunning =true;
	@Override
	public void run() {
		while(isRunning){
			System.out.println("�ݶ�ioԴ����......");
		}
	}
	//�����ṩ�ı�ñ�ʶλ�ķ���
	public void stop(){
		this.isRunning =false;
	}
}

