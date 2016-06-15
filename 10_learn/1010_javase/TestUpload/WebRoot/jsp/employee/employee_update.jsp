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
    
    <title>My JSP 'employee_update.jsp' starting page</title>
    
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
     <form method="post" action="EmployeeServlet?method=update" enctype="multipart/form-data">
     	<input type="hidden" name="id" value="${emp.id}"/>
    	姓名：<input name="name" id="name" value="${emp.name }" /><br/>
    	薪水：<input name="salary" id="salary" value="${emp.salary }"/><br/>
    	头衔：<input name="title" id="title" value="${emp.title }"/><br/>
    	生日：<input name="birthday" id="birthday" value="${emp.birthday }"/><br/>
    	<c:if test="${emp.path eq null }">
    	上传文件<input name="path" type="file" /><br/>
    	</c:if>
    	<c:if test="${emp.path ne null }">
    	
    	 <a href="EmployeeServlet?method=downLoad&id=${emp.id }">下载 </a>
    	 上传文件<input name="path" type="file" /><br/>
    	</c:if>
    	
    	<input type="submit" value="save">
    </form>
  </body>
</html>
