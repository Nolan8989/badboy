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
	<!-- ����jquery���İ� -->
	<script type="text/javascript" charset="utf-8" src="js/jquery-easyui-1.3.1/jquery-1.8.0.min.js"></script>
	<!-- ����css��ʽ -->
	<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.1/themes/default/easyui.css">
	<!--easyui���İ�  -->
	<script type="text/javascript" charset="utf-8" src="js/jquery-easyui-1.3.1/jquery.easyui.min.js"></script>
	<!--�������Ļ�  -->
	<script type="text/javascript" charset="utf-8" src="js/jquery-easyui-1.3.1/locale/easyui-lang-zh_CN.js"></script>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
	  <body>
	  	<table width="90%" border="1">
	  		<tr>
	  			<th>���</th>
	  			<th>��Ա����</th>
	  			<th>нˮ</th>
	  			<th>ְ��</th>
	  			<th>��������</th>
	  			<th>����</th>
	  		</tr>
	  		<c:forEach var="temp" items="${elist }" varStatus="vs">
	  			<tr>
	  				<td>${vs.count }</td>
	  				<td>${temp.name }</td>
	  				<td>${temp.salary }</td>
	  				<td>${temp.title }</td>
	  				<td>${temp.birthday }</td>
	  				<td>
	  				<a href="EmployeeServlet?method=preUpdate&id=${temp.id }">�޸�</a>
	  				<a href="EmployeeServlet?method=delete&id=${temp.id }">ɾ��</a>
	  				</td>
	  			</tr>
	  			
	  		</c:forEach>
	  	</table>
	  </body>
</html>
