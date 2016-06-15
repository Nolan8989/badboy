<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>view</title>
<link rel="stylesheet" href="../css/index.css"/>
<script src="../js/jquery-1.7.1.min.js"></script>
<style>
.k_scroll {width:500px;height:100%;border:1px solid red;overflow-x:hidden;overflow-y:scroll;margin:0 auto;line-height:30px;}
</style>
<script type="text/javascript" src="js/sxt.js"></script>
</head>
<body style="height:600px;">

<div class="k_scroll" id="k_id">
	<div>
	<c:forEach items="${userList }" var="sc" varStatus="vs">
		<table width=100% align="center" border="1" bordercolor="gray" cellspacing="0">
			<tr>
				<th>序号</th>
				<td>${vs.count }</td>
			</tr>
			<tr>
				<th>姓名</th>
				<td>${sc.username }</td>
			</tr>
			<tr>
				<th>性别</th>
				<td>${sc.sex eq 1  ? "女" :"男"}</td>
			</tr>
			<tr>
				<th>邮箱</th>
				<td>${sc.email }</td>
			</tr>
			<tr>
				<th>地址</th>
				<td>${sc.address }</td>
			</tr>
		</table>
		
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
	</c:forEach>
	</div>
</div>
<script>


var star = 3;
var step = 2;
var doc = document;
var oDiv = doc.getElementById('k_id');
function addEvent(obj,type,fn){
	if(!obj){return null;}
	if(obj.addEventListener){
		obj.addEventListener(type,function (ev){
			var rtn=fn.call(obj,ev);			
			if(rtn==false){
				ev.cancelBubble=true;
				ev.preventDefault();
			}
		},false);
	}else{
		obj.attachEvent('on'+type,function (){
			var rtn=fn.call(obj,event);
			if(rtn==false){
				event.cancelBubble=true;
				return false;
			}
		})
	}
};
addEvent(oDiv,'scroll',function(){
	var scrollBottom = oDiv.scrollHeight - oDiv.scrollTop - oDiv.clientHeight;
	if(scrollBottom<=0){
		addFn();
	}
})
addEvent(window,'scroll',function(){
	var scrollHeight = document.documentElement.scrollHeight || document.body.scrollHeight;
	var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
	var clientHeight = document.documentElement.clientHeight || document.body.clientHeight;
	var scrollBottom =  scrollHeight - scrollTop - clientHeight;
	if(scrollBottom<=0){
		addFn();
	}
})
function addFn(){
	sxt.ajax({
  				type : 'get',
  				url : 'moreUserServlet',
  				data : 'username=刘&star=' +star + '&step=' + step,
  				dataType : 'json',
  				success: function(rs){
//alert(rs);
  					var conn = document.getElementById("k_id");
  					
  					
  					//这里之所以判断非null 和 length 是因为gson 写出来的时候是个list,在servlet中list可以在
  					//if中new也可以在dopost方法中new,如果list没执行add ,那可能性就是'null'和'[]'.不得不佩服老师功力深厚!
  					if(rs != null &&  rs.length >0){
  						var str = "";
  						var l= star;
  						str = conn.innerHTML;
  						for(var i = 0 ; i < rs.length; i++){
  							str += "<table width=100% align='center' border='1' bordercolor='gray' cellspacing='0'><tr><th>序号</th><td>"+ l++ + "</td></tr><tr><th>姓名</th><td>" + rs[i].username +"</td></tr><tr><th>性别</th><td>" + ( (rs[i].sex == 1) ? "女" :"男") + "</td></tr><tr><th>邮箱</th><td>" + rs[i].email +"</td></tr><tr><th>地址</th><td>" +rs[i].address +"</td></tr></table><br/><br/><br/><br/><br/>"
  							star = rs[i].startPage;
  							step = rs[i].step;
  							
  						}
  						conn.innerHTML = str;
  										
  					} 
  				}
  			});
}
</script>
</body>
</html>