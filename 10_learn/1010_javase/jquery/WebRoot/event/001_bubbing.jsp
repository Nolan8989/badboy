<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>冒泡事件</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<style type="text/css">
		.btn{
			border: solid 1px #444; padding: 2px; width: 60px;
			filter:progid:DXImageTransform.Microsoft.Gradient(GradientType=0,StartColorStr=#ffffff,EndColorStr=#ECE9D8); 
		}
		.cls{border: solid 1px #666; width: 200px; display: none;}
	</style>


	<script type="text/javascript">
	
		$(function(){

				var i = 0;		//累计执行次数
				$("body,div,#btnShow").click(function(event){
					i++;

					$(".cls").show(2000).html("您好欢迎来到JQuery的世界").append("执行次数：<b>"+i+"</b>次");
					//event.stopPropagation();		//阻止冒泡事件的继续响应
					//return false;					//最土的阻止冒泡事件响应 
				});
		});
	
	</script>
  </head>
  
  <body>
  		<div style="border: solid 1px #666; ">
  				<input id="btnShow"  type="button" value="点击" class="btn"/>
  		</div>
  		
  		<div id ="d1" class="cls"></div>
  </body>
</html>
