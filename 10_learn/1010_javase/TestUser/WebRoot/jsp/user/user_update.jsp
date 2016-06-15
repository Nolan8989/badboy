<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="norlando.entity.User" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>
		window.onload = function(){
			var fs = document.getElementsByName("favorite");
			for ( var i = 0 ,len =fs.length ; i < len; i++) {
				if(str.indexOf(fs[i].value) != -1){
					fs[i].checked = "checked";
				}
			}
		}
	</script>

  </head>
  <%
  	User user = (User)request.getAttribute("user");
  	if(user == null){ // 这个问题暂时不能延时跳转；应该出在return那里
  		response.getWriter().write(
  		"<Script>function t(){alert('跳转到显示视图');location='/TestUser/UserServlet?method=view'};setTimeout(t(),10000);</Script>"
  		);
  		return;
  	}
  	String f = user.getFavorite();
  	response.getWriter().write("<Script> var str = '"+f+"'</Script>");
   %>
  <body>
   <form action="UserServlet?method=update" method="post">
   		<input type="hidden" name="id" value="<%=user.getId()%>"/>
   		用户名:<input name="username"value="<%=user.getUsername()%>"/><br/>
   		密码:<input type="password" name="password" value="<%=user.getPassword()%>"/><br>
  		性别:男<input checked type="radio"<%="男".equals(user.getSex())?"checked":""%> name="sex" value="男" />
  		女<input type="radio" name="sex" <%="女".equals(user.getSex())?"checked":""%> value="女" /><br>
  		年龄:<input name="age" value="<%=user.getAge() %>"/><br>
  		出生日期:<input name="birthday" value="<%=user.getBirthday() %>" /><br>
  		favorite:
  		足球<input name="favorite" type="checkbox" value="1" />
  		篮球<input name="favorite" type="checkbox" value="2" />
  		羽毛球<input name="favorite" type="checkbox" value="3" /><br>
   		城市:<select name="city">
  					<option value="1" <%="1".equals(user.getCity())?"delected":"" %>>北京</option>
  					<option value="2" <%="2".equals(user.getCity())?"delected":"" %>>上海</option>
  					<option value="3" <%="3".equals(user.getCity())?"delected":"" %>>天津</option>
  					<option value="4" <%="4".equals(user.getCity())?"delected":"" %>>深圳</option>	
  				</select><br>
   		个人描述:<textarea name="description" rows="5" cols="30"><%=user.getDescription() %></textarea><br>
  			<center><input type="submit" value="修改提交" /><input type="reset" value="重置"/></center>
  </body>
</html>
