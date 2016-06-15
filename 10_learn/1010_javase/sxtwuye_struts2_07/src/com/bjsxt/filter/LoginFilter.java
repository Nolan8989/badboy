package com.bjsxt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bjsxt.po.User;

public class LoginFilter implements  Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		request.getParameter("cmd");
		
		
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 =(HttpServletResponse) response;
		HttpSession session = request2.getSession();
		String servletPath = request2.getServletPath();
		System.out.println(servletPath);
		User user = (User) session.getAttribute("user");
		if(user!=null||"/login.jsp".equals(servletPath)||"/image.jsp".equals(servletPath)||"/loginServlet.action".equals(servletPath)){
			filterChain.doFilter(request2, response2);
			
		}else{
			
			response2.sendRedirect(request2.getContextPath()+"/login.jsp");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
