package com.bjsxt.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestActoin extends ActionSupport {
	private String cmd;
//	com.opensymphony.xwork2.interceptor.TimerInterceptor
//	org.apache.struts2.interceptor.TokenInterceptor
	private String uname;
	
	private String pwd;
	
	public String getCmd() {
		return cmd;
	}



	public void setCmd(String cmd) {
		this.cmd = cmd;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


//
	public String add(){
		System.out.println("TestActoin.add()"+this.pwd+this.uname);
		return this.SUCCESS;
	}
	
	
	public String add2(){
		System.out.println("TestActoin.add()"+this.pwd+this.uname);
		return this.SUCCESS;
	}
	
	
	public String add3(){
		System.out.println("TestActoin.add()3333333333333333"+this.pwd+this.uname);
		return this.SUCCESS;
	}
	
	
	public String add4(){
		System.out.println("TestActoin.add()4444444444"+this.pwd+this.uname);
		return this.SUCCESS;
	}
	
	
 
	
}
