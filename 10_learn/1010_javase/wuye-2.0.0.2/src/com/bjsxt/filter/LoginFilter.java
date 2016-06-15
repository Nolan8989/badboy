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
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		System.out.println(this.getClass());
		request.getParameter("cmd");
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse =(HttpServletResponse) response;
		HttpSession session = httpServletRequest.getSession();
		String servletPath = httpServletRequest.getServletPath();
		System.out.println(servletPath);
		User user = (User) session.getAttribute("user");
		if(user!=null||"/login.jsp".equals(servletPath)||"/image.jsp".equals(servletPath)||"/loginServlet.action".equals(servletPath)){
			filterChain.doFilter(httpServletRequest, httpServletResponse);
		}else{
			httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/login.jsp");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println(this.getClass()+"=============init()");
	}

}
