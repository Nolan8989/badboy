<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>访问元素的内容</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心文件  -->
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	
	<script type="text/javascript">
		$(function(){
			//html() && html(val)
			
			//console.info($("#div1").html());		//获取标签内部的文本内容
			//$("#div1").html("<h1>abcde<h1>");		//改变标签内部的文本内容
			

			
			//text() && text(val)
			
			//console.info($("#div2").text());
			//$("#div2").text("<h1>ttttttttttttttt<h1>");
			
			 
		});
	
	</script>
  </head>
  <script language=javascript>

function outPut()
{
 //获取父窗口的文本信息赋值给text
 var text = document.abc.text.value;
 //打开子窗口，并且把操作句柄赋值给win变量，以下所有操作都是针对win对象的
 var win = window.open("","mywin", "menubar=no,width=400,height=100,resizeable=yes");
 //输出基本信息
 win.document.writeln("<title>输出结果</title>");
 win.document.writeln("你的信息是：<p>");
 //输出从父窗口获取的信息
 win.document.writeln(text);
 win.document.close();
 win.focus();
}
</script>

<form name=abc method=post>
<input type=text name=text size=50>
//调用上面的函数
<input type=button value=提交 onClick="outPut()">

</form>
  <body>
  		<div id="div1">11111111111111111111</div>
  		<div id="div2">22222222222222222222</div>
  </body>
</html>
