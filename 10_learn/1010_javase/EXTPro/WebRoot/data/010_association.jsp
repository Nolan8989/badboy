<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
{
	id: 1 ,
	name: '张三' , 
	products:[
		{
			id:1 , 
			name:'产品1' , 
			user_id:1
		},
		{
			id:2 , 
			name:'产品2' ,
			user_id:1
		}
	]
}
