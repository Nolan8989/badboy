<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table>
	<tr>
		<th>姓名</th>
		<th>email</th>
		<th>性别</th>
	</tr>  	
	<c:forEach items="${stulist }" var="stu">
	<tr>
		<td>${stu.name }</td>
		<td>${stu.email }</td>
		
		<c:if test="${stu.gender eq 0 }"><td>男</td></c:if>
		<c:if test="${stu.gender eq 1 }"><td>女</td></c:if>
	</tr>	
	</c:forEach>
  		
</table>

