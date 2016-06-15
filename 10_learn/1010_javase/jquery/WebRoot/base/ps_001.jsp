<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>jquery</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<style type="text/css">
		.divFrame{ width:260px;broder:solid 1px #666; font-size: 10pt}
		.divTitle{ background-color: #eee;padding: 5px;}
		.divContent{ padding: 5px;display: none}
		.divCurrentColor{ background-color: red;}
	
	</style>
	
	
	<script type="text/javascript">
			/*01 示例代码：
			    功能描述 ：
			    当用户单击Class名称为'divTitle'的元素时, 自身增加名称为'divCurrentColor'的样式  
			    同时将接下来的Class名称为'divContent'的元素显示出来 
			    由此可见,这两个功能通过'.'符号链接起来 即链式编程   	
			*/
			$(function(){
				 $('.divTitle').click(function(){
						$(this).addClass("divCurrentColor").next(".divContent").css("display","block");
				 });
			});

	</script>
  </head>
  
  <body>
      	<div class="divFrame">
  				<div class="divTitle">主题</div>
  				<div class="divContent">
  					<a href="#">href1</a><br/>
  					<a href="#">href2</a><br/>
  					<a href="#">href3</a>
  				</div>
  		</div>
  </body>
</html>
