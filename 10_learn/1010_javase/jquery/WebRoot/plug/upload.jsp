<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
    <link href="jquery/uploadify/example/css/default.css" rel="stylesheet" type="text/css" />
    <link href="jquery/uploadify/uploadify.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
    <script type="text/javascript" src="jquery/uploadify/swfobject.js"></script>
    <script type="text/javascript" src="jquery/uploadify/jquery.uploadify.v2.1.0.min.js"></script>

    <script type="text/javascript">
        $(function(){
            $("#uploadify").uploadify({
                'uploader': 'jquery/uploadify/uploadify.swf',		//插件导入 结合flash
                'script': '../UploadServlet',						//后台提交action 必须是相对路径 
                'cancelImg': 'jquery/uploadify/cancel.png',			//图片 
                'folder': 'upload',									//文件夹
                'queueID': 'fileQueue',								//列队上传
                //'fileDataName' : 'myfile' ,
                'auto': false,										//是否自动上传								
                'multi': true										//是否支持多个上传 
            });
        });  
    </script>

</head>
  <body>
    <div id="fileQueue"></div>
    <input type="file" name="uploadify" id="uploadify" />
    <p>
      <a href="javascript:$('#uploadify').uploadifyUpload()">上传</a>| 
      <a href="javascript:$('#uploadify').uploadifyClearQueue()">取消上传</a>
    </p>
  </body>
</html>
