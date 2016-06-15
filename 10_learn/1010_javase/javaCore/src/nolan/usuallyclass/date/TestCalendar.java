package nolan.usuallyclass.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = new GregorianCalendar();
		int today = c.get(Calendar.DATE);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.print(year + " ");
		System.out.print(month + 1 + " ");//一月是从零开始的。
		System.out.print(today);
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.MONTH)+1);//年
		System.out.println(c1.get(Calendar.YEAR));//年
		

		
	}

}
