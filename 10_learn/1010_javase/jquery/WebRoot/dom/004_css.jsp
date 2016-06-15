<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>操作元素的样式</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<style type="text/css">
			.cls1{ font-style: italic;  font-weight: bold;}
			.cls2{ border: solid 1px #666; font-size: 40px;}
	</style>
	
	<script type="text/javascript">
		$(function(){
			//  css(name , value)	增加样式 
			/*
			$("p").click(function(){
				$(this).css("font-size","30px").css("font-weight","bold").css("background-color","#eee");
			}); 
			*/

			// addClass 增加类别 
			/*
			$("p").click(function(){
				$(this).addClass("cls1 cls2");
			});
			*/
			

			// toggleClass 切换类别
			/*
			$("p").click(function(){
				$(this).toggleClass("cls1");
			});
			*/

			// removeClass 删除类别
			
			$("p").addClass("cls1 cls2");
			$("p").click(function(){
				$(this).removeClass("cls2");
			});
			 
		});
		
		
		$(function(){
			
			//var mydiv = $('<div id=dd style=background-color:red  onclick=alert(123); >我是div内容</div>'); 
			//$('body').append('<div id=dd style=background-color:red  onclick=alert(123); >我是div内容</div>');
			
		});
	
	</script>
  </head>
  
  <body>
		<p>Write Less Do More</p>
  </body>
</html>
