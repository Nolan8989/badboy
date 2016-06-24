package nolan.usuallyclass.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试了时间对象和字符串对象之间的转换
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");  //定义格式字符串
		Date d = df.parse("2011年3月19日 10:23:45");
		System.out.println(d.getTime());
		System.out.println(d);
		System.out.println("#####################");
		
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日  本年度第w周");
		Date d2 = new Date();
		String str = df2.format(d2);
		System.out.println(str);
		System.out.println("#####################");
		
		DateFormat df3 = new SimpleDateFormat("yyyyMMddhhmmss");
		Date d3 = df3.parse("20130303142532");
		System.out.println(d3.getTime());
		System.out.println(d3);
		
		System.out.println("#####################");
		
		
		DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		d = df4.parse("2013-07-30 11:35:20");
		System.out.println(d);
 				
		
	}
}
