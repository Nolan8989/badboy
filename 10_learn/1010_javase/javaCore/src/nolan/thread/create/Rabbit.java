package nolan.thread.create;
/**
 * ��д:�̳�+����ǩ����ͬ
 * ����ǩ��:ȷ��Ψһ�� ��������+�β��б�������˳�����ͣ�
 *  add(int,int)
 *  add(int)
 * 1��<=   ���෽��
 *  1)���������� ��������  void ������ͬ����������<=
 *  2)���쳣 :���ܶ����������������쳣
 * 2��>= ���η� ������ڵ��ڸ���  ˽�з�������
 * 
 * 
 * ʵ���߳� ʹ�ü̳�
 * 1������̳� Thread +��дrun()
 * 2�������߳�
 * @author Administrator
 *
 */
public class Rabbit extends Thread {
	
	/**
	 * ��дrun����
	 */
	public void run() {
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("rabbit-->"+i+"-->step");
		}
	}
	
	
	
}
