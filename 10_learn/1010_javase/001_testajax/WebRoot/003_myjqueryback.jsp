<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	System.out.println("hello moto!!!");
	String d = request.getParameter("cmd");
	String uname = request.getParameter("uname");
	System.out.println("hello moto!!!"+d+"uuuu"+uname);
	 Thread.sleep(3000);
	out.print("{uname:'cai10'}");
%>