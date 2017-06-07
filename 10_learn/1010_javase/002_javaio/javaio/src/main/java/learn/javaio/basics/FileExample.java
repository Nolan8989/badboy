package learn.javaio.basics;
import java.io.*;
import java.util.Properties;  
   
 public class FileExample{  
     public static void main(String[] args) {  
       
        createFile();  
    }  
   
  /** 
   * 文件处理示例 
    */  
   public static void createFile() {  
	   
	   String pathStrbegin = "F:/ATOS/was_apon2/sourcecode/trunk/liferay-portal-6.2.10.1-ee-ga1/tomcat-7.0.42/webapps/";
	   String pathStrend = "/WEB-INF/";
	   String[] project = {
			  "badge-portlet",
//			   "resources-importer-web-master",
//			   "vgc-apon-2-columons-layouttpl",
			   "vgc-apon-audit-trail-log-portlet",
			   "vgc-apon-business-card-portlet",
			   "vgc-apon-business-trip-portlet",
			   "vgc-apon-company-car-portlet",
			   "vgc-apon-delegation-portlet",
			   "vgc-apon-e-closing-portlet",
			   "vgc-apon-e-epa-portlet",
			   "vgc-apon-e-invitation-application-portlet",
			   "vgc-apon-e-leave-portlet",
			   "vgc-apon-e-onboarding-portlet",
			   "vgc-apon-e-transfer-portlet",
			   "vgc-apon-file-management-portlet",
			   "vgc-apon-furniture-portlet",
//			   "vgc-apon-global-configuration-hook",
//			   "vgc-apon-global-ext",
			   "vgc-apon-global-management-portlet",
			   "vgc-apon-headcount-portlet",
//			   "vgc-apon-homepage-layouttpl",
			   "vgc-apon-homepage-portlet",
			   "vgc-apon-it-equipment-portlet",
			   "vgc-apon-my-approval-portlet",
			   "vgc-apon-my-submissions-portlet",
			   "vgc-apon-position-role-management-portlet",
			   "vgc-apon-role-management-portlet",
			   "vgc-apon-sap-apondata-handler-portlet",
			   "vgc-apon-sapdata-from-sap-hr-portlet",
			   "vgc-apon-seat-office-portlet",
			   "vgc-apon-settings-navigation-portlet",
//			   "vgc-apon-theme",
			   "vgc-apon-users-list-portlet",
			   "vgcapon-portlet"};
	   
	   
	/*   byte[] buffer=new byte[512];   //一次取出的字节数大小,缓冲区大小  
	     int numberRead=0;  
	     FileInputStream copyinput=null;  
	     FileOutputStream copyout =null;  */
	   
	   
		  
	     
	   
	   
	   for(int i = 0 ; i<project.length; i++){
		   String sonarModels = "";
		   String curreFileName = project[i];
		   String filePath = "";
		   String curreComponentJavaModuel = curreFileName+"-java-module";
		   String curreComponentWebModuel = curreFileName+"-web-module";
		   
		   sonarModels+=curreComponentJavaModuel;//+","+curreComponentWebModuel+",";
		   
		   Properties prop = new Properties();
		   prop.put("sonar.projectKey", curreFileName+"-v6.2.10.1");
		   prop.put("sonar.projectName", curreFileName+"-v6.2.10.1");
		   prop.put("sonar.projectVersion", "6.2.10.1");
		   prop.put("sonar.sourceEncoding", "UTF-8");
		   
		   
		   
//		   if(curreFileName.equals("resources-importer-web-master")){
//			   path = "F:\\ATOS\\was_apon2\\sourcecode\\trunk\\liferay-plugins-sdk-6.2.10.1\\webs\\resources-importer-web"+pathStrend;
//		   }else if (curreFileName.equals("vgc-apon-2-columons-layouttpl")){
//			   path = "F:\\ATOS\\was_apon2\\sourcecode\\trunk\\liferay-plugins-sdk-6.2.10.1\\layouttpl\\vgc-apon-2-columons-layouttpl"+pathStrend;
//		   }else if (curreFileName.equals("vgc-apon-global-configuration-hook")){
//			   path = "F:\\ATOS\\was_apon2\\sourcecode\\trunk\\liferay-plugins-sdk-6.2.10.1\\hooks\\vgc-apon-global-configuration-hook"+pathStrend;
//		   }else if (curreFileName.equals("vgc-apon-global-ext")){
//			   path = "F:\\ATOS\\was_apon2\\sourcecode\\trunk\\liferay-plugins-sdk-6.2.10.1\\ext\\vgc-apon-global-ext"+pathStrend;
//		   }else if (curreFileName.equals("vgc-apon-homepage-layouttpl")){
//			   path = "F:\\ATOS\\was_apon2\\sourcecode\\trunk\\liferay-plugins-sdk-6.2.10.1\\layouttpl\\vgc-apon-homepage-layouttpl"+pathStrend;
//		   }else if (curreFileName.equals("vgc-apon-theme")){
//			   path = "F:\\ATOS\\was_apon2\\sourcecode\\trunk\\liferay-plugins-sdk-6.2.10.1\\themes\\vgc-apon-theme"+pathStrend;
//		   }else{
			   filePath = pathStrbegin+curreFileName+pathStrend;
//		   }
		   
		   filePath += "sonar-project.properties";
		   //java module
		   prop.put(curreComponentJavaModuel+".sonar.projectName",curreComponentJavaModuel);
		   prop.put(curreComponentJavaModuel+".sonar.language","java");
		   prop.put(curreComponentJavaModuel+".sonar.sources",".");
		   prop.put(curreComponentJavaModuel+".sonar.projectBaseDir","src");
		   prop.put(curreComponentJavaModuel+".sonar.binaries","../classes");
		   if(curreFileName.equalsIgnoreCase("vgc-apon-business-trip-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/business/trip/model/impl/*Model*.java,com/business/trip/service/base/*.java,com/business/trip/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-audit-trail-log-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/audit/trail/model/impl/*Model*.java,com/audit/trail/service/base/*.java,com/audit/trail/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-business-card-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/businesscard/model/impl/*Model*.java,com/businesscard/service/base/*.java,com/businesscard/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-company-car-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/company/car/model/impl/*Model*.java,com/company/car/service/base/*.java,com/company/car/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-e-closing-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/e/closing/model/impl/*Model*.java,com/e/closing/service/base/*.java,com/e/closing/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-e-epa-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/epa/model/impl/*Model*.java,com/epa/service/base/*.java,com/epa/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-e-invitation-application-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/e/invitation/application/model/impl/*Model*.java,com/e/invitation/application/service/base/*.java,com/e/invitation/application/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-e-leave-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/e/leave/model/impl/*Model*.java,com/e/leave/service/base/*.java,com/e/leave/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-e-onboarding-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/e/onboarding/model/impl/*Model*.java,com/e/onboarding/service/base/*.java,com/e/onboarding/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-e-transfer-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/e/transfer/model/impl/*Model*.java,com/e/transfer/service/base/*.java,com/e/transfer/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-file-management-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/file/management/model/impl/*Model*.java,com/file/management/service/base/*.java,com/file/management/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-furniture-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/furniture/model/impl/*Model*.java,com/furniture/service/base/*.java,com/furniture/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-delegation-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/delegation/model/impl/*Model*.java,com/delegation/service/base/*.java,com/delegation/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-global-management-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/global/management/model/impl/*Model*.java,com/global/management/service/base/*.java,com/global/management/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-headcount-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/headcount/model/impl/*Model*.java,com/headcount/service/base/*.java,com/headcount/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-homepage-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/home/page/model/impl/*Model*.java,com/home/page/service/base/*.java,com/home/page/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-it-equipment-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/it/equipment/model/impl/*Model*.java,com/it/equipment/service/base/*.java,com/it/equipment/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-my-approval-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/my/approval/model/impl/*Model*.java,com/my/approval/service/base/*.java,com/my/approval/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-my-submissions-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/my/submissions/model/impl/*Model*.java,com/my/submissions/service/base/*.java,com/my/submissions/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-position-role-management-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/position/role/management/model/impl/*Model*.java,com/position/role/management/service/base/*.java,com/position/role/management/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-role-management-portlet")){
			 //  prop.put(curreComponentJavaModuel+".sonar.exclusions",
			//		   "com/position/role/management/model/impl/*Model*.java,com/position/role/management/service/base/*.java,com/position/role/management/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-sap-apondata-handler-portlet")){
			     prop.put(curreComponentJavaModuel+".sonar.exclusions",
			   		   "com/vgc/apon/model/impl/*Model*.java,com/vgc/apon/service/base/*.java,com/vgc/apon/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-sapdata-from-sap-hr-portlet")){
			  // prop.put(curreComponentJavaModuel+".sonar.exclusions",
				//	   "com/vgc/apon/model/impl/*Model*.java,com/vgc/apon/service/base/*.java,com/vgc/apon/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-seat-office-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/seatoffice/model/impl/*Model*.java,com/seatoffice/service/base/*.java,com/seatoffice/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-settings-navigation-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/vgc/apon/model/impl/*Model*.java,com/vgc/apon/service/base/*.java,com/vgc/apon/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgc-apon-users-list-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/users/list/model/impl/*Model*.java,com/users/list/service/base/*.java,com/users/list/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("vgcapon-portlet")){
			   prop.put(curreComponentJavaModuel+".sonar.exclusions",
					   "com/vgc/apon/model/impl/*Model*.java,com/vgc/apon/service/base/*.java,com/vgc/apon/service/persistence/*.java");
		   }
		   else if (curreFileName.equalsIgnoreCase("badge-portlet")){
			    prop.put(curreComponentJavaModuel+".sonar.exclusions",
			   	   "com/liferay/badge/model/impl/*Model*.java,com/liferay/badge/service/*/*.java");
		   }
		   
		else{
			   prop.put(curreComponentJavaModuel+".sonar.exclusions","com/company/car/model/impl/*Model*.java,com/company/car/service/*/*.java");
		   }



		 //  prop.put(curreComponentWebModuel+".sonar.projectName",curreComponentWebModuel);
		 // prop.put(curreComponentWebModuel+".sonar.language","js");
		//   prop.put(curreComponentWebModuel+".sonar.sources",".");
		//   prop.put(curreComponentWebModuel+".sonar.projectBaseDir","../html");
		   
		//   try {
		   /* FileOutputStream out = new FileOutputStream(path);
		    prop.store(out, "Init properties");
		    out.close();*/
		    
		    
		//    copyinput=new FileInputStream("D:\\snaor02.bat");  
		//    copyout=new FileOutputStream(path+"snaor02.bat"); //如果文件不存在会自动创建  
	    //    while ((numberRead=copyinput.read(buffer))!=-1) {  //numberRead的目的在于防止最后一次读取的字节小于buffer长度，  
	    //    	copyout.write(buffer, 0, numberRead);       //否则会自动被填充0  
	    //    }  
		    
		    
		//   }catch(Exception e ){
		//	   e.printStackTrace();
		//	   System.out.println("faild: "+curreFileName +" ");
		//   }
	   
//	  System.out.println("sucess: "+path);
	   
 //  }  
	   
	   try{
		   prop.put("sonar.modules", sonarModels);
		    FileOutputStream out = new FileOutputStream(filePath);
		    prop.store(out, "Init properties");
		    out.close();
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   
 }  
   }
}