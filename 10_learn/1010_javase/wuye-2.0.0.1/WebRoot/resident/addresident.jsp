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
	<style type="text/css">
		span {
	color: red;
}
	</style>
	<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/My97DatePicker/WdatePicker.js"></script>
	 <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.js"></script>
	 <script type="text/javascript" src="${pageContext.request.contextPath }/js/validate.js"></script>
	 <script type="text/javascript">

  $(function(){
				//	alert("test")
				$.ajax({
					type:'post',
					url:'${pageContext.request.contextPath }/selectRoomServlet.action',
					data:'cmd=build',
					dataType:'json',
					success:function(rs){
						var b = $("#buildid");
						//alert(rs);
						for(var i=0;i<rs.length;i++){
							b.append("<option value="+rs[i].id+" >"+rs[i].buildname+"</option>");
						}
					}
				})



				$("#buildid").change(function(){
						var bid = $(this).val();
//						alert(bid);

						$.ajax({
							type:'post',
							url:"${pageContext.request.contextPath }/selectRoomServlet.action",
							data:'cmd=unit&bid='+bid,
							dataType:'json',
							success:function(rs){
							//alert(rs);
							var u = $("#unitid");
							u.children().remove("option[value!=0]");
							var r = $("#roomid");
							r.children().remove("option[value!=0]");	
							
							for(var i=0;i<rs.length;i++){
								u.append("<option value="+rs[i].id+" >"+rs[i].unitname+"</option>");
							}
							}
						})
				})


				
				$("#unitid").change(function(){
						var uid = $(this).val();
//						alert(bid);

						$.ajax({
							type:'post',
							url:"${pageContext.request.contextPath }/selectRoomServlet.action",
							data:'cmd=room&uid='+uid,
							dataType:'json',
							success:function(rs){
							//alert(rs);
							var u = $("#roomid");
							u.children().remove("option[value!=0]");
							for(var i=0;i<rs.length;i++){
								u.append("<option value="+rs[i].id+" >"+rs[i].roomname+"</option>");
							}
							}
						})
				})
			
  })
  
  function  checkRsdForm(obj){
	var rsdnamef = checkForm(obj.rsdname,$("#rsdnameMsg")[0],/^[\u4e00-\u9fa5]{2,12}$/,"住户名不能为空","住户名只能是2-12汉字！",true);
	var agef = checkForm(obj.age,$("#ageMsg")[0],/^(([1-9]\d?)|(1[01234]\d))$/,"age不能为空","age只能是1-149之间数字！",true);
	var identityf = checkForm(obj.identity,$("#idMsg")[0],/^((\d{18})|(\d{17}[xX]))$/,"身份证号不能为空","身份证号格式不对！",true);
	var phonef = checkForm(obj.phone,$("#phoneMsg")[0],/^(1[358]\d{9})$/,"手机 号不能为空","手机号格式不对！",true);
	var emailf = checkForm(obj.email,$("#emailMsg")[0],/^\w+@[a-zA-Z0-9\-]+(\.[a-zA-Z]{2,3}){1,2}$/,"邮箱不能为空","邮箱格式不对！",true);
	var roomf = checkForm(obj.room_id,$("#roomMsg")[0],/^[1-9]\d*$/,"","所租房子必选！",true);
	//alert(rsdnamef)
	var start = $("#d4311").val();
	var  startFlag = true;
	
		$("#startMsg").html("")
	if(start.length==0){
		startFlag = false;
		$("#startMsg").html("合同起始时间不能为空")
	}
	var end = $("#d4312").val();
	var  endFlag = true;
	
		$("#endMsg").html("")
	if(end.length==0){
		endFlag = false;
		$("#endMsg").html("合同结束时间不能为空")
	}
	var rs = rsdnamef&&agef&&identityf&&phonef&&emailf&&roomf&&startFlag&&endFlag;
	return  rs;
  }

  window.onload=function(){
		var flag = "${addflag}";
		//alert(true=="true")
		//alert(NaN==NaN)
		//alert(Number("true"))
		//alert(Number(true))
	//	alert(Number(""));
		// boolean  number  string
		
		if(flag=="0"){

				alert("服务器正忙，稍后再试！")
		}else if("1"==flag){
			alert("添加成功！");
		}

  }
  </script>
</head>
<body>
${pageContext.request.contextPath }
<form action="${pageContext.request.contextPath }/residentServlet.action?cmd=addrsd" method="post"  name="rsdform" onsubmit="return checkRsdForm(this)" >
<table width="90%" border="1" style="border-collapse:collapse"   bordercolor="#00FF99">
  <tr>
    <td width="20%"><div align="right">住户名：</div></td>
    <td width="80%"><input name="rsdname" type="text" />
    	<span id="rsdnameMsg"></span>
    </td>
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
    <td><input name="age" type="text" /><span id="ageMsg"></span></td>
  </tr>
  <tr>
    <td><div align="right">身份证号：</div></td>
    <td><input name="identity" type="text" maxlength="18" />
    <span id="idMsg"></span>
    </td>
  </tr>
  <tr>
    <td><div align="right">学历：</div></td>
    <td><select name="degree"  >
        <option value="1">高中以下</option>
        <option  value="2">高中</option>
        <option value="3">大专</option>
        <option value="4" selected="selected">本科</option>
        <option value="5">硕士</option>
        <option value="6">博士</option>
        <option value="7">博士以上</option>

      </select></td>
  </tr>
  <tr>
    <td><div align="right">手机号：</div></td>
    <td>
    <input name="phone" type="text" maxlength="11" /><span id="phoneMsg"></span>
    </td>
  </tr>
  <tr>
    <td><div align="right">邮箱：</div></td>
    <td>
    <input name="email" type="text" /><span id="emailMsg"></span>
    </td>
  </tr>
  <tr>
    <td><div align="right">所租房子：</div></td>
    <td>
    <select id="buildid" name="build_id">
    	<option value="0">请选择楼栋</option>
    </select >
    <select id="unitid" name="unit_id">
    	<option  value="0">请选择单元</option>
    </select >
    <select id="roomid" name="room_id">
    	<option  value="0">请选择房间</option>
    </select>
    <span id="roomMsg"></span>
    </td>
  </tr>
  <tr>
    <td><div align="right">合同有效期：</div></td>
    <td>
<input id="d4311" class="Wdate" type="text" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'d4312\')||\'2020-10-01\'}'})"/>
<span id="startMsg"></span>
<input id="d4312" class="Wdate" type="text" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'d4311\')}',maxDate:'2020-10-01'})"/>
<span id="endMsg"></span>
</td>
  </tr>
  <tr>
    <td><div align="right">住户照片：</div></td>
    <td>
    	<input name="rsdimg" type="file" />
    	
    	<%
    		String t = UUID.randomUUID().toString();
    		session.setAttribute("token",t);
    		 
    	%>
    	
    	<input type="hidden" name="token" value="${token }">
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

