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
	* ��ø������ڵ��·�
	* @param dt ��������
	* @return int �·ݣ�1-12��
	* @throws NullPointerException ����������Ϊnull���׳��쳣��
	*/
	private  int getYF(java.util.Date dt)throws NullPointerException{
		if(dt==null){
			throw new NullPointerException("���ڲ���Ϊnull");
		}else{
			Calendar cld=Calendar.getInstance();
			cld.setTime(dt);
			return 1+cld.get(Calendar.MONTH);
		}
	}
	
	/**
	* ��ø������ڵ����
	* @param dt ��������
	* @return int ���
	* @throws NullPointerException ����������Ϊnull���׳��쳣��
	*/
	private int getNF(java.util.Date dt) throws NullPointerException{
		if(dt==null){
			throw new NullPointerException("���ڲ���Ϊnull");
		}else{
			Calendar cld=Calendar.getInstance();
			cld.setTime(dt);
			return cld.get(Calendar.YEAR);
		}
	}

	/**  
	* �����������ڵ�ʱ���
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
			  System.out.println("��ָ��������ʱ���֮��������ǣ�"+dayNum);   
			  System.out.println("��ָ��������ʱ���֮��������ǣ�"+yearNum);   
		}   
		  
		  
		  
		  
		  
		  
 }   

