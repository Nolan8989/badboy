package nolan.oop.interfac;
/**
 * 
 * //�ӿ��в�������ͨ���ݳ�Ա��ֻ�ܹ��о�̬�Ĳ��ܱ��޸ĵ����ݳ�Ա,static��ʾȫ�֣�final��ʾ�����޸ģ����Բ���static final ���Σ�����ʽ������Ϊstatic��final
 * @author andong
 *
 */
public class Interface {
	public static void main(String[] args) {
		Flyable f = new Plane();
		
	}
}

 interface MyInterface {  //������ļ��ﲻ����public���Ρ�
	//�ӿ��ڲ�ֻ�ܶ��壺���������󷽷���
	/*public static final*/ String  SCHOOL = "�����Ƽ�ѧԺ";
	
	/*public abstract*/ void run();
	void run2();	
}

interface Flyable {
	void fly();
}

interface Attack {
	void attack();
}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("�ɻ����ŷ������ͳ��ɣ�");
	}	
}

class Bullet implements Flyable,Attack {

	@Override
	public void fly() {
		System.out.println("�ӵ����Ż�ҩ�ɣ�");
	}

	@Override
	public void attack() {
		System.out.println("Ϯ����");
	}
}
