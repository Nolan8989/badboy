<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'selecter_001.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body{font-size: 12px;text-align: center;}
		#tbStu{width: 260px;border: solid 1px #666; }  /*background-color: #eee*/
		#tbStu tr{ line-height: 23px;}
		#tbStu tr th {background-color: #ccc;  color: #fff;}
		#tbStu .trOdd{background-color:blue;}
		
	</style>

	<script type="text/javascript">
		/*
		window.onload = function(){
			var tb = document.getElementById("tbStu");
			for(var i = 0; i < tb.rows.length;i++){
				if(i%2==0){
					tb.rows[i].className="trOdd";
				}
			}
		}
		*/



	
	$(function(){
	  	$("#tbStu tr:nth-child(odd)").addClass("trOdd");
	});
	
	</script>

  </head>
  
  <body>
  
  		<table id="tbStu" cellpadding="0" cellspacing="0">
			<tbody>				
				<tr>
					<th>学号</th><th>姓名</th><th>性别</th><th>总分</th>
				</tr>
				<!-- 偶数行   -->
				<tr>
					<td>1001</td><td>小K</td><td>男</td><td>340</td>
				</tr>
				<!-- 奇数行  -->
				<tr>
					<td>1002</td><td>小T</td><td>女</td><td>350</td>
				</tr>							
				<tr>
					<td>1003</td><td>小U</td><td>女</td><td>340</td>
				</tr>	
				<tr>
					<td>1004</td><td>小L</td><td>男</td><td>350</td>
				</tr>	
			</tbody>  		
  		</table>
  </body>
</html>
