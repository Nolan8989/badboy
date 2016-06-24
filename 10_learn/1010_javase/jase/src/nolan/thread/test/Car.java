package nolan.thread.test;
/**
 *  抽象类不一定包含抽象方法，抽象方法一定存在于抽象类中
 *  抽象类不能直接实例化，由子类实现
 *  抽象类一定存在构造器，符合子类实例化规则
 *  
 *  实现+规范(抽象方法)的结合
 *  
 *  构造器:不是创建对象的，为创建对象服务的，初始化对象信息的
 *  
 *  
 *  发生多态: 仅限于 行为、方法， 动态绑定  运行期行为执行
 *  静态绑定:编译期行为
 *  属性不会发生多态、私有方法、final方法、静态方法
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
		car.run(); //发生多态
		car.getType();
	}
}
class Bmw extends Car{
	String type;
	@Override
	public void run() {
		System.out.println("。。。。。。。。");
	}
	
	public void getType(){
		System.out.println(type);
	}
	
}
