package norlando.thread.create;
/**
 * 1�������߳�  ʹ�þ�̬�������ģʽ
 *  1)����ʵ��ɫ Ŀ��
 * 
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class WebApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʵ��ɫ Ŀ��
		Runnable target =new Web12306();
		//�����ɫ Thread +��ʵ��ɫ������
		Thread proxy1 =new Thread(target,"��ţA");
		Thread proxy2 =new Thread(target,"·�˼�"); 
		//������Ϊ
		proxy1.start(); //�����߳�
		proxy2.start();
	}

}
