package norlando.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 浏览器请求服务
 * @author Administrator
 *
 */
public class Request {
	/**
	 * 服务器端口号
	 */
	private int prot;
	/**
	 * 请求服务器的地址
	 */
	private String host;
	/**
	 * 请求的Url的相对路径
	 */
	private String urlPattern;
	/**
	 * 请求中的数据
	 */
	private Map map = new HashMap();
	/**
	 * 请求的方式
	 */
	private String method;
	
	/**
	 * 请求的信息
	 */
	private String headInfo;
	
	private InputStream inStream;
	
	protected Request(InputStream inStream, int port){  //受保护的类型
		
		this.inStream = inStream;
		this.prot = port;
		parseRequestHead();
	}

	private void parseRequestHead() {  //私有方法;
		// TODO Auto-generated method stub
		byte[] buf = new byte[1024];
		
		try {
			inStream.read(buf);
			headInfo = new String(buf);
			System.out.println(headInfo);
			method = headInfo.substring(0,headInfo.indexOf("/")).trim();
			System.out.println("请求方式:" + method);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
	
	
	
	
}
