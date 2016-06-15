<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'grid.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/ext-base.js"></script>
    <script type="text/javascript" src="js/ext-all.js"></script>
    <link rel="stylesheet" type="text/css" href="css/ext-all.css"/>
	<script language="JavaScript" src="js/FusionCharts.js"></script>
	<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
	<script type="text/javascript">
		var mywin;
		function openWin(url,width,heigth){
				mywin = new Ext.Window({
				title:"我的一个窗口！",
				width:width,
				height:heigth,
				modal:false,
				renderTo:document.body,
				maximizable :true,
				draggable:true,
				//constrainHeader:true,
				constrain :true,
				html:"<iframe id='iffff' src='"+url+"' name='childf' frameborder=\"0\"   width=\"100%\" height=\"100%\"></iframe>"
			});
				mywin.show();//显示窗口
		}
		function test1(){
			mywin.show();    //可以使用公开的方法
		}
		function test3(){
			mywin.hide();    //可以使用公开的方法
		}
		function test2(){
			mywin.close();    //可以使用公开的方法
		}
		function test4(){
			openWin("test03_in.html",500,500);
		}	
		$(function(){
			$.ajax({
				type:'get',
				url:'findAddrServlet.action',
				data:'cmd=build',
				dataType:'json',
				success:function(rs){
					//alert(rs)
					var b = $("#build_id");
					for(var i=0;i<rs.length;i++){
						b.append($("<option value='"+rs[i].id+"'>"+rs[i].buildname+"</option>"  ));
					}
				}
			})


			$("#build_id").change(function(){
					var t = $(this).val();
					//alert(t)
					$.ajax({
						type:'get',
						url:'analysisServlet.action',
						data:'cmd=ajaxdegreejsp&build_id='+t+"&time="+new Date().getTime(),
						success:function(rs){
							//alert(rs);
							   var chart = new FusionCharts("Charts/Pie3D.swf", "ChartId", "600", "500", "0", "0");
								 //  chart.setDataURL("Data/Pie3D.xml");								 
							//	 alert(newrs);
							//	alert(rs);
							//	eval("var nrs = \""+rs+"\"");
							//	alert(nrs)
								 chart.setDataXML(rs);
								 chart.setTransparent(true);		   
								 chart.render("chartdiv");
						}
					})
			})
		})
	</script>
  </head>
  
  <body>
  
  <select id="build_id">
  </select>
   <div id="chartdiv" align="center"> 
        FusionCharts. </div>
   <div id="chartdiv2" align="center"> 
        FusionCharts. </div>
      <script type="text/javascript">
			var chart = new FusionCharts("Charts/Pie3D.swf", "ChartId", "600", "500", "0", "0");
//		 	chart.setDataURL("Data/Pie3D.xml");	
		 	chart.setDataXML("${chartXml}");
			chart.setTransparent(true);		   
			chart.render("chartdiv");
			
			var chart2 = new FusionCharts("Charts/Line.swf", "ChartId", "500", "300", "0", "0");
//		    chart.setDataURL("Data/Pie3D.xml");	
			chart2.setDataXML("${chartXml}");
			chart2.setTransparent(true);		   
		    chart2.render("chartdiv2");

			function myJS(a,b,c){
				if(b>0){
					var bid = $("#build_id").val();
					openWin("residentServlet.action?cmd=showdegree&degreeid="+c+"&build_id="+bid,500,400);
				}else{
					alert("该学历下面还没有人！！！！！！");
				}
		   } 
		</script> 
  </body>
</html>
