package norlando.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieCheckServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String autologin = request.getParameter("autologin");
		
		if("admin".equals(username)&&"1234".equals(password)){
			if("1".equals(autologin));
			Cookie c1 = new Cookie("username","admin");
			Cookie c2 = new Cookie("password","1234");
			c1.setMaxAge(3600*24*14);
			c2.setMaxAge(3600*24*14);
			response.addCookie(c1);
			response.addCookie(c2);
			response.sendRedirect("index.jsp");
		}else{
			request.setAttribute("error", "用户名密码错误，请重新登陆！");
			request.getRequestDispatcher("LoginServlet").forward(request,response);
		}
				
				
		
		
	}

}
