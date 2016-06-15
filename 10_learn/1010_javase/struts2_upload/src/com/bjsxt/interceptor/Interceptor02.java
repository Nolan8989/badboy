package com.bjsxt.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor02 extends AbstractInterceptor{

//	org.apache.struts2.interceptor.FileUploadInterceptor

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
//		invocation.getInvocationContext().getParameters();
//		ServletActionContext.getResponse()
		
		System.out.println("MyInterceptor01.intercept() in222222222222222222");
		String rs = invocation.invoke();//chain.doFilter()其传递作用
		
		System.out.println("MyInterceptor01.intercept()out222");
		return rs;
	}

}
