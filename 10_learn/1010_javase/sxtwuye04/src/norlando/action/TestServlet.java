package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String str = request.getParameter("username");
		System.out.println(str);
		
		
		String[] str2 =request.getParameterValues("username");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		
	
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
