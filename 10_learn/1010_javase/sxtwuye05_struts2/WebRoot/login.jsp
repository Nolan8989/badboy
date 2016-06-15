<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>物业管理系统_用户登录</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	overflow:hidden;
}
.STYLE1 {font-size: 12px}
-->
</style></head>

<body>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="9fc967">&nbsp;</td>
  </tr>
  <tr>
    <td height="604"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="604" background="images/login_02.gif">&nbsp;</td>
        <td width="989">
        
        
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="345"   >
            	<div style="position:relative; height:345px;">
	                <div style="position:absolute;left:0px;top:0px"><img src="images/login_1.jpg" /></div>
                    <div style="position:absolute;left:480px;top:300px">
                    
                    
                    <form name="loginform" action="loginServlet.action" method="post">
                       <table width="380" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="25%" height="22"><div align="right"><span class="STYLE1">用户:</span></div></td>
                            <td width="35%" height="22"><div align="left">
                                <input name="username" value="${username }" type="text" size="15" style="height:20px;border:solid 1px #bbbbbb">
                            </div></td>
                            <td width="40%" height="22">&nbsp;</td>
                          </tr>
                          <tr>
                            <td height="22"><div align="right"><span class="STYLE1">密码:</span></div></td>
                            <td height="22"><div align="left">
                                <input name="password"value="${password }" type="password" size="15" style="height:20px; border:solid 1px #bbbbbb">
                            </div></td>
                            <td height="22"><span class="STYLE1" style="color: red">${error }</span> </td>
                          </tr>
                          <tr>
                            <td height="22"><div align="right"><span class="STYLE1">验证码:</span></div></td>
                            <td height="22">
                            <div align="left">
	                            <div style="float: left">
	                                <input name="verifycode" type="text" size="4" maxlength="4" style="height:20px; border:solid 1px #bbbbbb">&nbsp;
	                            </div>
	                            <div style="float: left">
	                                <img   id="verifyimg"onclick="change(this)" alt="" src="image.jsp">
	                            </div>
                            </div></td>
                            <td height="22"><div align="left"  class="STYLE1"> <span class="STYLE1" style="color: red">${verifyerror }</span></div></td>
                          </tr>
                            <tr>
                            <td height="22">  </td>
                            <td height="22"> <div align="left"><img src="images/dl.gif" width="39" height="18" onclick="loginFunc()"></div></td>
                            <td height="22"></td>
                          </tr>
                        </table>
                      </form> 
                        
                        
                    </div>
                </div>
            	
            </td>
          </tr>
          <tr>
            <td height="47"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="539" height="47" background="images/login_05.gif" nowrap="nowrap">&nbsp;</td>
                <td width="206" background="images/login_06.gif" nowrap="nowrap"></td>
                <td width="244" background="images/login_07.gif" nowrap="nowrap">&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="212" background="images/login_08.gif">&nbsp;</td>
          </tr>
        </table>
        
        
        
        </td>
        <td background="images/login_04.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td bgcolor="70ad21">&nbsp;</td>
  </tr>
</table>
<script type="text/javascript">
	function change(obj){
		obj.src = "image.jsp?time=" + new Date().getTime();
	}
	
	function autochange(){
		var per =document.getElementById("verifyimg");
		per.src = "image.jsp?time=" + new Date().getTime();
	}
	
	window.setInterval(autochange,10*60*1000);
	
	
	
	
	function loginFunc(){
		var f = document.loginform;
		f.submit();
	}
</script>
</body>
</html>
