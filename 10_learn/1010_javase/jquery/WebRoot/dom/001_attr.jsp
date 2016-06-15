<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>访问元素的属性</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	
	<script type="text/javascript">
		$(function(){
				//console.info($("input").attr("type"));			//一个参数的时候是获取属性的值
				//$("input").attr("value","文本框");		//两个参数的时候是设置属性的值 
				
				//用json对象设置多个属性 
				/* 
				$("input").attr(
					{value:1111 ,style:'width:300px' , readOnly:'readOnly'}
				);
				*/
				//$("input").attr("value" , function(){ return 1+2;})   //可以绑定一个函数 
		});
	
	</script>
  </head>
  
  <body>
  	<%--<img title="图片" src = "Images/01.jpg"/>--%>
  	<input type="text" 	 />
  </body>
</html>
