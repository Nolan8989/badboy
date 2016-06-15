<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>淡入淡出效果</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>

	<script type="text/javascript">

		$(function(){
			// 淡入淡出效果,调整透明底效果  			
			$("#btn1").click(function(){
				$("#d1").fadeOut(2000); 
			});
			$("#btn2").click(function(){
				$("#d1").fadeIn(2000);
			});
			$("#btn3").click(function(){
				$("#d1").fadeTo(2500,0.50);
			});
		});


	</script>
  </head>
  
  <body>
		<div id="d1" style=" background-color:green; width: 100px; height: 100px; border: solid 1px #666;">JQuery~</div>
  		<button id="btn1">点击消失</button>
  		<button id="btn2">点击出现</button>
  		<button id="btn3">点击调整</button>
  </body>
</html>
