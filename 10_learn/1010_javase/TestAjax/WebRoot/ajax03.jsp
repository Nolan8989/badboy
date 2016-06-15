<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajax03.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" charset="utf-8">
		window.onload = function(){
			var request = new XMLHttpRequest();
			request.open("post", "PCServlet", true);
			request.onreadystatechange = function(){
				if(request.readyState == 4 && request.status==200){
					var sel_1 = document.getElementById("sel_1");
					var arr = eval(request.responseText);
					for ( var i = 0, len =  arr.length; i < len;i++) {
						var op = new Option(arr[i].name,arr[i].id);//对象.属性。
						sel_1.options[sel_1.options.length] = op;
					}
				}
			}
			request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			request.send("method=getPro");
		}
		
		
		function getCities(sel){
			var sel_2 = document.getElementById("sel_2");
			sel_2.length = 1;
			var selectedop = sel.options[sel.selectedIndex];
			
			var request = new XMLHttpRequest();
			request.open("post", "PCServlet", true);
			request.onreadystatechange = function(){
				if(request.readyState == 4 && request.status==200){
					var arr = eval(request.responseText);
					for ( var i = 0, len =  arr.length; i < len;i++) {
						var op = new Option(arr[i].name,arr[i].id);//对象.属性。
						sel_2.options[sel_2.options.length] = op;
					}
				}
			}
			
			request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			request.send("method=getCity&province_id=" +selectedop.value);
		}
		
	</script>
  </head>
  
  <body>
 <select id="sel_1" name ="sel_1" onchange="getCities(this);">
 	<option value="0">----请选择省份---</option>
 </select>
 
 <select id="sel_2" name ="sel_2" ">
 	<option value="0">----请选择城市---</option>
 </select>
  </body>
</html>
