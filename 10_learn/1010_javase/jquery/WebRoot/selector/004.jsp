<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>表单过滤选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body {font-size:12px;text-align: center;}
		div{border: solid 1px #ccc ; background-color: #eee;padding: 5px}
		textarea, select, button, input, span{display: none;}
		.red{color: red;}
	</style>
	<!-- 表单过滤选择器 -->
	<script type="text/javascript">
		$(function(){	
			//$("#divShow").html("表单共找出Input类型元素"+ $("#form1 :input").length + "个");
			
			$("#form1 select").show(1000);
			$("#form1 textarea").show(1000);
			
			
			$("#form1 :text").show(1000);	
			$("#form1 :password").show(1000);
			$("#form1 :radio").show(1000);
			$("#form1 :checkbox").show(1000);
			$("#form1 :submit").show(1000);
			$("#form1 :image").show(1000);
			$("#form1 :reset").show(1000);
			$("#form1 :file").show(1000);
			
			
			// alert($('.red:submit').val());
			
			
		});

		
	</script>

  </head>
  
  <body>
  		<!-- 
  		<input class="red" type="submit" value="111"  />
  		<input class="red" type="text" value="222" />
  		<input class="red" type="text" value="3332" />
  		 -->
  		<form id="form1" style="width: 241px" action="">
			<textarea rows="" cols="">TextArea</textarea>
			<select><option value="0">Item 0</option></select>
			<input type="text" value="text" />
			<input type="password" value="1234" />
			<input type="radio" value="1" />
			<input type="checkbox" value="1" />
			<input type="submit" value="提交" />
			<input type="reset" value="重置" />
			<input type="image" src="Images/01.gif" title="image" />
			<input type="button" value="按钮" />
			<input type="file" value="文件域" />
			<span id="sp">Span</span>
			<div id="divShow"></div>
  		</form>
  </body>
</html>
