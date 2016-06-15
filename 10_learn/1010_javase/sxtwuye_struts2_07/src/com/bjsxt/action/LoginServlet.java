package com.bjsxt.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bjsxt.po.User;

public class LoginServlet extends HttpServlet {

 

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
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String uname = request.getParameter("uname");
			String pwd = request.getParameter("pwd");
			String verifycode = request.getParameter("verifycode");
			HttpSession session = request.getSession();
			String rand = (String) session.getAttribute("rand");
			if (verifycode!=null&&!"".equals(verifycode)&&rand!=null&&rand.toLowerCase().equals(verifycode.toLowerCase())) {
				System.out.println("LoginServlet.doPost()");
				//处理登陆
				if("zs".equals(uname)&&"123123".equals(pwd)){
					User user = new User();
					user.setUname(uname);
					user.setPwd(pwd);
					session.setAttribute("user", user);
					response.sendRedirect("main.jsp");
					
//					response.setStatus(302);
//					response.addHeader("location", "main.jsp");
				}else{
					request.setAttribute("uname", uname);
					request.setAttribute("pwd", pwd);
					request.setAttribute("loginerror", "用户名或密码不对！");
					request.getRequestDispatcher("login.jsp").forward(request, response);
					
				}
				
			}else{
				request.setAttribute("uname", uname);
				request.setAttribute("pwd", pwd);
				request.setAttribute("errorcode", "验证码输入有误！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
			
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
