package nolan.oop.keywords;
/* ����:
 * 		1.final���ξֲ�����Ա������������
 * 		2.final�����������ͣ�
 * 		3.final���η���������
 * �ܽ᣺
 * 		1.final�����ࣻ���಻�������࣬���ܱ��̳С�
 * 		2.���γ�Ա��������Ҫ���г�ʼ����һ�����˳�ֵ���Ͳ��ܸı䡣
 * 		3.������������ : ���õ�ֵ���ɸı䣬��Ӧ��������Կ��Ըı䡣
 * 		4.���γ�Ա�������÷������ܱ�������д�����ǿ��Ա��̳С����ء�
 * 		5.������෽����private final����ô��������ȫ���ɼ���������Զ����Լ���ͬ�����������������д���������ඨ�����Լ����·�����
 * ���⣺
 * 		1.���α�����ʱ��Ϊʲô��ҪҪ��static��
 */
public class Final {

	public static void main(String[] args) {
		final int MAX_WIDTH = 100;//����final���ξֲ�����
		final int b;
		b=3;		
		
		final Animal animal = new Animal();//����final������������
		//animal = new Animal(); final ���ε����ñ��������ٸı䣡
		animal.eye = "big";//��������Կ��Ըı䣡

		
		Animal1 animal1 = new Animal1();//����final���η������Ա����أ�
		animal1.shout(9);
		
	}
}

final class Animal { //final���ε���,���಻���Ա��̳У�
	String eye;
	String nose;
	//��Ա��������ɳ���
	public static final String EAR="ddd";
	final int age = 8 ;
	
	public void breath(){
		System.out.println("������");
	}	
	
	public final void run(){
		System.out.println("�������ܣ�");
	}
}

class Animal1{ 
	final  void shout(){
		System.out.println("����һ����");
	}
	
	 public void shout(int a){ //���Ա����أ�
		System.out.println("���½���һ����");
	}
}

class Dog1 extends Animal1{
	//public void shout(){} //��Ϊ����˷�����final���������಻����д�÷�����
	public void run(){
		super.shout();
	}
}