<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
	<link rel="stylesheet" type="text/css" href="jquery/jquery-autocomplete/jquery.autocomplete.css" />
	<script type='text/javascript' src='jquery/jquery-autocomplete/jquery.autocomplete.js'></script>
	
	<script type='text/javascript'>
	  $(function(){
		  
		  // 两个参数 第一个参数 服务器的地址 
		   $("#queryString").autocomplete("AutoCompleteServlet?method=search", {
			   minChars: 1,			//输入的最小字符
	           max:10,				//最多显示的列表数
	           width: 150, 			
	           dataType: 'json',	//接受json数据 
	           matchContains: true,
	           autoFill: false,
	           //如果需要另外传值给action的话可以用这样的方式,如果只是把input里面的值传递给action的话,可以不写  
	           extraParams: {   
				   		queryString: function() { 
			               	return $("#queryString").val(); 
			            }   
	           },
	           //进行对返回数据的格式处理
	           parse: function(result) {
		               //resultList为我action里面定义的值
		               //eval("var result="+result+";");
		               var data = result.list; //{}
		               //alert(data);
		               var rows = [];
		               for(var i=0; i<data.length; i++){
		                 	rows[rows.length] = {
				                   	//我没有特殊的要求,所以三个写的一样                  
				                   	data:data[i],
				                   	value:data[i],
				                  	//result里面显示的是要返回到列表里面的值  
				                   	result:data[i]
		                 	};
		               }           
		               return rows;
	           },
	           // 循环遍历rows  每一个值
	           formatItem:function(item) {
	        	   		eval("var item='"+item+"';");
	        	   		//alert(item); 
	                   	//我没有特殊的要求,直接返回了
	                   return "<"+item+">";
	           }
	      });    
	  });
	  </script>
	 </head>
	 <body>
	   <input type='text'  id='queryString'
	    name="queryString" value="" />
	   <input type='submit' value="搜索" />
	 </body>
</html>
