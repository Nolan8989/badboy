<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>"><!-- http://127.0.0.1:8080/jq/ -->
    
    <title>My JSP 'helloworld.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 引入jquery核心文件 -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
  	<script type="text/javascript">
  	
  		// 页面全部加载完毕之后才触发onload事件 执行代码片段的
  		/*
		window.onload = function(){
			
				var t1 = document.getElementById("t1");
				alert(t1);
			
		}
  		*/
  		
  		// read()方法
		
  		$(function(){
  			
  			
  				// jquery对象和js的dom对象转换机制 
  				
  				
  				//dom转jquery 
				var t1 = document.getElementById("t1");
				var $t1 = $(t1);
				console.info($t1.val());
				//alert(t1);
				
				// 选择器  id选择器 #idname
				//var $t1 = $('#t1');
				//console.info($t1);
				//console.info($t1.val());
				
				
				
				// jquery 转 dom
				//var $t1 = $('#t1');
				//console.info($t1[0].value);
				//console.info($t1.get(0).value);
  		});
	
	</script>
	
	
  </head>
  
  <body>
  		<Input id="t1" name="t1" value="ttt" />
  </body>
  
  
  

</html>
