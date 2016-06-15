<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<script type="text/javascript" src="js/sxt.js"></script>
	<script>
		function findStu(cid){
			sxt.ajax({
				type:"get",
				url:"StudentServlet",
				data:"cid="+cid,
				datatype:"text",
				success:function(rs){
					document.getElementById("showstu").innerHTML=rs;
					document.getElementById("showstu").style.display="block";
				}
			});
		}
	</script>
  </head>
  
  <body>
    <c:forEach items="${clist }" var="cs">
    	<div onclick="findStu(${cs.id});" style="float:left;border:blue solid 1px;width: 60px;line-height: 20px;margin-left: 3px">${cs.classname }</div>
    </c:forEach>
    <div style="clear: both;"></div>
  <div style="border: red dashed 1px;width: 300px;display: none" id="showstu" ></div>
  </body>
</html>
