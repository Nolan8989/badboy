package com.bjsxt.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			//ServletContext context = this.getServletContext().get
			//System.out.println("---------------------");
			@SuppressWarnings("unused")
			ServletInputStream  ins = request.getInputStream();
			ServletContext context = this.getServletContext();
			String path = context.getRealPath("/upload");
			System.out.println();
			FileOutputStream fos = new FileOutputStream(path+"/"+UUID.randomUUID().toString()+".gif");
			
			int temp = 0 ;
			while((temp =ins.read()) != -1){
				fos.write(temp);
			}
			fos.close();
			fos.flush();
			response.getWriter().write("1");			//上传成功之后消失	 1 	
			
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("0");			//上传失败不消失	 0	
			// TODO: handle exception
		}


		
			
	}

}
