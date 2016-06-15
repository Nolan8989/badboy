package norlando.server;

import java.io.IOException;
import java.net.ServerSocket;

public class ServletServer {

	private ServerSocket serverSocket;
	private int port;
	private boolean shutDown;
	
	
	/**
	 * 有参数构造器
	 * @param port
	 */
	public ServletServer(int port) {
		super();
		this.port = port;
	}

	/**
	 * 无参数构造器
	 */
	public ServletServer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 启动服务
	 */
	public void startServer(){
		try{
			//监听端口启动服务
			serverSocket = new ServerSocket(port);
		}catch(IOException e){
			System.out.println("监听" +port+"失败");
			System.exit(0);
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
