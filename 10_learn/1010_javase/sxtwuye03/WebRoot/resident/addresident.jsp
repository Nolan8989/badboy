<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>住户添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
${pageContext.request.contextPath }
<form action="rsdServlet.action" method="post" enctype="application/x-www-form-urlencoded" name="rsdform">
<table width="90%" border="1" style="border-collapse:collapse"   bordercolor="#00FF99">
  <tr>
    <td width="20%"><div align="right">住户名：</div></td>
    <td width="80%"><input name="rsdname" type="text" /></td>
  </tr>
  <tr>
    <td><div align="right">性别：</div></td>
    <td><label>
        <input type="radio" checked="checked" value="1" name="gender" id="gender_0" />
        男</label>
      <label>
        <input type="radio" name="gender"  value="0" id="gender_1" />
        女</label>
  </tr>
  <tr>
    <td><div align="right">年龄：</div></td>
    <td><input name="age" type="text" /></td>
  </tr>
  <tr>
    <td><div align="right">身份证号：</div></td>
    <td><input name="identity" type="text" /></td>
  </tr>
  <tr>
    <td><div align="right">学历：</div></td>
    <td><select name="degree"  >
        <option value="1">高中以下</option>
        <option  value="2">高中</option>
        <option value="3">大专</option>
        <option value="4">本科</option>
        <option value="5">硕士</option>
        <option value="6">博士</option>
        <option value="7">博士以上</option>

      </select></td>
  </tr>
  <tr>
    <td><div align="right">手机号：</div></td>
    <td>
    <input name="phone" type="text" />
    </td>
  </tr>
  <tr>
    <td><div align="right">邮箱：</div></td>
    <td>
    <input name="email" type="text" />
    </td>
  </tr>
  <tr>
    <td><div align="right">所租房子：</div></td>
    <td>
    <select name="build_id">
    	<option>请选择楼栋</option>
    </select>
        <select name="unit_id">
    	<option>请选择单元</option>
    </select>
        <select name="room_id">
    	<option>请选择房间</option>
    </select>
    
    </td>
  </tr>
  <tr>
    <td><div align="right">合同有效期：</div></td>
    <td>
<input id="d4311" class="Wdate" type="text" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'d4312\')||\'2020-10-01\'}'})"/>
<input id="d4312" class="Wdate" type="text" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'d4311\')}',maxDate:'2020-10-01'})"/>

</td>
  </tr>
  <tr>
    <td><div align="right">住户照片：</div></td>
    <td>
    <input name="rsdimg" type="file" />
    
    </td>
  </tr>
  <tr>
    <td><div align="right">
        <input name="" type="submit" value="添加住户" />
      </div></td>
    <td>
    <input name="" type="reset" value="重置" />
    
    </td>
  </tr>
</table>

</form>
</body>
</html>

