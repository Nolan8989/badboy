package norlando.thread.create;
/**
 * ѧϰʹ�ü̳�Thread������ʵ�ֶ��̡߳�
 * @author Administrator
 *
 */
public class TestThread01 extends Thread{
	
	public void run(){
		for(int i=1; i<100; i++){
			System.out.println(this.getName() + ":" + i);//getName()
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread01 tt1 = new TestThread01();
		tt1.start();//�����߳�.
		TestThread01 tt2 = new TestThread01();
		tt2.start();
	}

}
