<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'employee_view.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 引入jquery核心包 -->
	<script type="text/javascript" charset="utf-8" src="js/jquery-easyui-1.3.1/jquery-1.8.0.min.js"></script>
	<!-- 引入css样式 -->
	<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.1/themes/default/easyui.css">
	<!--easyui核心包  -->
	<script type="text/javascript" charset="utf-8" src="js/jquery-easyui-1.3.1/jquery.easyui.min.js"></script>
	<!--本地中文化  -->
	<script type="text/javascript" charset="utf-8" src="js/jquery-easyui-1.3.1/locale/easyui-lang-zh_CN.js"></script>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
	  <body>
	  	<table width="90%" border="1">
	  		<tr>
	  			<th>序号</th>
	  			<th>雇员名称</th>
	  			<th>薪水</th>
	  			<th>职称</th>
	  			<th>出生日期</th>
	  			<th>操作</th>
	  		</tr>
	  		<c:forEach var="temp" items="${elist }" varStatus="vs">
	  			<tr>
	  				<td>${vs.count }</td>
	  				<td>${temp.name }</td>
	  				<td>${temp.salary }</td>
	  				<td>${temp.title }</td>
	  				<td>${temp.birthday }</td>
	  				<td>
	  				<a href="EmployeeServlet?method=preUpdate&id=${temp.id }">修改</a>
	  				<a href="EmployeeServlet?method=delete&id=${temp.id }">删除</a>
	  				</td>
	  			</tr>
	  			
	  		</c:forEach>
	  	</table>
	  </body>
</html>
