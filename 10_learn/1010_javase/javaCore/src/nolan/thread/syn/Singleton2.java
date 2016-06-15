package nolan.thread.syn;
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
	//˫��� double checking.... ��߷��ʵ�����
	public static  Singleton2 getInstance1(int time){
		
		if(null==instance){
			synchronized(Singleton2.class){
				//b c d			
				if(null==instance){
					synchronized(Singleton2.class){
						try {
							//ģ����ʱ���Ŵ����Ŀ�����
							Thread.sleep(time);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						instance =new Singleton2();
					}
				}
			}
		}
		
		return instance;
		
	}
	
	
	//�ṩһ�������ľ�̬�������ʸ�����
	public static  Singleton2 getInstance2(int time){	
		// b c d 
		synchronized(Singleton2.class){
			//a
			if(null==instance){
				//b
					try {
						//ģ����ʱ���Ŵ����Ŀ�����
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				instance =new Singleton2();
			}//a-->
			return instance;
		}
	}
}