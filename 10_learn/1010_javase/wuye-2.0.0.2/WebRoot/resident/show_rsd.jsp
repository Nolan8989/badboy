<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show_rsd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <s:property value="rsd.rsdname"/>
     <s:property value="rsd.email"/>
     <s:property value="rsd.identity"/>
     <s:property value="rsd.phone"/>
     <s:property value="rsd.imgpath"/>
     <s:property value="rsd.previmgpath"/>
     <img src="showImage!showImage.sxt?inputPath=<s:property value='rsd.imgpath'/>">
	     <img alt="" src="showImage!showImage.sxt?inputPath=<s:property value='rsd.previmgpath'/>">
 
     <s:debug></s:debug>
  </body>
</html>
