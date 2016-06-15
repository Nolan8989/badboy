package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.dao.UserDao;
import norlando.dao.impl.UserDaoImpl;
import norlando.entity.User;

import com.google.gson.Gson;

public class UserServlet extends HttpServlet {

	
	public void destroy() {
		super.destroy(); 
		
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username1 = request.getParameter("username");
		List<User> userList = new ArrayList<User>();
		if(null != username1 && !"".equals(username1)){
			String username2 = new String (username1.getBytes("iso8859-1"),"utf-8");
			userList = this.ud.findUserByKeyWord(username2,1,2);
		}
		request.setAttribute("userList", userList);
		request.setAttribute("username", username1);
		request.getRequestDispatcher("view.jsp").forward(request, response);

	}

	
		UserDao ud = null;
	public void init() throws ServletException {
		ud = new UserDaoImpl();
	}

}
