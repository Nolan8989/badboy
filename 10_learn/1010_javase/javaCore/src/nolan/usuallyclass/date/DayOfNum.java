package nolan.usuallyclass.date;

import   java.util.GregorianCalendar;   
  /*  
   * �����������ڵ�ʱ���
   */
  public   class   DayOfNum   {   
	  public   DayOfNum() {   
		  GregorianCalendar   c1   =   new   GregorianCalendar(1983,2,18,15,00,00);   
		  GregorianCalendar   c2   =   new   GregorianCalendar(2013,11,16,00,00);   
		  double   timeLong=c2.getTimeInMillis()-c1.getTimeInMillis();   
		  float   yearNum=(float)((((timeLong/1000)/3600)/24)/365);   
		  int   dayNum=(int)(((timeLong/1000)/3600)/24);   
		  System.out.println("��ָ��������ʱ���֮��������ǣ�"+dayNum);   
		  System.out.println("��ָ��������ʱ���֮��������ǣ�"+yearNum);   
		  }   
	  public   static   void   main(String[]   args){   
		  new   DayOfNum();   
	  }   
  }   
