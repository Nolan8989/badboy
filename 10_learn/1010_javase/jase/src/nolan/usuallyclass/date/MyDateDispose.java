package nolan.usuallyclass.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDateDispose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateDispose mdd = new MyDateDispose();
		Date d = new Date();
		System.out.println(mdd.getYF(d));
	}
	
	/**
	* 获得给定日期的月份
	* @param dt 给定日期
	* @return int 月份（1-12）
	* @throws NullPointerException 如果参数年份为null，抛出异常。
	*/
	private  int getYF(java.util.Date dt)throws NullPointerException{
		if(dt==null){
			throw new NullPointerException("日期参数为null");
		}else{
			Calendar cld=Calendar.getInstance();
			cld.setTime(dt);
			return 1+cld.get(Calendar.MONTH);
		}
	}
	
	/**
	* 获得给定日期的年份
	* @param dt 给定日期
	* @return int 年份
	* @throws NullPointerException 如果参数年份为null，抛出异常。
	*/
	private int getNF(java.util.Date dt) throws NullPointerException{
		if(dt==null){
			throw new NullPointerException("日期参数为null");
		}else{
			Calendar cld=Calendar.getInstance();
			cld.setTime(dt);
			return cld.get(Calendar.YEAR);
		}
	}

	/**  
	* 计算两个日期的时间差
	*/
 
		  public void  DayOfNum	(int beginYear,int beginMonth, int beginDate,
				  			int beginHour,int beginMinute,int beginSecond,
				  			int overYear,int overMonth,int overDate,
				  			int overHour,int overMinute,int overSecond) {   
			  GregorianCalendar   c1   =   new   GregorianCalendar(beginYear,beginMonth,beginDate,beginHour,beginMinute,beginSecond);   
			  GregorianCalendar   c2   =   new   GregorianCalendar(overYear,overMonth,overDate,overHour,overMinute,overSecond);   
			  double   timeLong=c2.getTimeInMillis()-c1.getTimeInMillis();   
			  float   yearNum=(float)((((timeLong/1000)/3600)/24)/365);   
			  int   dayNum=(int)(((timeLong/1000)/3600)/24);   
			  System.out.println("你指定的两个时间点之间的天数是："+dayNum);   
			  System.out.println("你指定的两个时间点之间的年数是："+yearNum);   
		}   
		  
		  
		  
		  
		  
		  
 }   

