<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language="JavaScript" src="js/FusionCharts.js"></script>
  </head>
  
  <body>
    <div id="chartdiv" align="center"> 
        FusionCharts. </div>
 
      <script type="text/javascript">
		   var chart = new FusionCharts("Charts/Column3D.swf", "ChartId", "800", "500", "0", "0");
		 //  chart.setDataURL("Data/Pie3D.xml");	
		 chart.setDataXML("${chartXml}");
			chart.setTransparent(true);		   
		   chart.render("chartdiv");
		</script> 
		
 
  </body>
</html>
