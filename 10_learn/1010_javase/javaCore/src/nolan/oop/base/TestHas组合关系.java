package nolan.oop.base;

/*
 * 使用组合关系表示狗和动物
 * 问题：1.如果不是在dog类里面new Animal2对象，怎么把Animal2 传给dog？
 * 		答：用dog带参数Dog（Animal2 animal)的构造方法,把New出来的对象传给animal;
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
		System.out.println("呼吸！");
	}	
	
	public void run(){
		System.out.println("动物在跑！");
	}
	

}

class Dog3 {
	Animal3 animal ;

	public Dog3(Animal3 animal){
		this.animal=animal;
	}
	
}

