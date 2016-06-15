<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>表单对象属性过滤选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body {font-size:12px;text-align: center;}
		div{ display:none ; width:400px;}
		select{ height:65px;}
		.clsIpt{ width: 100px; padding: 3px}
		.GetFocus {width: 58px; border: solid 1px red; background-color: #eee}
	</style>
	<!-- 表单对象属性过滤选择器 -->
	<script type="text/javascript">
		$(function(){				
			//$("#divA").show(1000);
			//$("#form1 input:enabled").addClass("GetFocus");	 	//可用文本增加样式
			//$("#form1 input:disabled").addClass("GetFocus");	//不可用文本增加样式					

			//$("#divB").show(1000);
			//alert($("#form1 input:checked").val());			//获取复选框选中的值 
			
								
			$("#divC").show(1000);
			//$("#form1 select option:selected").text();		//获取选中项 
			$("#sp").html("选中项为:"+$("#form1 select option:selected").text());		
		});

		
	</script>

  </head>
  
  <body>
  
  		<form id="form1" style="width: 241px" action="">
  				<div id="divA">
					<input type="text" value="可用文本框" class="clsIpt" />  				
  					<input type="text" disabled="disabled" value="不可用文本框" class="clsIpt" />
  				</div>
  				
  				<div id="divB">
  					<input type="checkbox" checked="checked" value="1" />选中
  					<input type="checkbox" value="0">未选中
  				</div>
  				
  				<div id="divC">
  					<select multiple="multiple">
  						<option value="0">select 0</option>
  						<option value="1" selected="selected">select 1</option>
  						<option value="2">select 2</option>
  						<option value="3" selected="selected">select 3</option>
  					</select>	
  					<span id="sp"></span>
  				</div>
  		</form>
			
  </body>
</html>
