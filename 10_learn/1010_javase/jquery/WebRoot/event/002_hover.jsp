<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>hover事件</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>

	<style type="text/css">
		.red{color: red;}
		.green{color:green;}
	
	</style>



  </head>
  
  <script type="text/javascript">

		// hover(over , out)
		
		$(function(){
			$("#d1").hover(
					function(){
						$(this).hide();		
					},
					function(){
						$(this).show(10);
					});
		});
		
		
		
		$(function(){
			
			$('#aa').hover(
				function(){  //over
						$(this).removeClass("green");
						$(this).addClass("red");
				},
				function(){	//out
					
						$(this).addClass("green");
				}
			);
			
		});
		
		/*
		$(function(){
			$('#in').bind('click' , function(){
				console.info($(this).val());
			});
		});
		*/
  </script>
  
  <body>
  
  	<input id="in" value="123" />
  
    <a id="aa">我是超链接</a>
  	<div id="d1" style="width: 200px; height:100px; border: solid 1px #eee">jquery Hover事件~</div>
  </body>
</html>
