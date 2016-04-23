package norlando.thread.syn;
/**
 * 一手交钱，一手给helloworld
 * 过多的同步容易死锁
 * @author Administrator
 *
 */
public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		Code code =new Code();
		Money money =new Money();		
		code.setMoney(money);
		money.setCode(code);
		
		
		//启动线程
		new Thread(code).start();
		new Thread(money).start();
		
		
		Thread.sleep(1000);
		
		code.setFlag(false);
		money.setFlag(false);
		
	}
}
class Code implements Runnable{
	private Money money;
	private boolean flag=true;
	@Override
	public void run() {
		while(flag){
			say();
		}
	}
	public synchronized void say(){
		System.out.println("给我钱");
		money.give();
		
	}
	public synchronized void give(){
		money.say();
		System.out.println("给你hellowrold...");
	}
	
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}	
	
}
class Money  implements Runnable{
	private Code code;
	private boolean flag=true;
	@Override
	public void run() {
		while(flag){
			say();
		}
	}
	
	public synchronized void say(){
		System.out.println("给我代码....");
		code.give();
	}
	public synchronized void give(){
		code.say();		
		System.out.println("闹钱荒没有钱");		
	}
	
	
	
	
	public Code getCode() {
		return code;
	}
	public void setCode(Code code) {
		this.code = code;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	
}

