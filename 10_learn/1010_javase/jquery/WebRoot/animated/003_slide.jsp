<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>滑动效果</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>

	<script type="text/javascript">

		$(function(){
			//滑动效果 
			$("#btn1").click(function(){
				$("p").slideUp("slow"); 
			});
			$("#btn2").click(function(){
				$("p").slideDown("fast"); 
			});
			$("#btn3").click(function(){		//滑入滑出效果 可控制时间
				$("p").slideToggle(2000); 
			});
		});


	</script>
  </head>
  
  <body>
		<p style="width: 100px;height: 100px; border: solid 1px #eee; background-color: red;">JQery...</p>
		<button id="btn1">向上滑动</button>
  		<button id="btn2">向下滑动</button>
  		<button id="btn3">滑入滑出</button>
  </body>
</html>
