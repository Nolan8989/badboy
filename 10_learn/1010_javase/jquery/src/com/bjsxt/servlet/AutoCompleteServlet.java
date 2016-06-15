package com.bjsxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

public class AutoCompleteServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String method = request.getParameter("method");
			
			if("search".equals(method)){
				search(request,response);
			}

	}

 
	private void search(HttpServletRequest request, HttpServletResponse response) {
			
		try{
			String queryString = request.getParameter("queryString");  //张
			String query = new String(queryString.getBytes("iso8859-1"),"utf-8");
			//连接JDBC匹配数据库里name字段 
			List<String> userlist  = new ArrayList<String>();//= this.udao.findUserNames(search);
			userlist.add("张三");
			userlist.add("张4");
			userlist.add("张5");
			response.setContentType("text/html;charset=utf-8");
			//接收的数据格式 固定的格式：
			//这里必须返回形如json:   { 'resultList' : ['张三' , '张四'] ,   'search' : 'search'}
			String json = "{\"list\":"+JSONArray.fromObject(userlist)+",\"queryString\":\""+query+"\" }";
			response.getWriter().write(json);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
