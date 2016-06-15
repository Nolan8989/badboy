package nolan.thread.syn;
/**
 * ��������д��
 * 1������ʽ
 *  1)�����ʱ������ʼ��
 *  2)������:����ʱ����
 * 2������ʽ
 *  
 * @author Administrator
 *
 */
public class Jvm1 {
	//˽�еľ�̬���ԣ�ͬʱ��������
	private final static Jvm1 instance =new Jvm1();
	//������˽�л�
	private Jvm1(){
	}
	//�ṩ��̬����
	public static Jvm1 instance(){
		return instance;
	}
}
class Jvm2 {
	//˽�еľ�̬�࣬����˽�еľ�̬����
	//ʹ��ʱ����
	private static class JvmHolder{
		private final static Jvm2 instance =new Jvm2();
	}
	//������˽�л�
	private Jvm2(){
		
	}
	//�ṩ��̬���� �����ʾ�̬�������(��ʹ��ʱ�Ż���أ�������һ��)
	public static Jvm2 instance(){
		return JvmHolder.instance;
	}
}

class Jvm3{
	//������˽�л�
	private Jvm3(){		
	}
	//����һ��˽�еľ�̬���� ʵ�����ö���
	private static Jvm3 instance;
	//�ṩһ�������ľ�̬�������ʸ����� 
	//˫��� double checking.... ��߷��ʵ�����
	public static  Jvm3 getInstance1(){
		
		if(null==instance){
			synchronized(Jvm3.class){
				if(null==instance){
					synchronized(Jvm3.class){						
						instance =new Jvm3();
					}
				}
			}
		}		
		return instance;
		
	}
}