package nolan.thread.create;
/**
 * 重写:继承+方法签名相同
 * 方法签名:确定唯一性 ，方法名+形参列表（个数、顺序、类型）
 *  add(int,int)
 *  add(int)
 * 1、<=   子类方法
 *  1)、返回类型 基本类型  void 必须相同；引用类型<=
 *  2)、异常 :不能对外声明超过父类异常
 * 2、>= 修饰符 必须大于等于父类  私有方法除外
 * 
 * 
 * 实现线程 使用继承
 * 1、子类继承 Thread +重写run()
 * 2、启动线程
 * @author Administrator
 *
 */
public class Rabbit extends Thread {
	
	/**
	 * 重写run方法
	 */
	public void run() {
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("rabbit-->"+i+"-->step");
		}
	}
	
	
	
}
