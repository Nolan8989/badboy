package com.sanqi.pagetag;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Zhanshi extends SimpleTagSupport{
	private ArrayList al;

	public ArrayList getAl() {
		return al;
	}

	public void setAl(ArrayList al) {
		this.al = al;
	}
	private boolean operation=false;
	public boolean isOperation() {
		return operation;
	}

	public void setOperation(boolean operation) {
		this.operation = operation;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out=this.getJspContext().getOut();
		int size=al.size();
		Object[] obj=(Object[])al.get(0);
		out.write("<tr>");
		for(int i=0;i<obj.length;i++){
			out.write("<th>"+obj[i]+"</th>");
		}
		if(operation){
			out.write("<th>²Ù×÷</th>");
		}
		out.write("</tr>");
		for(int i=1;i<size;i++){
			out.write("<tr>");
			Object[] arr=(Object[])al.get(i);
			for(int j=0;j<arr.length;j++){
			out.write("<td>"+arr[j]+"</td>");
			
			}
			if(operation){
				out.write("<td>É¾³ý&nbsp;&nbsp;ÐÞ¸Ä</td>");
			}
			out.write("</tr>");
		}
		
		
	}
}
