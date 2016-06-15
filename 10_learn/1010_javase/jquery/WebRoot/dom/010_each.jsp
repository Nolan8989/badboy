<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>遍历元素节点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<style type="text/css">
		.aaa{ border: solid 1px red;}
		.red{color: red;}
	</style>
	
	<script type="text/javascript">
		$(function(){
			/*
			$("img").each(function(index){
							this.title ="这是第"+index +"个图";
							//this.className = "aaa";
							$(this).addClass("aaa");
					});
			*/ 
			
			
			$('.red').each(function(count){
					alert($(this).val());
					//alert(this.value); 
			});
			
		});

	</script>
  </head>
  
  <body>
  	 
  		<input class="red" value="111" />
  		<input class="red" value="222" />
 		<input class="red" value="333" />
    	
		<p>
			<img src="Images/01.gif"/>
			<img src="Images/02.gif"/>
			<img src="Images/03.gif"/>
		</p>
  </body>
</html>
