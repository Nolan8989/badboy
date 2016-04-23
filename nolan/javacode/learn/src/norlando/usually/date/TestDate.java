package norlando.usually.date;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		Date d = new Date();
		Date d2 = new Date(now);
		System.out.println("d2===>" + d2.toString());
		System.out.println("d===>" + d.toString());
		
		
		
		
	}
}

class MyDate {
	long fastTime;

	public MyDate() {
		this(System.currentTimeMillis());
	}

	public MyDate(long date) {
		fastTime = date;
	}

	public long getTime() {
		return fastTime;
	}

	public void setTime(long time) {
		fastTime = time;
	}
}
