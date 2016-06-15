package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.services.UseSer;
import norlando.services.impl.UseSerImpl;
import norlando.vo.UserVo;

import com.google.gson.Gson;

public class MoreUserServlet extends HttpServlet {

	
	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<UserVo> userVoList = null;
		String username1 = request.getParameter("username");
		String s = request.getParameter("star");
		String t = request.getParameter("step");
		int star = Integer.parseInt(s);
		int step = Integer.parseInt(t);
		if(null != username1 && !"".equals(username1)){
			userVoList = new ArrayList<UserVo>();
			String username2 = new String (username1.getBytes("iso8859-1"),"utf-8");
			userVoList = this.us.findUserVoByKeyWord(username2,star,step);
		}
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;charset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		out.print(gson.toJson(userVoList));
		System.out.println(gson.toJson(userVoList));
		out.flush();
		out.close();
	}
		

	Gson gson = null;
	UserVo uv = null;
	UseSer us = null;
	public void init() throws ServletException {
		gson = new Gson();
		uv = new UserVo();
		us = new UseSerImpl();
	}

}
