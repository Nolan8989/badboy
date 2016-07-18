package com.nolan.server;

public  abstract class Servlet {

	/**
	 * 处理请求
	 * @param request
	 * @param response
	 */
	public abstract void service(Request request , Response response);
	
}
