package norlando.oop.polymorphish;
/*
 * 测试转型
 */
public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a = new Animal2("动物");
		Dog2 d = new Dog2("小黑狗","黑的");
		a = new Dog2("大黄狗","黄的");//自动向上转型：Dog2 转为 Animal2；
		System.out.println(a.name);
		
		if(a instanceof Animal2){
			Dog2 d2 = (Dog2)a; //手动向下转型：Animal2 转为 Dog2;
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
