<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'employee_save.jsp' starting page</title>
    
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
    <form method="post" action="EmployeeServlet?method=save" enctype="multipart/form-data">
    	������<input name="name" id="name"/><br/>
    	нˮ��<input name="salary" id="salary" /><br/>
    	ͷ�Σ�<input name="title" id="title" /><br/>
    	���գ�<input name="birthday" id="birthday" /><br/>
    	�ļ��ϴ���<input name="path" type="file" /><br/>
    	<input type="submit" value="save">
    </form>
  </body>
</html>
