package norlando.thread.info;
/**
 * �̵߳���Ϣ
 * 1��isAlive :�鿴�̵߳�״̬
	2����̬����  currentThread() ��ȡ��ǰ���е��߳�
	3���������� �ͻ�ȡ����   �������߳�����ǰ
     setName()
     getName()
 * @author Administrator
 *
 */
public class InfoDemo01 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//�����߳�
		MyThread real =new MyThread();
		Thread t =new Thread(real,"�߳�A");
		t.setName("�߳�B");
		System.out.println("��ʼǰ��"+t.isAlive());
		Thread.sleep(200);
		t.start();
		System.out.println("��ʼ��"+t.isAlive());
		Thread.sleep(200);		
		System.out.println("����ǰ��"+t.isAlive());
		real.terminate();
		Thread.sleep(200);	
		System.out.println("������"+t.isAlive());
		
		
		//main�̵߳�����
		System.out.println(Thread.currentThread().getName());
	}

}
class MyThread implements Runnable{
	private boolean flag=true;
	@Override
	public void run() {
		int num =0;
		while(flag){
			System.out.println(Thread.currentThread().getName()+"-->"+num++);
		}
	}
	//�����̵߳ķ���
	public void terminate(){
		this.flag =false;
	}
	
}