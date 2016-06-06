package norlando.thread.produce1;
/**
 * ���� �źŵƷ�
 * @author Administrator
 *
 */
public class Movie {
	private String pic;
	//true �����������������ѣ������ߵȴ�
	//false �������ѣ����������������ߵȴ�
	private boolean flag =true;
	
	//����  ����
	public synchronized void play(String pic){
		if(!flag){ //�������ѣ����������������ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��������
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.pic =pic;
		//�ı��ʶ
		this.flag =false;
		//֪ͨ����		
		this.notifyAll();
	}
	
	//�ۿ�  ����
	public synchronized void watch(){
		if(flag){ //�����������������ѣ������ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//��������
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println(this.pic);
		//�ı��ʶ
		this.flag =true;
		//֪ͨ����		
		this.notifyAll();
	}
}
