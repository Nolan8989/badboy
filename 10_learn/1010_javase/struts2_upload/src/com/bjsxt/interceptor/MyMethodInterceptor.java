package com.bjsxt.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyMethodInterceptor  extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyMethodInterceptor.doIntercept() before");
		
		String str = invocation.invoke();
		System.out.println("MyMethodInterceptor.doIntercept() after");
		return str;
	}

}
