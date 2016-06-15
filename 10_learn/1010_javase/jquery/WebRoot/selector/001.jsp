<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>基本选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body{font-size:12px;text-align: center;}
		.clsFrame{ width: 300px;height: 100px;}
		.clsFrame div,span { display: none;float: left;width: 65px;height:65px;border: solid 1px #ccc;margin: 8px; }
		.clsOne { background-color: #eee}
	</style>
	<!-- 基本选择器  -->
	<script type="text/javascript">
		$(function(){				
						
			//ID匹配元素	
			/*
			$(function(){		
				$("#divOne").css("display","block");
			});
			*/
			
			
			//名称匹配元素
			$(function(){
				
				//传统的js操作dom
				/*
				var  arr = document.getElementsByTagName("span"); 
				for(var i = 0 ; i< arr.length; i++){
					arr[i].style.display = 'block';
				}
				*/
				
				//jquery
				//$("span").css("display","block");  //给所有的span改样式
			});
		
					
			//类匹配元素 
			/*
			$(function(){
				$(".clsOne").css("display","block");
			});
			*/
			
			
								
			//匹配所有元素  
			/*
			$(function(){
				$("*").css("display","block");
			});	
			*/
			
			//合并匹配元素
			 
			$(function(){
				//$("#divOne , .clsOne").css("display","block"); //并列的关系   ||
				//$('.clsFrame span').css("display" , "block");  //包含选择器 
				//$('span').css("display" , "block");
			});	
				
		});
	</script>

  </head>
  
  <body>
	  <div class="clsFrame">
	  		<div id="divOne">ID</div>
	  		<div class="clsOne">CLASS</div>
	  		<span>SPAN</span>
	  </div>
	  <span style="display: none;">1111</span>
  </body>
</html>
