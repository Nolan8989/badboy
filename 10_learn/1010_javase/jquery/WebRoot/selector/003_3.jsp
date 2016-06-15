<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>可见性过滤选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body {font-size:12px;text-align: center;}	
		div,span { float:left; margin:8px; border: solid 1px #666 ; width: 100px; height: 100px;}
		.GetFocus {width: 100px; border: solid 1px #666; background-color: #eee}
	</style>
	<!-- 可见性过滤选择器 -->
	<script type="text/javascript">
		$(function(){	
			$("span:hidden").show(1000);					//隐藏元素变为显示
			$("div:visible").addClass("GetFocus");		//显示元素加上类样式 
		});

		
	</script>

  </head>
  
  <body>
		<span style="display: none">Hidden</span>
		<div>Visible</div>
  </body>
</html>
