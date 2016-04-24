package temp.text;

public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton2 sl = Singleton2.getInstance();
		sl.say();
		
	}

}

class Singleton{ //饿汉式
	private static Singleton instance = new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		return instance;
	}
	public void say(){
		System.out.println("我是饿汉式单例");
	}
}


class Singleton2{
	private static Singleton2 instance = null;
	private Singleton2(){
		
	}
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
		
	}
	public void say(){
		System.out.println("我是懒汉式单例");
	}
	
	
}
