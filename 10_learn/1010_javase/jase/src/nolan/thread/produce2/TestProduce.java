package nolan.thread.produce2;

public class TestProduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncStack ss = new SyncStack();
		Runnable r1 = new Shengchan(ss);
		Runnable r2 = new Xiaofei(ss);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}

class Mantou{
	int id ;
	public Mantou() {
		super();
	}

	
	public Mantou(int id) {
		super();
		this.id = id;
	}
}

class SyncStack{
	Mantou[] ms = new Mantou[10];
	int index;
	
	public synchronized void push(Mantou m){
		while(index == ms.length){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		ms[index] = m;
		index++;
	}
	
	public synchronized Mantou pop(){
		while(index == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return ms[index];
	}
}


class Shengchan implements Runnable{
	public Shengchan(SyncStack ss) {
		super();
		this.ss = ss;
	}
	SyncStack ss;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<20;i++){
			Mantou m = new Mantou(i);
			System.out.println("造了一馒头" + i);
			this.ss.push(m);
		}
	}
	
}

class Xiaofei implements Runnable{
	public Xiaofei(SyncStack ss) {
		super();
		this.ss = ss;
	}
	SyncStack ss;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<20;i++){
			System.out.println("消费了馒头" + i);
			this.ss.pop();
		}
	}
	
}
