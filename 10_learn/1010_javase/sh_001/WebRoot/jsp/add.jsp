<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"   prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
		<form action="userAction!add"  method="post"  >
			用户名： <input name="user.name"  /><br/>
			密码： <input name="user.password" /><br/>
			电话： <input name="user.phone" /><br/>
			角色： <select name="user.role">
			<s:iterator  value="#application.roleMap"  var="obj"  >
					<option  value="${obj.key }"  >${obj.value }</option>
			</s:iterator>
			</select>
			<%--
				<s:select list="#application.roleMap"  name="user.type"  theme="simple"></s:select>
			 --%>
			<br/>
			<input  type="submit">
		</form>

  </body>
</html>
