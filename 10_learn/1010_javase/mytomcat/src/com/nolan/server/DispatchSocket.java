package com.nolan.server;

import java.io.IOException;
import java.net.Socket;

public class DispatchSocket implements Runnable {

	
	private Socket socket;
	
	
	public DispatchSocket(Socket socket) {
		super();
		this.socket = socket;
	}








	@Override
	public void run() {
		
		try {
			System.out.println("客户端是："+socket.getRemoteSocketAddress());
			Request request = new Request(socket.getInputStream(),8080);
			
			Response response = new Response(socket.getOutputStream());
			
		//	Servlet servlet = new TestServlet();
		//	servlet.service(request,response);
			
			WebApp webApp =  WebApp.getWebApp();
			String urlPattern = request.getUrlPattern();
			ServletMapping mapping  = webApp.getServletMappings().get(urlPattern);
			if(mapping != null){
				String servletName = mapping.getServletName();
				Servlet servlet = webApp.getServletContext().getServlet(servletName);
				if(servlet != null){
					servlet.service(request,response);
				}else{
					response.println("没有获取Servlet");
				}
			}else{
				response.print("你请求的url错误，该url不正确。没有找到相应的页面！");
				
			}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally{
		closeSocket(socket);
	}
		// TODO Auto-generated method stub
	

	}
	
	
	public void closeSocket(Socket socket){
		if(socket != null){
			try{
				socket.getOutputStream().flush();
				socket.close();
			}catch(IOException  e){
				e.printStackTrace();
			}
			
		}
	}
	

}
