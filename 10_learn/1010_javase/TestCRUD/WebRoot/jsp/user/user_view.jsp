<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="norlando.entity.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript">
		function addUser(){
			window.location = "<%=basePath%>jsp/user/user_save.jsp";
		};
		
		
		function userDelete(id){
			if(window.confirm("确认删除当前记录？")){
				window.location = "UserServlet?method=delete&id=" + id;
			}else{
				return;
			}
		};
	</script>
	<style type="text/css">
body {margin:0;}
#layout {
	height: 300px;
	background: #99FFcc;
	margin: 0px;
}

</style>

  </head>
  <div>
  <body id="layout">
  		
  		<div><input type="button" value="添加用户" onclick="javascript:addUser();" /></div>
	   <table width="90%" border="1">
		   <tr>
		   	<th>序号</th>
		   	<th>用户名</th>
		   	<th>密码</th>
		   	<th>年龄</th>
		   	<th>性别</th>
		   	<th>出生日期</th>
		   	<th>爱好</th>
		   	<th>所属城市</th>
		   	<th>个人描述</th>
		   	<th>操作</th>
		   </tr>
	<%--<%
			request.setCharacterEncoding("utf-8");
			List<User> userList = (List<User>)request.getAttribute("userList");
			Iterator<User> ita = userList.iterator();
			int i = 1;
			while(ita.hasNext()){
			User user = ita.next();
			
		 %> --%>	
		 <c:forEach var="temp" step="1"items="${userList }" varStatus="vs">
		  
		   <tr>
			   <td>${vs.count}</td>
			   <td>${temp.username}</td>
			   <td>${temp.password}</td>
			   <td>${temp.age}</td>
			   <td>${temp.sex}</td>
			   <td>${temp.birthday}</td>
			   <td>${temp.favorite}</td>
			   <td>${temp.city}</td>
			   <td>${temp.description}</td>
			   <td>
			   	<a href="UserServlet?method=preupdate&id=${temp.id}">修改</a>
			   	<input type=button value="删除" onclick="userDelete('${temp.id}')"/>
			   		
			   </td>
		   </tr>
		 </c:forEach>  
	  <%--  <%
	   		}
	    %>--%>
		 
	   </table>
	   </div>
  </body>
</html>
