<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testjajax.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/sxt.js"></script>
  </head>
  
  <body>
    <div id="testid">dddddddddddddd</div>
    	<script type="text/javascript">
	/*
		$(function(){

				$.ajax({
					type:''


				})

		})
*/

	var undefined=12313123123;
window.onload=function(){
	sxt.ajax({
		type:"post",
		url:"003_myjqueryback.jsp?cmd=hhhhhhh",
//	 	async:false,
//		data:'uname=liuergou',
//		dataType:"xml",
		waitfunc:function(){
			document.getElementById("waitinfo").innerHTML="<img src='images/134.gif'  />";
		},
		success:function(rs){
//			alert(rs)
			document.getElementById("waitinfo").innerHTML=rs;
			//	alert(rs.getElementsByTagName("uname")[0].firstChild.data);
		}
	});
	alert("test")
}



//function test(){

	
//}


/*
test.uname ="test";
alert(test.uname)
delete test.uname
delete test;
alert(test.uname)
*/
//window.onload=function(){

	//var t = window.$("#testid");
	//alert(t.innerHTML)
	
	
//}


	</script>
	
	
	
	  <div id="waitinfo">    </div>
  </body>
</html>
