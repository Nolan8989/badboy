<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="lab" uri="http://sanqi/lab" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body topmargin="150">
  
  <table align="center" border="1" bordercolor="gray" cellspacing="0">
	<tr>
		<lab:show al="${al}" operation="true"/>
	</tr>
  <tr>
  <td colspan="5" >
   <lab:sanqilab sumPage="${sumPage}" currentSize="${currentSize}" url="showdata" currentPage="${currentPage}" sumItem="${sumItem}"/>
  </td>
  </tr>
  </table>
  </body>
</html>
