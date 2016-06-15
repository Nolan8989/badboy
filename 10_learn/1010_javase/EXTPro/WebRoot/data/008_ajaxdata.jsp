<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%

	String id = request.getParameter("id");
	String name = request.getParameter("name");
	response.setContentType("text/html;charset=utf-8");
	response.getWriter().write("{\"success\":true,\"msg\":\"操作成功!\"}");
	/**
	try{
		int i = 1/0;
	} catch(Exception e){
		e.printStackTrace();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("{\"success\":false,\"msg\":\"操作失败!\"}");		 
	}
	*/

%>
