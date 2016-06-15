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
  </head>
  
  <body>

	<table  border="1">
		<tr>
			<td>用户名</td>
			<td>密码</td>
			<td>电话</td>
			<td>角色</td>
			<td>操作</td>
		</tr>
	
		<!-- 
			var
			ActionContext 
			$(name)
			temp 
		 -->
		<s:iterator  value="list"  var="obj" >
			<tr>
				<td>${obj.name }</td>
				<td>${obj.pwd }</td>
				<td>${obj.phone }</td>
				<td>
					<s:property value="#application.roleMap[#obj.type]"  />
				</td>
				<td>操作</td>
			</tr>
		</s:iterator>
	</table>


  </body>
</html>
