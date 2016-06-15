package nolan.usuallyclass.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ������ʱ�������ַ�������֮���ת��
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");  //�����ʽ�ַ���
		Date d = df.parse("2011��3��19�� 10:23:45");
		System.out.println(d.getTime());
		System.out.println(d);
		System.out.println("#####################");
		
		DateFormat df2 = new SimpleDateFormat("yyyy��MM��dd��  ����ȵ�w��");
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
