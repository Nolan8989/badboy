package nolan.oop.abstra;

/**
 * 抽象类与接口对比：
 * 相同：
 * 			1、接口和抽象类中的所有抽象方法不能有具体实现，必须被他们的子类实现。（如果抽象类的子类也是抽象类，可以被实现也可以继续用abstract修改而不实现）;
 * 区别：
 * 			1、抽象类的非抽象方法可以不被子类实现，接口定义的所有方法都要被实现类实现；
 * 
 * 
 * @author andong
 *
 */

public abstract class Fruit {

	/**
	 * 质量
	 */
	private  String weight ;
	
	
	abstract protected void setww();
	
	
	private void test(){
		
	}
		

	
	
	public static void main(String[] args) {
		System.out.println("abstract");
	}
}
