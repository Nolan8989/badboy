<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'HelloWorld.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript"src="jquery/jquery-1.4.2.js"></script>
	
	 <script>
	 
//	 $(function(){
//	 	var $t1 = $('#t1');
//		console.info($t1.val());
	 
//	 });

	function test(){
	
		var t1 =  document.getElementById("t1");
		console.info(t1);
		
	}
	
				
	  
	</script>
	
  </head>
  
  <body>

	<Input id="t1" name="t1" value="ttt" />
  </body>
  <script>
  
  //test();
  </script>
 
</html>
