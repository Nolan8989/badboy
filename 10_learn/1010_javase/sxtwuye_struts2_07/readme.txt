m--dao--po
v--servlet--action
c--service--

1.ҳ�������·��  /test   /����ڶ˿ںź����/
2.�ض���Ҳ����ҳ���·��


3.ת��  /test   /�������Ŀ�ĸ�Ŀ¼

test  ������������servlet��Ե�Ŀ¼


chart.setDataXML("<c:import url="../analysisServlet.action"><c:param name="cmd" value="ajaxdegree2"></c:param><c:param name="build_id" value="1"></c:param></c:import>");



��servlet�������á�����ѡ����request.getParameter���ʹ��֮ǰ
requeset.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");


useBodyEncodeForURI=utf-8 ===get()
	
tomcat=ios8859-1
�޸�tomcatĬ�ϱ���EnocdingURI=utf-8









 <jsp-property-group>
   <url-pattern>*.jsp</url-pattern>
   <trim-directive-whitespaces>true</trim-directive-whitespaces>
 </jsp-property-group>