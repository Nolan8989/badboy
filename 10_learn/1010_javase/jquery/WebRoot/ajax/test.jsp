<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	
	<script type="text/javascript">
			
			$(function(){
				
					$('#btn').click(function(){
						//get方式提交表单:
						//三个参数 1:url 2:参数 3:callback 
						var datas = $('#myform').serialize();
						/*
						$.get('TestServlet?method=get' ,datas , function(data){
								alert(data);
						});
						*/
						/*
						$.post('TestServlet?method=post' ,datas , function(data){
								alert(data);
						});
						*/ 
						
						// ajax方法 options (json)
						$.ajax({
								type:'post' ,
								url:'TestServlet?method=ajax' , 
								async: true , //异步 
								cache: false , //清除缓存  ,
								//timeout:3000 ,
								data:{
									username: $('#myform').find('input[name=username]').val(),
									password: $('#myform').find('input[name=password]').val(),
									id: $('#myform').find('input[name=id]').val()
								} ,
								dataType:'text' ,   //json
								success:function(data){
										var data = $.parseJSON(data);
										alert(data.message);
								}
						});
					});

			});
			
	
	</script>
  </head>
  
  <body>
  
  		<form id="myform" action="" method="post">
  				用户名:<input name="username" value="" /><br/>
  				密码:<input name="password" value="" /><br/>
  				id号:<input name="id" value="" /><br/>
  				<input id="btn" type="button" value="提交" />
  		</form>
  
  
  </body>
</html>
