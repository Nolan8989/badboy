package norlando.thread.create;

public class TestThreadCiycle implements Runnable{
	boolean flag = true;
	String name = null;
	
	
	
	public TestThreadCiycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestThreadCiycle(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(flag){
			System.out.println(name + i++);
		}
	}
	
	public void setFlag() {
		this.flag = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadCiycle ra = new TestThreadCiycle("ddd");
		Thread td = new Thread(ra);
		td.start();
		
		for(int i=0;i<1000;i++){
			System.out.println("mainÏß³Ì" + i);
		}
		
		ra.setFlag();
	}
	

}
