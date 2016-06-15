<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>控制CSS样式</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		.divDefault{ width: 260px; font-size: 10pt; padding: 5px;}
		.divClick{ width: 260px; border: solid 1px #666; font-size: 10pt; background-color: #eee;padding: 5px}
	</style>
		
	<script type="text/javascript">

			$(function(){
					$(".divDefault").click(function(){
						//$(this).addClass("divClick").html("点击后的样式");
						$(this).toggleClass("divClick").html("点击后的样式"); // 样式的切换 
					});
			});
	
	</script>

  </head>
  
  <body>	
		<div class="divDefault">点击前的样式</div>		  
  </body>
</html>
