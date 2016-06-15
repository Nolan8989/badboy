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
.STYLE1 {
	font-size: 12px;
	color: #147233;
}
-->
</style>
<script type="text/javascript" src="js/Clock.js"></script>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="23" background="images/main_25.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="181" height="23" background="images/main_24.gif">&nbsp;</td>
        <td><div align="right" class="STYLE1" id="clock">今天是： </div></td>
        <td width="25"><img src="images/main_27.gif" width="25" height="23" /></td>
      </tr>
    </table></td>
  </tr>
</table>
  <SCRIPT type=text/javascript>
    var clock = new Clock();
    clock.display(document.getElementById("clock"));
</SCRIPT>
</body>
</html>

