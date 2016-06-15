package nolan.oop.keywords;
/*
 * 
 * super功能：通过super可以调用父类的构造器; 
 * 			普通方法也可以用super，没有顺序,可以随便调用；
 * 注意事项：	1.系统每次都在子类构造器里默认调用super()（这个无参数!!! ）;
 * 			2.子类的有参数构造方法可以通过super(参数列表)代替系统默认，由此可知说构造器里只有能有一个super();
 * 			3.如果父类只有一个有参数构造方法即没有无参数的构造器，子类不应该有无参数构造方法
 * （除非在子类无参数构造器中调用父类有参数构造器，并且预先为其赋值）,而且有参数的构造方法应该用有参数列表的super(参数列表)覆盖掉super();
 */


public class Super {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
	}
}



class Animal2 {
	String eye;
	String nose;
	String ear;
	
//	public Animal(){
//		System.out.println("Animal的无参数构造方法！");
//	}
	
	public Animal2(String eye,String ear){
		System.out.println("Animal的两个参数的构造方法");
	}
	
	public Animal2(String eye,String ear,String nose){
		System.out.println("Animal的三个参数的构造方法");
	}
	
	public void breath(){
		System.out.println("呼吸！");
	}	
	public void breath(int a){
		System.out.println("呼吸！");
	}	
	
	public void run(){
		System.out.println("动物再跑！");
	}
	
	
}

class Dog extends Animal2 {
	


	public Dog(){
		//super(); //这里默认调用了一个父类无参数构造方法；
		super("eye","ear");
		super.eye = "yello";
		System.out.println("创建一只狗！");
	}
	
	public Dog(String eye, String ear){
		//super(); //这里默认调用了一个父类无参数构造方法；
		super(eye,ear);
		System.out.println("DOG的两个参数构造方法");
	}
	
	public Dog(String eye, String ear,String nose){
		super(eye,ear);
		System.out.println("DOG的三个参数构造方法");
	}
	
	public void run(){
		super.breath();
		super.breath(18);
		super.run();
		System.out.println("狗狗再跑！");
	}
	
	public void grewBone(){
		
		System.out.println("啃骨头！");
	}
	
	
	
}


