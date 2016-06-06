package norlando.oop.base;

/*
 * ʹ����Ϲ�ϵ��ʾ���Ͷ���
 * ���⣺1.���������dog������new Animal2������ô��Animal2 ����dog��
 * 		����dog������Dog��Animal2 animal)�Ĺ��췽��,��New�����Ķ��󴫸�animal;
 */
public class TestHas组合关系 {

	public static void main(String[] args) {
// 		TODO Auto-generated method stub
		Animal3  animal = new Animal3();
		Dog3  d = new Dog3(animal);
//		Dog3  d = new Dog3(new Animal3());
		System.out.println(d.animal.ear);
		d.animal.breath();
		d.animal.run();
		
	}

}


class Animal3 {
	String eye;
	String nose;
	String ear;
	
	public void breath(){
		System.out.println("������");
	}	
	
	public void run(){
		System.out.println("�������ܣ�");
	}
	

}

class Dog3 {
	Animal3 animal ;

	public Dog3(Animal3 animal){
		this.animal=animal;
	}
	
}

