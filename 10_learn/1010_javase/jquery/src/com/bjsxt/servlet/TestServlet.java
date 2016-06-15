package com.bjsxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			request.setCharacterEncoding("utf-8");
//			 response.setCharacterEncoding("utf-8");
			String method = request.getParameter("method");
			
			if("get".equals(method)){
				get(request , response);
			} else if("post".equals(method)){
				post(request , response);
			} else if("ajax".equals(method)){
				ajax(request , response);
			}

	}
	
	
	/**
	 * @param request
	 * @param response
	 */
	@SuppressWarnings("unused")
	private void get(HttpServletRequest request, HttpServletResponse response)  {
		

			try {
				
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String id       = request.getParameter("id");
				
				response.setContentType("text/html;charset=utf-8");				
				response.getWriter().write("鎴戞帴鏀跺埌鏁版嵁鍟�..");
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	/**
	 * @param request
	 * @param response
	 */
	private void post(HttpServletRequest request, HttpServletResponse response) {
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String id       = request.getParameter("id");
			
			response.setContentType("text/html;charset=utf-8");				
			response.getWriter().write("鎴戞帴鏀跺埌鏁版嵁鍟�..");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * @param request
	 * @param response
	 */
	@SuppressWarnings("unused")
	private void ajax(HttpServletRequest request, HttpServletResponse response) {
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String id       = request.getParameter("id");
			
			response.setContentType("text/html;charset=utf-8");				
			response.getWriter().write("{\"success\":\"ok\" , \"message\":\"鑾峰緱鎴愬姛!\"}");
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}




}
