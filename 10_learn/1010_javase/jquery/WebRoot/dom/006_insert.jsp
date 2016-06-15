<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>插入元素节点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<script type="text/javascript">
		$(function(){
			//内部插入
			//append 追加内容到其中
			//$("#d1").append(retHtml);
			
			//appendTo 被追加到其中 
			//$("<span>Span</span>").appendTo("#d1");

			
			//外部插入
			

			//$("#d1").before(retHtml);
			//$("#d1").after(retHtml()); 

			$(retHtml()).insertBefore("#p1"); 
			$(retHtml()).insertAfter("#p1");
		});


		
		function retHtml(){
			var str = "<p>Write Less Do More</p>";
			return str;
		}
	</script>
  </head>
  
  <body>
  		<p id="p1">ppppp</p>
  		<div id="d1" style="border: solid 1px #666;">jQuery</div>
  </body>
</html>
