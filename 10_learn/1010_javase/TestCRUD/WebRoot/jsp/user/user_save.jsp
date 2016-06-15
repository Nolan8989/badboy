<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'save_jsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form action="UserServlet?method=save" method="post">
   		用户名:<input name="username"/><br/>
   		密码:<input type="password" name="password" /><br>
  		性别:男<input checked type="radio" name="sex" value="男" />女<input type="radio" name="sex" value="女" /><br>
  		年龄:<input name="age" /><br>
  		出生日期:<input name="birthday" value="" /><br>
  		favorite:
  		足球<input name="favorite" type="checkbox" value="1" />
  		篮球<input name="favorite" type="checkbox" value="2" />
  		羽毛球<input name="favorite" type="checkbox" value="3" /><br>
   		城市:<select name="city">
  					<option value="1">北京</option>
  					<option value="2">上海</option>
  					<option value="3">天津</option>
  					<option value="4">深圳</option>	
  				</select><br>
   		个人描述:<textarea name="description" rows="5" cols="30"></textarea><br>
  			<center>
  				<input type="submit" value="保存" />
  				<input type="reset" value="重置"/>
  				<input type="button" value="上一步" onclick="javascript:history.back();"/>
  			</center>
  		
   </form>
   
  </body>
</html>
