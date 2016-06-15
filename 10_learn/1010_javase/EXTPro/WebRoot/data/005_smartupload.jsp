<%@ page contentType="text/html; charset=gbk" language="java" import="java.util.*" errorPage="" %>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="com.jspsmart.upload.File"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%--
			//第一步：创建上传下载对象
			SmartUpload su = new SmartUpload();
			//第二步：对于当前servlet的初始化
			su.initialize(pageContext); 
			//第三步：限制上传文件的条件(约束信息设置)
			su.setMaxFileSize(100000);			//限制每个文件上传的最大长度
			su.setTotalMaxFileSize(1000000);	//限制上传文件的总长度
			su.setAllowedFilesList("doc,txt,jpg,gif,png");	//允许上传文件的类型(根据扩展名进行限制)
			su.setDeniedFilesList("exe,bat,,");				//限制上传文件的类型
			//第四步：开始上传
			su.upload();
			//获取上传的文件方法：
			File file = su.getFiles().getFile(0);
			String fileName = file.getFileName();
			String fieldName = file.getFieldName();
			String fileExt  = file.getFileExt();
			int fileSize = file.getSize();
			String filePath = null;
			
			if(fileSize > 0){
				//第五步：保存文件
				ServletContext context = this.getServletContext();
				String baseFilePath = context.getRealPath("/upload");
				// uuid
				fileName = fileName.substring(0, fileName.indexOf("."))+UUID.randomUUID().toString() +"."+fileExt;
				filePath = baseFilePath +"/"+ fileName;
				System.out.println(filePath);
				file.saveAs(filePath);				
			}
			response.setContentType("text/html;charset=gbk");
			response.getWriter().print("{'success':true,'message':'上传成功'}");	
			
			
--%>