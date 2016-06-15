<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>toggle事件</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>

  </head>
  
  <script type="text/javascript">

		// toggle(fn,fn2,fn3,fn4,fn5....);
		$(function(){
			$("#photo").toggle(
				function(){
					$("#photo").attr("src","Images/01.gif");
				},
				function(){
					$("#photo").attr("src","Images/02.gif");
				},
				function(){
					$("#photo").attr("src","Images/03.gif");
				}
			);
		});

  </script>
  
  <body>
  	
  	<div id="d1" style="width: 200px; height:100px; border: solid 1px #eee">
  			<img id="photo"></img>
  	</div>
  </body>
</html>
