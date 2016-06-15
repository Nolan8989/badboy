<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>层次选择器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<style type="text/css">
		body{font-size:12px;text-align: center;}
		div,span { display: none;float: left; border: solid 1px #ccc;margin: 8px; }
		.clsA {width: 65px; height:65px;}
		.clsP {width: 45px; height: 45px;background-color: #eee}
		.clsC {width: 25px; height: 25px;background-color: #ddd}
	</style>
	<!-- 层次选择器  -->
	<script type="text/javascript">
		$(function(){	
			
			/**
			 * 
			 *  在写包含选择器的时候 如果 你想父元素下指定的所有子元素都显示  div span , 
			 *  如果只希望显示父元素下的一层(直接子元素) ">" div>span
			 */  
			
			
			//1.匹配所有子元素			
			//$("#divMid").css("display","block");
			//$("div span").css("display","block");		
			
			//2.匹配子元素 只匹配一层 >
			//$("#divMid").css("display","block");
			//$("div>span").css("display","block");  //  1层
			
			
			//3.匹配后面的元素(均可)
			//$("#divMid + span").css("display","block"); //匹配下一个元素,必须是span
			//$("#divMid").next().css("display","block"); //匹配下一个元素
			
			//$("#divMid ~ div").css("display","block");  //匹配后面所有的div元素
			//$("#divMid").nextAll().css("display","block");//匹配后面所有的元素 
			
			
			//4.匹配所有兄弟元素 
			//$("#divMid").siblings("div , span").css("display","block"); 
			

		});
	</script>

  </head>
  
  <body>
		  <div class="clsA">Left</div>
		  <div class="clsA" id="divMid">
		  		<span class="clsP" id="span1">
		  			<span class="clsC" id="span2"></span>
		  		</span>
		  </div>
		  <span class="clsA">Right_1</span>
		  <div class="clsA">Right_2</div>
		  <div class="clsA">Right_3</div>
  </body>
</html>
