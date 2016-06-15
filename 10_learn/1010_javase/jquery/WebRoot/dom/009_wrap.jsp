<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>包裹元素节点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<script type="text/javascript">
		$(function(){

			$("p").wrap("<b></b>");				//包裹此节点
			$("span").wrapInner("<i></i>");		//包裹此节点的内布元素(包括文本内容)
		});


	</script>
  </head>
  
  <body>
		<p>姓名：<span >bhx</span></p>
		<p>年龄：<span >29</span></p>
  </body>
</html>
