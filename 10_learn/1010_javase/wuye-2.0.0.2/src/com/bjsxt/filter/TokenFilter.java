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

public class TokenFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println(this.getClass());
//		约定好不能刷新重复提交
		String token = request.getParameter("token");
		if(token!=null){
			HttpSession session = ((HttpServletRequest)request).getSession();
			String t = (String) session.getAttribute("token");
			if(t!=null&&token!=null&&token.equals(t)){
				session.removeAttribute("token");
				chain.doFilter(request, response);
			}else {
				((HttpServletResponse)response).sendRedirect(((HttpServletRequest)request).getContextPath()+"/error.jsp");
			}
		}else{
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(this.getClass()+"=============init()");
	}

}
