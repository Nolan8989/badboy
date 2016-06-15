package norlando.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.dao.CityDao;
import norlando.dao.ProvinceDao;
import norlando.dao.impl.CityDaoImpl;
import norlando.dao.impl.ProvinceDaoImpl;
import norlando.entity.User;

public class UserServlet extends HttpServlet {

	private CityDao citydao = new CityDaoImpl();
	private ProvinceDao prodao = new ProvinceDaoImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
	
		
	}
	

				
		

	
	
}