package com.sanqi.pagetag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PageTag extends SimpleTagSupport{
	private int sumPage;
	public int getSumPage() {
		return sumPage;
	}
	public void setSumPage(int sumPage) {
		this.sumPage = sumPage;
	}
	public int getSumItem() {
		return sumItem;
	}
	public void setSumItem(int sumItem) {
		this.sumItem = sumItem;
	}
	public int getCurrentSize() {
		return currentSize;
	}
	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getxCurrentPage() {
		return xCurrentPage;
	}
	public void setxCurrentPage(String xCurrentPage) {
		this.xCurrentPage = xCurrentPage;
	}
	public String getxCurrentSize() {
		return xCurrentSize;
	}
	public void setxCurrentSize(String xCurrentSize) {
		this.xCurrentSize = xCurrentSize;
	}
	private int sumItem;
	private int currentSize;
	private int currentPage;
	private String url;
	private String xCurrentPage;
	private String xCurrentSize;
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out=this.getJspContext().getOut();
		//out.write("<table>");
		out.write("<tr>");
		out.write("<td colspan='3' align='center'>");
		if(currentPage==1){
			out.write("首页"+" 上一页");
		}else{
			out.write("<a href="+url+"?"+"currentPage=1"+"&currentSize="+currentSize+">");
			out.write("首页</a>");
			out.write("<a href="+url+"?"+"currentPage="+String.valueOf((new Integer(currentPage))-1)+"&currentSize="+currentSize+">");
			out.write("上一页</a>");
		}
		if(currentPage==sumPage){
			out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			out.write("下一页"+" 尾页");
		}else{
			out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			out.write("<a href="+url+"?"+"currentPage="+String.valueOf((new Integer(currentPage))+1)+"&currentSize="+currentSize+">");
			out.write("下一页</a>");
			out.write("<a href="+url+"?"+"currentPage="+sumPage+"&currentSize="+currentSize+">");
			out.write("  尾页</a>");
		}
		out.write("</td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td colspan='3' align='center'>");
		out.write("每页条数<input type='text' size='1' id='item'>"+"<input type='button' value='确定' onclick='location.href=\"showdata?currentPage=1&currentSize=\"+document.getElementById(\"item\").value'>");
		out.println("<script type='text/javascript'>");
		out.println("function dochange(obj){");
		out.println("location.href='"+url+"?currentPage='+obj.value+'&currentSize="+currentSize+"'");
		out.println("}");
		out.println("</script>");
		
		out.write("<select id='se' onchange='dochange(this)'>");
		out.write("<option value='-1'>页数</option>");
		for(int i=1;i<=sumPage;i++){
			out.write("<option "+(currentPage==i?"selected='true'":"")+" value='"+i+"'>第"+i+"页</option>");
			out.write("</option>");
		}
		out.write("</select>");
		out.write("</td>");
		out.write("</tr>");
		
		out.write("<tr>");
		out.write("<td colspan='3' align='center'>");
		out.write("当前第"+currentPage+"页"+" 总共"+sumPage+"页"+" 共有"+sumItem+"条记录");
		out.write("</td>");
		out.write("</tr>");
		//out.write("</table>");
	}
}
