<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�ޱ����ĵ�</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE4 {
	font-size: 12px;
	color: #1F4A65;
	font-weight: bold;
}

a:link {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;

}
a:visited {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;
}
a:hover {
	font-size: 12px;
	color: #FF0000;
	text-decoration: underline;
}
a:active {
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}

-->
</style>
</head>

<body>
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15" height="30"><img src="images/tab_03.gif" width="15" height="30" /></td>
        <td background="images/tab_05.gif"><img src="images/311.gif" width="16" height="16" /> <span class="STYLE4">���������������б�</span></td>
        <td width="14"><img src="images/tab_07.gif" width="14" height="30" /></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="9" background="images/tab_12.gif">&nbsp;</td>
        <td bgcolor="e5f1d6"><table width="99%" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#CECECE">
          <tr>
            <td width="6%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">ѡ��</div></td>
            <td width="8%" height="18" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">���</div></td>
            <td width="24%" height="18" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">���л���ip��ַ</div></td>
            <td width="10%" height="18" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">������</div></td>
            <td width="14%" height="18" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">�ڵ�����</div></td>
            <td width="24%" height="18" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2">��������������</div></td>
            <td width="7%" height="18" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2">�༭</div></td>
            <td width="7%" height="18" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2">ɾ��</div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" ><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><img src="images/037.gif" width="9" height="9" /><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox2" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox3" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox4" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox5" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox6" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox7" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox8" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox9" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox10" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox11" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox12" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox13" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="checkbox14" type="checkbox" class="STYLE2" value="checkbox" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">A0012</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">192.168.0.124</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">wtz_fh</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">DBserver</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><a href="#">��������������</a></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/037.gif" width="9" height="9" /></span><span class="STYLE1"> [</span><a href="#">�༭</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /></span><span class="STYLE2"> </span><span class="STYLE1">[</span><a href="#">ɾ��</a><span class="STYLE1">]</span></div></td>
          </tr>
        </table></td>
        <td width="9" background="images/tab_16.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="29"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15" height="29"><img src="images/tab_20.gif" width="15" height="29" /></td>
        <td background="images/tab_21.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="40%"><div align="left"><span class="STYLE1">��120����¼����ǰ��1/10ҳ��ÿҳ10����¼</span></div></td>
            <td width="60%" class="STYLE1">&nbsp;</td>
          </tr>
        </table></td>
        <td width="14"><img src="images/tab_22.gif" width="14" height="29" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>

