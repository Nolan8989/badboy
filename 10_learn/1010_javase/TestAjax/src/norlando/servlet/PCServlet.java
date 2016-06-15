package norlando.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import norlando.dao.CityDao;
import norlando.dao.ProvinceDao;
import norlando.dao.impl.CityDaoImpl;
import norlando.dao.impl.ProvinceDaoImpl;
import norlando.entity.City;
import norlando.entity.Province;

public class PCServlet extends HttpServlet {

	private CityDao citydao = new CityDaoImpl();
	private ProvinceDao prodao = new ProvinceDaoImpl();
	private Gson gson = new Gson();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if("getPro".equals(method)){
			getPro(request,response);
		}else if("getCity".equals(method)){
			getCity(request,response);
		}
		
	}
	/**
	 * 根据省市id获取城市信息。
	 * @param request
	 * @param response
	 */
	private void getCity(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int p = Integer.parseInt(request.getParameter("province_id"));
		try {
			List<City> clist = this.citydao.cityByProId(p);
			String json = this.gson.toJson(clist);
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取省份
	 * @param request
	 * @param response
	 */
	private void getPro(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			List<Province> pList = this.prodao.findAll();
			String json =this.gson.toJson(pList);
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(json);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
