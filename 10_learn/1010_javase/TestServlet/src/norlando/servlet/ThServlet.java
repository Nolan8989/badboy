package norlando.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			String str = request.getRemoteAddr(); //客户端IP;
			
			
		/*
			request.setCharacterEncoding("utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			int age = Integer.parseInt(request.getParameter("age"));
			String[] strs = request.getParameterValues("favorite");
			
			//String str = new String(username.getBytes("iso8859-1"),"utf-8"); //解决中文的乱码问题。
			//System.out.println(str);
		*/
	}

}
