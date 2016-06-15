package nolan.usuallyclass.date;

import   java.util.GregorianCalendar;   
  /*  
   * 计算两个日期的时间差
   */
  public   class   DayOfNum   {   
	  public   DayOfNum() {   
		  GregorianCalendar   c1   =   new   GregorianCalendar(1983,2,18,15,00,00);   
		  GregorianCalendar   c2   =   new   GregorianCalendar(2013,11,16,00,00);   
		  double   timeLong=c2.getTimeInMillis()-c1.getTimeInMillis();   
		  float   yearNum=(float)((((timeLong/1000)/3600)/24)/365);   
		  int   dayNum=(int)(((timeLong/1000)/3600)/24);   
		  System.out.println("你指定的两个时间点之间的天数是："+dayNum);   
		  System.out.println("你指定的两个时间点之间的年数是："+yearNum);   
		  }   
	  public   static   void   main(String[]   args){   
		  new   DayOfNum();   
	  }   
  }   
