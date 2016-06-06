package norlando.thread.staus;
/**
 * ����:ȷ��һ�������һ������
 * @author Administrator
 *
 */
public class SleepDemo03 {
	public static void main(String[] args) {
		new Thread(new TestThread(100)).start();
		new Thread(new TestThread(200)).start();
	}
}
//ģ����ʱ
class TestThread implements Runnable{
	private int time;
	public TestThread() {
	}
	public TestThread(int time) {
		super();
		this.time = time;
	}
	@Override
	public void run() {
		System.out.println(Singleton2.getInstance(time));
	}
	
}



/**
 * ����ʽ
 * 1��������˽�л�
 * 2������һ��˽�еľ�̬����  
 * 3���ṩһ�������ľ�̬�������ʸ�����
 * @author Administrator
 *
 */
class Singleton2{
	//������˽�л�
	private Singleton2(){		
	}
	//����һ��˽�еľ�̬���� ʵ�����ö���
	private static Singleton2 instance;
	//�ṩһ�������ľ�̬�������ʸ�����
	public static  Singleton2 getInstance(int time){
		if(null==instance){
			try {
				//ģ����ʱ���Ŵ����Ŀ�����
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance =new Singleton2();
		}
		return instance;
	}
}





/**
 * û���κ�����ĵ���:����ʽ
 * 1��������˽�л�
 * 2������һ��˽�еľ�̬���� ʵ�����ö���
 * 3���ṩһ�������ľ�̬�������ʸ�����
 */
class Singleton1 {
	//������˽�л�
	private Singleton1(){		
	}
	//����һ��˽�еľ�̬���� ʵ�����ö���
	private static Singleton1 instance=new Singleton1();
	//�ṩһ�������ľ�̬�������ʸ�����
	public static  Singleton1 getInstance(){
		return instance;
	}
	
}

