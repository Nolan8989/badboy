<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
		function changepage(obj,flag){
			var f01 = document.getElementById("f01");

			if(flag=="01"){
				f01.src="page01.jsp"
			}else{
				f01.src="page02.jsp"

				}
		}
	
</script>
  </head>
  
  <body>
  <div>
	  <input type="button" value="page01" id="page01id" onclick="changepage(this,'01')">
	  <input type="button" value="page02" id="page02id" onclick="changepage(this,'02')">
  </div>
  
  <div>
    <iframe id="f01" src="page01.jsp"  width="50%" height="50%"></iframe>
  </div>
  </body>
</html>
