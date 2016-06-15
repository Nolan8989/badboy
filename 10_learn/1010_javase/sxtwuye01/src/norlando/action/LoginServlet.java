package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import norlando.entity.User;
@SuppressWarnings("all")
public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String verifycode = request.getParameter("verifycode");
//System.out.println("doPost()");
		HttpSession session = request.getSession();
		String rand = (String) session.getAttribute("rand");
		if(null != verifycode && !"".equals(verifycode) && null != rand && rand.toLowerCase().equals(verifycode.toLowerCase())){
			if("zs".equals(username)&&"123321".equals(password)){
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				session.setAttribute("user", user);
				response.sendRedirect("main.jsp");
				
			}else{
				request.setAttribute("username", username);
				request.setAttribute("password", password);
				request.setAttribute("error", "用户名或密码不对！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
				
//				response.setStatus(302);
//				response.addHeader("location", "main.jsp");
			}
		}else{
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.setAttribute("verifyerror", "验证码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}









