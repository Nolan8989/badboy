<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '002_ajax.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/sxt.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript">
		
		//全局的索引变量
		var selectedIndex=-1;
		
		// 延时方法标记
		var timeout = 0; 

		//输入框缓存
		var  cachevalue="";
		
		//鼠标滑动   serElement target
		function changeEle(obj,event){
			var evt = window.evnet||event;
			
			var ele = evt.srcElement ||evt.target;
//alert(ele.innerHTML);
			var csele = getChildsEle("div1");
			for(var i = 0 ;i<csele.length;i++){
				if(ele == csele[i]){  //如果是=
					csele[i].className="selected";		
						selectedIndex=i;
						csele[i].onclick=function(){
							document.getElementById("keyid").value=this.innerHTML; 
							// this 函数的持有者, 如果这里是d[i] 就不能执行了.因为这里是绑定事件,但是d[i]方法执行之后就消失了.
//alert(this.innerHTML);
							window.location.href = "test?usernam=" + this.innerHTML;
						}
				}
			}
		}
		
		//封装元素集合到一个缓存数组
		
		function getChildsEle(id){
		
			var sc = document.getElementById(id).childNodes;
			var csele = [];
			for(var i = 0; i < sc.length; i++){
				if(sc[i].nodeType == 1){
					sc[i].className ="";
					csele.push(sc[i]);
				}
			}
			
			return csele;
		}
		
		//上下键滑动
		function selected(obj,event){
			var eve = window.event||event;
			var keyv = eve.keyCode;
			var k =0;
			if(keyv == 38 || keyv == 40){
			//38---up  40---down
			var sc = document.getElementById("div1").childNodes;
			var csele = [];
			for(var i = 0; i < sc.length; i++){
				if(sc[i].nodeType == 1){
					sc[i].className ="";
					csele.push(sc[i]);
					alert(csele[k++]);
				}
			}
			if(keyv == 40 && csele.length > 0){
				selectedIndex = selectedIndex < (csele.length-1) ? (++selectedIndex) : 0;
			}
			if(keyv == 38 && csele.length > 0){
				selectedIndex = selectedIndex > 0 ? (--selectedIndex) :(csele.length-1);
			}
			csele[selectedIndex].className="selected";
			obj.value=csele[selectedIndex].innerHTML;

			}
		}

		
		
			function changefu(obj,event){
			//event:firefox 和  ie 有差异
			var eve = window.event||event;
			var keyv = eve.keyCode;
			
			
			//执行ajax的入口.
			//if( (keyv >=48 && keyv<=90) || keyv == 8 || keyv == 46){ //这么写无法解决中文问题.
			if(cachevalue != obj.value && keyv != 38 && keyv != 40){
			cachevalue = obj.value;
			window.clearTimeout(timeout);
			timeout = window.setTimeout(function(){
				sxt.ajax({
					type:'get',
					url:'sugServlet',
					data:'username=' + obj.value,
					dataType:'json',
					success: function(rs){
						var con = document.getElementById("div1");
						if(rs != null && rs.length >0){
							var str = "";
							for(var i = 0; i<rs.length;i++ ){
								str +="<div>" +rs[i] + "</div>";
							}
							//写到页面中
							con.innerHTML = str;
							con.style.display="block";
						}else{
							con.innerHTML = "";
							con.style.display="none";
						}
					}
				});
			
			}, 300);
			
			}
			
/*
			 var f = document.createElement('div1');
			document.body.appendChild(f);
			var con = obj.value;
			
			var req = null;
			
			//初始化
			if(window.XMLHttpRequest){
				req = new XMLHttpRequest();
			}else if (window.ActiveXObject){
				req = new ActiveXObject("Msxml2.XMLHTTP");
			}else{
				alert("浏览器不支持");
			}
			
			req.onreadystatechange = function(){
				if(req.readyState == 4){
					var  rs = req.responseText;
					if(rs != null && rs.length >0){
						while(rs.indexOf("-")!= -1){
						var ind = rs.indexOf("-");
						var temp = "";
						 temp = rs.substring(0, ind);
						 rs = rs.substring(ind+1,rs.length-1);
						var filebtn = document.createElement('div');
						filebtn.innerHTML = temp;
						f.appendChild(filebtn);
					}else{
					
					}
					}
				}else{
				} 
			};
			req.open("post", "002_ajaxback.jsp", true);
			req.setRequestHeader("content-type","application/x-www-form-urlencoded");
			req.send("username=" + con);
			//}
*/
		}
	
	
	document.onmousedown=function(){

//console.debug("ddd");
	document.getElementById("div1").style.display='none';
//		alert("test")

 }
	
	function stopFunc(event){
		var evt = window.event || event
		if(evt.stopPropagation){ //火狐
			evt.stopPropagation();
		}
	}
	
	
	</script>
	
	
		<style type="text/css">
			.container{
				border : red solid 1px;
				width:365 ;
				display :none;
			}
			
			.selected{
				background-color : gray
			}
		</style>
  </head>
  
  <body>
  <form action="test"  method="get">
    <input  id="keyid" type="text" size="50"  name="username" autocomplete="off" onkeyup="changefu(this,event)"  onkeydown="selected(this,event)"/>
    <input type="submit"value="搜索" />
 	<div  id="div1"  class="container" onmousedown="stopFunc(event);"  onmouseover="changeEle(this,event)" ></div>						
  </form>
  </body>
</html>
