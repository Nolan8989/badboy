package nolan.oop.base;



/**
 * 测试内存分析
 * @author Administrator
 *
 */
public class Test内存分析 {
	
	static int a = 10;
	
	public static void main(String[] args) {
		
//		int hang = 1+(int)(Math.random()*8);
//		int lie = 1+(int)(Math.random()*8);
//		System.out.println("行："+hang+"列："+lie);
		
		
		Teacher t = new Teacher();
		t.id=300;
		t.name="老高";
		t.sayHello();
		
		Computer c = new Computer();
		c.brand = "外星人";
		
		t.com = c;
		
		t.com.brand="地球人";
		System.out.println(c.brand); 
		
		
		
	}
}

/*
	1. java Test2
	2. JVM会从classpath中寻找Test2.class，并且进行加载，加载到方法区中。
	3. 开始寻找main入口。
	4. 加载Teacher类
	

*/