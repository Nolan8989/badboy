package norlando.thread.test;
/**
 *  �����಻һ���������󷽷������󷽷�һ�������ڳ�������
 *  �����಻��ֱ��ʵ������������ʵ��
 *  ������һ�����ڹ���������������ʵ��������
 *  
 *  ʵ��+�淶(���󷽷�)�Ľ��
 *  
 *  ������:���Ǵ�������ģ�Ϊ�����������ģ���ʼ��������Ϣ��
 *  
 *  
 *  ������̬: ������ ��Ϊ�������� ��̬��  ��������Ϊִ��
 *  ��̬��:��������Ϊ
 *  ���Բ��ᷢ����̬��˽�з�����final��������̬����
 * @author Administrator
 *
 */
public abstract class Car {
	String type;
	public  void run(){
		System.out.println("car.....");
	}
	public Car(){
		
	}
	
	public void getType(){
		System.out.println(type);
	}
	
	
	public static void main(String[] args) {
		Car car =new Bmw();
		car.type ="car";
		car.run(); //������̬
		car.getType();
	}
}
class Bmw extends Car{
	String type;
	@Override
	public void run() {
		System.out.println("����������������");
	}
	
	public void getType(){
		System.out.println(type);
	}
	
}
