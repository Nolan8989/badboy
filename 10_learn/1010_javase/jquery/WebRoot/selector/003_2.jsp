<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>内容过滤选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body {font-size:12px;text-align: center;}
		div {width:100px; height:100px;  border:solid 1px #666; display: none}
		span {border: solid 1px #eee ; width: 100px; height: 100px;}
	</style>
	<!-- 内容过滤选择器 -->
	<script type="text/javascript">
		$(function(){	
			
			//$("div:contains('A')").css("display","block"); //包含'A'的内容
			//$("div:empty").css("display","block");		   //empty的元素 (不包含子元素和内容)
			//$("div:has(span)").css("display","block");	   //包含span的div显示
			//$("div:parent").css("display","block");		   //显示含有子元素或者文本的元素

			
			
		});

		
	</script>

  </head>
  
  <body>
  		<div>ABCD</div>
  		<div><span title="aaa">AAAA</span></div>
  		<div>EFaH</div>
  		<div style="background-color: blue;"></div>
  </body>
</html>
