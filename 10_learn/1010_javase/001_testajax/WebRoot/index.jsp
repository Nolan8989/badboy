<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script  type="text/javascript">
		function test01(){
			var req = null;
			
			//初始化
			if(window.XMLHttpRequest){
				req = new XMLHttpRequest();
				console.info("firefox");
			}else if(window.ActiveXObject){
				req = new ActiveXObject("Msxml2.XMLHTTP");
				console.info("ie");
			}else {
				alert("你懂得...");
			}
			
			
				req.onreadystatechange = function(){
				//alert(req.readyState);	
				var d = document.getElementById("div1");
				if(req.readyState ==4){
					var rs = req.responseText;
					d.innerHTML = rs;
					
				}else{
					d.innerHTML = "<img src='images/134.gif'/>";
				}
			};
			
			
			//arg1:get|post  arg2:url arg3:async  
			//req.open("get","001.jsp",true);
			//req.send(null);
			req.open("post","001.jsp",true);
			//需要设置request头信息，否则后台接收不到信息。
			req.setRequestHeader("content-type","application/x-www-form-urlencoded");
			
			req.send("method=123456");
			
			
		
		}	
	</script>
  </head>
  
  <body>
  
    <input type="button" value="test01" onclick="test01()" />
    <div id="div1">
    	
    </div>
  </body>
</html>
