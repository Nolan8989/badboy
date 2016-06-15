<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="sxtc" %>    
<%
	String url = request.getParameter("url");
	String nurl ="";
	
	if(url.indexOf("?")!=-1){
		nurl = url+"&num=";
		
	}else{
		
		nurl = url+"?num=";
		
	}
	pageContext.setAttribute("nurl",nurl);

%>

<%--
	nurl = residentServlet.action?cmd=googlepage&pageSize=${page.pageSize}&num=
 <div>
	 ${nurl }${page.num }
 
 </div>
 --%>
 
 
 
<c:if test="${page.num!=page.first}">
       <a href="${nurl }${page.first }">首页</a>
       <a href="${nurl }${page.prev }">上一页</a>
 </c:if>
<c:forEach begin="${page.begin}" end="${page.end}" var="n">

<c:choose>
	<c:when test="${page.num!=n}">

		<a href="${nurl }${n }">${n }</a>
</c:when>
<c:otherwise>

	<font style="color: red ;font-size: 14px">
		${n }
		</font>
	</c:otherwise>
</c:choose>

</c:forEach>
<c:if test="${page.num!=page.last}">
        <a href="${nurl }${page.next}">下一页</a>
        <a href="${nurl }${page.last }">尾页</a>
</c:if>