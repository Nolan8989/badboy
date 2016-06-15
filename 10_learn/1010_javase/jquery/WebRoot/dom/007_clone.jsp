<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>复制元素节点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<script type="text/javascript">
		$(function(){

			$("img").click(function(){	
				//clone(boolean)  设置复制的元素事件是否也复制出来 true 复制   false不复制   (默认不加参数 false) 		
				$(this).clone(true).appendTo("#d2");
			});			
		});


	</script>
  </head>
  
  <body>

  		<div id="d1" style="border: solid 1px #666;"><img src="Images/01.gif"/></div>
  		<div id="d2"></div>
  </body>
</html>
