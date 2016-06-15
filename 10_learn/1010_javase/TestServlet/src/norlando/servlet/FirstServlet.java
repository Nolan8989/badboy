package norlando.servlet;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//System.out.println("关闭");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		/*System.out.println("ex   first");
		String str = config.getInitParameter("l"); // 没验证返回空；
		System.out.println(str);
		 Enumeration<String> st2 = config.getInitParameterNames();
		 while(st2.hasMoreElements()){
			 System.out.println(config.getInitParameter(st2.nextElement()));
		 }*/
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			System.out.println("Servlet第一小程序");;
	}

	
}
