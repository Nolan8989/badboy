m--dao--po
v--servlet--action
c--service--

1.页面里面的路径  /test   /相对于端口号后面的/
2.重定向也属于页面的路径


3.转发  /test   /相对于项目的根目录

test  相对于你请求的servlet相对的目录


chart.setDataXML("<c:import url="../analysisServlet.action"><c:param name="cmd" value="ajaxdegree2"></c:param><c:param name="build_id" value="1"></c:param></c:import>");



在servlet里面设置。。必选放在request.getParameter最初使用之前
requeset.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");


useBodyEncodeForURI=utf-8 ===get()
	
tomcat=ios8859-1
修改tomcat默认编码EnocdingURI=utf-8









 <jsp-property-group>
   <url-pattern>*.jsp</url-pattern>
   <trim-directive-whitespaces>true</trim-directive-whitespaces>
 </jsp-property-group>