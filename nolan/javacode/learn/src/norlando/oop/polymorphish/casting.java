package norlando.oop.polymorphish;
/*
 * ����ת��
 */
public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a = new Animal2("����");
		Dog2 d = new Dog2("С�ڹ�","�ڵ�");
		a = new Dog2("��ƹ�","�Ƶ�");//�Զ�����ת�ͣ�Dog2 תΪ Animal2��
		System.out.println(a.name);
		
		if(a instanceof Animal2){
			Dog2 d2 = (Dog2)a; //�ֶ�����ת�ͣ�Animal2 תΪ Dog2;
			System.out.println(d2.furColor);
		}
		
		System.out.println(a instanceof Animal2);
		System.out.println(d instanceof Animal2);
		

	}

}

class Animal2{
	public String name;
	Animal2(String name){
		this.name =name;
	}
}

class Dog2 extends Animal2 {
	public String furColor;
	Dog2(String n,String c){
		super(n);
		this.furColor = c;
	}
}

class Cat2 extends Animal2{
	public String eyesColor;
	Cat2(String n,String c){
		super(n);
		this.eyesColor = c;
	}
}
