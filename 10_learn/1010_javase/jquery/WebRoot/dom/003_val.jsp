<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>访问元素的值</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	
	<script type="text/javascript">
		$(function(){
			$("select").change(function(){	
						var values = $("select").val().join(",");
						$("#p1").html(values);
			});
			
			$("input").change(function(){
				var value = $("input").val();
				$("#p2").html(value);
			});

			$("input").focus(function(){
				$("input").val("");
				$("#p2").empty();
			});
			
		});
	
	</script>
  </head>
  
  <body>
  		<select multiple="multiple" style="height: 96px;width: 85px;">
  				<option value="1">Item 1</option>
  				<option value="2">Item 2</option>
  				<option value="3">Item 3</option>
  				<option value="4">Item 4</option>
  				<option value="5">Item 5</option>
  		</select>
  		<p id="p1"></p>
  		
  		<input type="text" value="">
  		<p id="p2"></p>
  </body>
</html>
