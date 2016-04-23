package norlando.usually.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VisualCalendar {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = new GregorianCalendar();
		Date d = null;
		int today = c.get(Calendar.DATE);
		int mo = c.get(Calendar.MONTH) ;
		int year = c.get(Calendar.YEAR);
		try {
			d = df.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.setTime(d);
		c.set(Calendar.DATE, 1);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int l= c.get(Calendar.DAY_OF_WEEK)-1;
		for(int i=0;i<l;i++){
			System.out.print("\t");
		}
		while(c.get(Calendar.DATE)<=c.getActualMaximum(Calendar.DATE)){
			System.out.print(c.get(Calendar.DATE) + (((today == c.get(Calendar.DATE)&&mo == c.get(Calendar.MONTH) &&year == c.get(Calendar.YEAR) )?"*":"")+"\t"));
			if(c.get(Calendar.DAY_OF_WEEK)== 7){
//			if(c.get(Calendar.DAY_OF_WEEK)%Calendar.SATURDAY==0){
				System.out.println();
			}
			if(c.get(Calendar.DATE)==c.getActualMaximum(Calendar.DATE)){
				break;
			}
			c.add(Calendar.DATE, 1);
		}
		
	}

}
