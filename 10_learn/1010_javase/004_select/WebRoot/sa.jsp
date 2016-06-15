<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	
    <base href="<%=basePath%>">
    
    <title>My JSP 'sa.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/sxt.js"></script>
	 <style type="text/css" >
  		.container{
			border : red solid 1px;
			width:365 ;
			display :none;
		}
  	
  		.selected{
  			background-color:gray
  		}
 	 </style>
  <script type="text/javascript">
  
  
  var selectIndex = -1;
  var cachevalue = "";
  var timeout = 0;
  
  
  
  
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
							document.getElementById("sel").value=this.innerHTML; 
							// this 函数的持有者, 如果这里是d[i] 就不能执行了.因为这里是绑定事件,但是d[i]方法执行之后就消失了.
//alert(this.innerHTML);
							window.location.href = "userServlet?usernam=" + this.innerHTML;
						}
				}
			}
		}
  
  
  
  
  
  function keychangedown(obj,event){
  	var evt = window.event || event;
  	var keyv = evt.keyCode;
  	if(keyv == 38 || keyv == 40){
  	
  		//得到div1的所有孩子.
	  	
	  	var csele = getChildsEle("div1");
	  	
	  	if(keyv == 38 && csele.length > 0){
	  		selectIndex  = (selectIndex > 0) ? (--selectIndex ) : (csele.length-1);
	  		
	  	};
	  	
	  	if(keyv == 40 && csele.length > 0){
	  		selectIndex  = selectIndex < (csele.length-1 ) ? (++selectIndex ) : 0;
	  		
	  	};
	  	
	  	csele[selectIndex].className = "selected";
	  	obj.value = csele[selectIndex].innerHTML;
  	}
  	
  	
  	
  };
  
  //根据id 得到元素,并且得到它所有孩子中的元素节点的数组.
  function getChildsEle(id){
  	//得到div1的所有孩子.
 	var sc= document.getElementById(id).childNodes;
 	var csele = [];
 	for(var i = 0; i <sc.length; i++){
 		if(sc[i].nodeType == 1){
 			sc[i].className = "";
 			csele.push(sc[i]);
 //alert(sc[i]);
 		}
 	}
 	
 	return csele;
  };
  
  function keychange(obj,event){
  	var evt = window.event || event;
  	var keyv = evt.keyCode;
  	
  	if(cachevalue != obj.value && keyv != 38 && keyv != 40){//这里有个问题,为什么不是up 和down
  	//	if(obj.value != ""){
  			cachevalue = obj.value;
  		
  		//alert(cachevalue);
  		window.clearTimeout(timeout);
  		timeout = window.setTimeout(function(){
  			sxt.ajax({
  				type : 'get',
  				url : 'sugServlet',
  				data : 'username='+ obj.value,
  				dataType : 'json',
  				success: function(rs){
//alert(rs);
  					var conn = document.getElementById("div1");
  					//这里之所以判断非null 和 length 是因为gson 写出来的时候是个list,在servlet中list可以在
  					//if中new也可以在dopost方法中new,如果list没执行add ,那可能性就是'null'和'[]'.不得不佩服老师功力深厚!
  					if(rs != null &&  rs.length >0){
  						var str = "";
  						for(var i = 0 ; i < rs.length; i++){
  							str +="<div>" + rs[i] + "</div>";
  						}
  						conn.innerHTML = str;
  						conn.style.display = "block";  					
  					}else{
  						conn.innerHTML = "";
  						conn.style.display = "none";
  					} 
  				}
  			});
  		},500);
  		
  //	};
  	
  	}
  	
  	
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
  </head>
 
  <body> 
    <form action="userServlet" method="get">
    	<input type="text" size="50" autocomplete="off" name="username" id="sel" onkeydown="keychangedown(this,event);" onkeyup="keychange(this,event)" />
    	<input type="submit" value="搜索" />
    	<div id="div1" class="container"  onmouseover="changeEle(this,event) "  onmousedown="stopFunc(event);"></div>
    </form>
  </body>
</html>
