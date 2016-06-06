package norlando.thread.staus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestThreadSleep implements Runnable{
	
	
	@Override
	public void run() {
		
		Date d = new Date();
		long nowtime = d.getTime();
		Date ld = new Date(nowtime + 10*1000);
		DateFormat  df = new SimpleDateFormat("hh:mm:ss");
		// TODO Auto-generated method stub
		while(true){
			Date d2  = new Date(d.getTime() + 1000);
			String str = df.format(d2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadSleep tts = new TestThreadSleep();
		
	}
}
