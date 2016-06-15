<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>隐藏显示效果</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>

	<script type="text/javascript">

		$(function(){

			$("#d1").click(function(){
				$("#d1").toggle(1000,myshow,myhide);
				//$("#d1").show("2000");
			});
				
		});

		function myshow(){
			$(this).show('fast');
		}

		function myhide(){
			$(this).hide('slow');
		}
	</script>
  </head>
  
  <body>
		<input id="d1" type="button" value="点击"></input>
  </body>
</html>
