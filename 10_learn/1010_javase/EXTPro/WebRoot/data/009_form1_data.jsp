<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%

		String name = request.getParameter("name");
		if("admin".equals(name)){
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("{\"success\":false,\"msg\":\"已经存在!\"}");			
		} else {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("{\"success\":true,\"msg\":\"可以注册!\"}");		 	
		}

%>