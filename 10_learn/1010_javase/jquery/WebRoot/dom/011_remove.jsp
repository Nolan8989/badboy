<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>删除元素节点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		ul {width: 200px;}
		ul li{list-style-type: none; padding: 0px; height: 23px;}
		.btn{
			border: solid 1px #444; padding: 2px; width: 60px;
			filter:progid:DXImageTransform.Microsoft.Gradient(GradientType=0,StartColorStr=#ffffff,EndColorStr=#ECE9D8); 
		}
	
	</style>
	<script type="text/javascript">
		$(function(){
				$("ul li:first").css("font-weight","bold");
				$("#b1").click(function(){
					//$("ul li").remove("li[title=t]");
					//$("ul li:eq(1)").remove();
				});
			
		});
	</script>
  </head>
  
  <body>
  			<div id="my">111</div>
  
			<ul>
				<li>学号</li>
				<li title="t">1001</li>
				<li>1002</li>
				<li>1003</li>
				<li title=t >1004</li>
				<li style="text-align: center;padding-top: 5px;">
					<input id="b1" type="button" value="删除" class="btn"/>
				</li>
			</ul>
  </body>
</html>
	