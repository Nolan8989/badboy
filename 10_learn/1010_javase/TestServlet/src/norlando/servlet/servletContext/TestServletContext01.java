package norlando.servlet.servletContext;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("all")

public class TestServletContext01 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		ServletContext sc = this.getServletContext();
		System.out.println("start");

/*		
		InputStream is = sc.getResourceAsStream("/001.txt");
		FileOutputStream fos = new FileOutputStream("c:/002.txt");
		int temp = 0 ;
		while((temp =is.read()) != -1){
			fos.write(temp);
		}
*/	
		/**
		InputStream is = null;
		Properties props = new Properties();
		is = ContextServlet.class.getClassLoader().getResourceAsStream("003.properties");
		//is = sc.getResourceAsStream("003.properties");
		props.load(is);
		String aa= (String)props.get("aa");
		System.out.println(aa);
		*/	
		
		
/*
		//getResourcePaths		
		Set<String> set = sc.getResourcePaths("/images");
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			response.getWriter().write("<img src=\""+ sc.getContextPath()+string+"\"/>");
			//System.out.println(sc.getContextPath()+string);
		}
*/		

		
/*
		//	3. 项目根路径：
		String s1 = sc.getContextPath();
		System.out.println(s1);
*/	
		
		//String st = sc.getInitParameter("koo");//读取web.xml里面加载的信息；
		// Enumeration<String> e = sc.getInitParameterNames();
		//System.out.println(st);
/*		
		//String str = sc.getRealPath("images/001.jpg");
		//System.out.println(str);
		//D:\apache-tomcat\apache-tomcat-6.0.14\webapps\TestServlet\images\001.jpg
*/
		
		
/*		
		ServletConfig c = this.getServletConfig();
		//String s1 = c.getServletName();
		//System.out.println(s1);
		
		 Enumeration e = c.getInitParameterNames();//测试失败了
		 while(e.hasMoreElements()){
			 String s2 = (String)e.nextElement();
			 System.out.println(s2);
		 }
*/
	}

}
