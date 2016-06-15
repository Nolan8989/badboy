<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajax01.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" charset="utf-8">
	function test(){
		//1.实例化对象。
		var request = new XMLHttpRequest();
		//2.调用open方法(method ,  url , ay)
		request.open("post", "AjaxServlet", true);//true代表异步,可以多次提交。
		//3.回调函数(用于接收服务器返回的数据)
		request.onreadystatechange = function(){
			if(request.readyState == 4){ //0、1、2、3、4 (4代表接收成功)
				if(request.status == 200){ //200、404、500 一般写在一起。
				var result = request.responseText; //这里不是方法。
				var mydiv = document.getElementById("mydiv");
				mydiv.innerHTML = result;
				}else if(request.status ==500){
					alert(FAQ问题);
				}
			}else{
				var mydiv = document.getElementById("mydiv");
				mydiv.innerHTML = "<img src='images/009.gif' / >";
			}
		}	
			//模拟form提交
			request.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			//4.发送请求
			request.send("a=张三&b=李四");
	};
	</script>
  </head>
  
  <body>
  	<input type="button" onclick="test();" value=点击 />
   <div id="mydiv"></div>
  </body>
</html>
