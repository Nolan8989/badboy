<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>动态创建元素节点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<script type="text/javascript">
		$(function(){
			
			$("#p1").click(function(){
				var mydiv = $("<div id='d' title='mydiv' onclick=addInput(); >hi my div!</div>");
				$("body").append(mydiv);
			});

		});
		
		function addInput(){
			
			$('body').append('<input value=111 />');
		}
	
	</script>
  </head>
  
  <body>
		<p id="p1" style="background-color: yellow;width: 300px;">点击我创建div</p>
  </body>
</html>
