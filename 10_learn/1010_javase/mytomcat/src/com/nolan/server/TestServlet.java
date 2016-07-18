package com.nolan.server;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestServlet extends Servlet {

	
	private static SimpleDateFormat SDF =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 处理请求
	 */
	@Override
	public void service(Request request, Response response) {
		// TODO Auto-generated method stub
		//往客户端发送一个html
		String html = "<html><head><met http-equiv=\"Context-Type\"content=\"text/html;charset=gbk\"/>"+
		"</head>"+
				"<body>"+
		"<h2>通信服务测试信息</h2>"+
		"<h2>服务器当前时间是："+SDF.format(new Date())+"</h2>"+
		"</body></html>";
			response.print(html);	
		
	}

}
