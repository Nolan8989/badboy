package norlando.thread.syn;
/**
 * 单例常用写法
 * 1、饿汉式
 *  1)类加载时立即初始化
 *  2)懒加载:调用时加载
 * 2、懒汉式
 *  
 * @author Administrator
 *
 */
public class Jvm1 {
	//私有的静态属性，同时创建对象
	private final static Jvm1 instance =new Jvm1();
	//构造器私有化
	private Jvm1(){
	}
	//提供静态方法
	public static Jvm1 instance(){
		return instance;
	}
}
class Jvm2 {
	//私有的静态类，创建私有的静态属性
	//使用时加载
	private static class JvmHolder{
		private final static Jvm2 instance =new Jvm2();
	}
	//构造器私有化
	private Jvm2(){
		
	}
	//提供静态方法 ，访问静态类的属性(类使用时才会加载，仅加载一次)
	public static Jvm2 instance(){
		return JvmHolder.instance;
	}
}

class Jvm3{
	//构造器私有化
	private Jvm3(){		
	}
	//设置一个私有的静态属性 实例化该对象
	private static Jvm3 instance;
	//提供一个公共的静态方法访问该属性 
	//双检查 double checking.... 提高访问的性能
	public static  Jvm3 getInstance1(){
		
		if(null==instance){
			synchronized(Jvm3.class){
				if(null==instance){
					synchronized(Jvm3.class){						
						instance =new Jvm3();
					}
				}
			}
		}		
		return instance;
		
	}
}