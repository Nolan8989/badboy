package norlando.thread.create;
/**
 * �����߳�
 * 1����������Ķ���
 * 2������start(),���ܵ���run������ֻ����ͨ�����ĵ��ã����������̣߳�
 * @author Administrator
 *
 */
public class RabbitApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t =new Thread();
		t.start(); //�շ���
		Thread r =new Rabbit();
		r.start();
		
		//������ֻʹ��һ�ε��������ʹ��  ���� (û������),��������ֻ�ܷ���һ��
		new Tortoise().start();
		
	}

}
