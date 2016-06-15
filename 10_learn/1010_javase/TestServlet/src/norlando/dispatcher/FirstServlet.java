package norlando.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a = request.getParameter("a");
		String b = request.getParameter("b");
//		String[] sts = request.getParameterValues("a");
		System.out.println(a);
		System.out.println(b);
		
		
		request.setAttribute("enen", 1);
		request.setAttribute("entity", 2);
		
		
		
		request.getRequestDispatcher("SecondServlet").forward(request,response);
		
	}

}
