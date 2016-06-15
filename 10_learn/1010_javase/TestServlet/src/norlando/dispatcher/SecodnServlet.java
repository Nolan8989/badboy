package norlando.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecodnServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		/*
		String c = request.getParameter("enen");
		System.out.println(c); //null
		*/
		System.out.println(a);
		System.out.println(b);
		
		
		int i1 = (Integer)request.getAttribute("enen"); // 返回的是object类型需要强转；
		int i2 = (Integer)request.getAttribute("entity");
		
		System.out.println(i1);
		System.out.println(i2);
		
	
	}

}
