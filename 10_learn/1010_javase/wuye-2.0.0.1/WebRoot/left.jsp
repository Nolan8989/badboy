<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>


	<link rel="StyleSheet" href="css/dtree.css" type="text/css" />
	<script type="text/javascript" src="js/dtree.js"></script>
	<script type="text/javascript">

		d = new dTree('d');

		d.add(0,-1,'老夏版物业系统');
		d.add(1,0,'住户管理');
		d.add(2,1,'住户添加','resident/addresident.jsp',"添加住户","rsdcontent");
		d.add(3,1,'住户列表','residentServlet.action?cmd=pagebaidu',"","rsdcontent");
		d.add(32,1,'g住户列表','residentServlet.action?cmd=googlepage',"","rsdcontent");
		d.add(33,1,'住户学历分析','analysisServlet.action?cmd=degree&build_id=1',"","rsdcontent");
		d.add(34,1,'住户年龄段分析','analysisServlet.action?cmd=agepart&build_id=1',"","rsdcontent");
		d.add(4,0,'设备管理','example01.html');
		d.add(5,4,'设备添加','example01.html');
		d.add(6,4,'设备添加','example01.html');
		 
		window.onload=function(){
			//alert(d);
			document.getElementById("menu").innerHTML=d;
		}

	</script>
</head>

<body>
<table width="173" height="100%" border="0" cellpadding="0" cellspacing="0" style="table-layout:fixed;">
  <tr>
    <td style="width:4px;" ></td>
    <td width="169" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="20" background="images/main_11.gif">&nbsp;</td>
      </tr>
      <tr>
        <td> <div id="menu"  ></div> </td>
      </tr>
    </table></td>
  </tr>
</table>


</body>
</html>

