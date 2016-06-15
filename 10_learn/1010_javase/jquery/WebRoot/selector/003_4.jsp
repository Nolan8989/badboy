<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>属性过滤选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body {font-size:12px;text-align: center;}	
		div,span { float:left; margin:8px; border: solid 1px #666 ; width: 100px; height: 100px; display:none;}
	</style>
	<!-- 属性过滤选择器 -->
	<script type="text/javascript">
		$(function(){	
			//$("div[id]").show(1000); 						//含有id属性的div显示
			//$("div[title='A']").show(1000); 				//属性为title并且值为'A'的div显示
			//$("div[title!='A']").show(1000); 			 	//title属性值不是'A'的显示
			//$("div[title^='AB']").show(1000);				//title属性值是以'A'开头的显示
			//$("div[title$='C']").show(1000);				//title属性值是以'C'结尾的显示
			//$("div[title*='B']").show(1000);				//title属性值包含'B'的显示
			//$("div[id^='div'][title*='B']").show(1000);	//多个复合选择器匹配
		});

		
	</script>

  </head>
  
  <body>
		<div id="divID">DIVID</div>
		<div title="A">A</div>
		<div id="divAB" title="AB">id:DIVAB<BR/>title:AB</div>
		<div title="ABC">ABC</div>
  </body>
</html>
