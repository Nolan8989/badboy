<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>子元素过滤选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body {font-size:12px;text-align: center;}
		ul{ width: 241px;list-style-image: none;padding: 0px;}
		ul li {height: 23px;width: 60px;line-height: 23px; float: left;border-top: solid 1px #eee;
			   border-bottom: solid 1px #eee; margin-bottom: 5px;}		
		
		.GetFocus {width: 58px; border: solid 1px #666; background-color: #eee}
	</style>
	<!-- 子元素过滤选择器 -->
	<script type="text/javascript">
		$(function(){	

			//   -------：nth-child   (eq|even|odd|index) 
			
			//$("li:nth-child(2)").addClass("GetFocus");			//增加每个父元素下的第二个子元素类别
			//$("li:first-child").addClass("GetFocus");			//增加每个父元素下第一个和最后一个子元素的类别
			//$("li:last-child").addClass("GetFocus");	
			//$("li:only-child").addClass("GetFocus");			//增加父元素只有一个子元素的元素类别 
		});

		
	</script>

  </head>
  
  <body>
	<ul>
		<li>Item 1-0</li>
		<li>Item 1-1</li>
		<li>Item 1-2</li>
		<li>Item 1-3</li>
	</ul>
	<ul>
		<li>Item 2-0</li>
		<li>Item 2-1</li>
		<li>Item 2-2</li>
		<li>Item 2-3</li>
	</ul>
	<ul>
		<li>Item 3-0</li>
	</ul>		
  </body>
</html>
