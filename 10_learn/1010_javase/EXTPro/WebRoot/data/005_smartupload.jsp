<%@ page contentType="text/html; charset=gbk" language="java" import="java.util.*" errorPage="" %>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="com.jspsmart.upload.File"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%--
			//��һ���������ϴ����ض���
			SmartUpload su = new SmartUpload();
			//�ڶ��������ڵ�ǰservlet�ĳ�ʼ��
			su.initialize(pageContext); 
			//�������������ϴ��ļ�������(Լ����Ϣ����)
			su.setMaxFileSize(100000);			//����ÿ���ļ��ϴ�����󳤶�
			su.setTotalMaxFileSize(1000000);	//�����ϴ��ļ����ܳ���
			su.setAllowedFilesList("doc,txt,jpg,gif,png");	//�����ϴ��ļ�������(������չ����������)
			su.setDeniedFilesList("exe,bat,,");				//�����ϴ��ļ�������
			//���Ĳ�����ʼ�ϴ�
			su.upload();
			//��ȡ�ϴ����ļ�������
			File file = su.getFiles().getFile(0);
			String fileName = file.getFileName();
			String fieldName = file.getFieldName();
			String fileExt  = file.getFileExt();
			int fileSize = file.getSize();
			String filePath = null;
			
			if(fileSize > 0){
				//���岽�������ļ�
				ServletContext context = this.getServletContext();
				String baseFilePath = context.getRealPath("/upload");
				// uuid
				fileName = fileName.substring(0, fileName.indexOf("."))+UUID.randomUUID().toString() +"."+fileExt;
				filePath = baseFilePath +"/"+ fileName;
				System.out.println(filePath);
				file.saveAs(filePath);				
			}
			response.setContentType("text/html;charset=gbk");
			response.getWriter().print("{'success':true,'message':'�ϴ��ɹ�'}");	
			
			
--%>