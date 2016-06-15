package com.bjsxt.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor01 implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor01.destroy()");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor01.init()");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
//		invocation.getInvocationContext().getParameters();
//		ServletActionContext.getResponse()
		
		System.out.println("MyInterceptor01.intercept() in");
		String rs = invocation.invoke();//chain.doFilter()其传递作用
		
		System.out.println("MyInterceptor01.intercept()out");
		return rs;
	}

}
