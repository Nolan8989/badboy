<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>控制DOM对象</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		.divFrame { width: 260px ; border: solid 1px #666; font-size: 10pt;}
		.divTitle { background-color: #eee; padding: 5px;}
		.divContent { padding: 8px; font-size: 9pt;}
		.divTip { width: 244px; border: solid 1px #666; padding: 8px; font-size: 9pt; margin-top: 5px; display: none; }
		.txtCss { border: solid 1px #ccc }
		.divBtn { padding-top: 5px;}
		.divBtn ,btnCss { border: solid 1px #535353; width: 50px}
	</style>
		
	<script type="text/javascript">

		/*
			操作DOM元素 
		*/
		$(function(){
				$('#button1').click(function(){
						var v1 = $('#text1').val();
						var r1 = $('#radio1').attr('checked')?"男":"女";
					    var c1 = $('#check1').attr('checked')?"结婚了":"没结婚";
					    $('.divTip').html(v1+'\n' + r1+'\n' + c1).show(1000).css('display' , 'block');
				});
		});	
	
	</script>

  </head>
  
  <body>	
  		<div class="divTitle">请输入如下信息</div>
		<div class="divContent">
		
			姓名：<input id="text1" type="text" class="txtCss"/><br/>
			性别： <input id="radio1" checked="checked" type="radio" name="sex" value="男"/>男
				  <input id="radio2" type="radio" name="sex" value="女"/>女<br/>
			婚否： <input id="check1" type="checkbox" />
			<div class="divBtn">
				  <input id="button1" type="button" value="提交" class="btnCss" /> 	
			</div>	  
		</div>
		<div id="divTip" class="divTip"></div>		  
  </body>
</html>
