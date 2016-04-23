package norlando.thread.syn;
/**
 * 懒汉式
 * 1、构造器私有化
 * 2、设置一个私有的静态属性  
 * 3、提供一个公共的静态方法访问该属性
 * @author Administrator
 *
 */
class Singleton2{
	//构造器私有化
	private Singleton2(){		
	}
	//设置一个私有的静态属性 实例化该对象
	private static Singleton2 instance;
	//提供一个公共的静态方法访问该属性 
	//双检查 double checking.... 提高访问的性能
	public static  Singleton2 getInstance1(int time){
		
		if(null==instance){
			synchronized(Singleton2.class){
				//b c d			
				if(null==instance){
					synchronized(Singleton2.class){
						try {
							//模拟延时，放大发生的可能性
							Thread.sleep(time);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						instance =new Singleton2();
					}
				}
			}
		}
		
		return instance;
		
	}
	
	
	//提供一个公共的静态方法访问该属性
	public static  Singleton2 getInstance2(int time){	
		// b c d 
		synchronized(Singleton2.class){
			//a
			if(null==instance){
				//b
					try {
						//模拟延时，放大发生的可能性
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				instance =new Singleton2();
			}//a-->
			return instance;
		}
	}
}