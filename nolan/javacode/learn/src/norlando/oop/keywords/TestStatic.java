package norlando.oop.keywords;

/**
 * ����static���÷�
 *
 *��ͨ���ԣ���ͨ�����������ڶ��󡣵��ñ���ͨ������ȥ���ã�
 *��̬���ԡ���̬�������������࣬���Ա�����  ͨ������.��̬����(����)�����ã�
 *
 *static�����в���ʹ��this��
 */
public class TestStatic {
	public static void main(String[] args) {
		Human.headNum = 2;
		System.out.println(Human.headNum);
		Human.sleep();
	}
}


class Human {
	String name;
	int id;
	static int headNum=1;
	
	void eat(){
		sleep();
	}
	
	void eat3(){
		eat();
	}
	
	static void sleep(){
//		eat();                    //static�����в���ֱ�ӵ��÷�static�ı����ͷ���
//		System.out.println(this.name);    //static�����в���ʹ��this��
		System.out.println("zzzzz");
	}
	
}