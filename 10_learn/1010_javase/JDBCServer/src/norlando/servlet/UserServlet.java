package norlando.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.dao.UserDaoImpl;
import norlando.entity.User;

public class UserServlet extends HttpServlet {

	private UserDaoImpl userdi = new UserDaoImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String save = request.getParameter("method");
		
		
		System.out.println(request.getParameter("username")); 
		if ("save".equals(save)){
			
				userSave(request,response);
				
			}
	}

	private void userSave(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		String birthday = request.getParameter("birthday");
		String[] favorites = request.getParameterValues("favorite");
		String favorite = "";
		for(String str:favorites){
			favorite= str +",";
		}
		favorite = favorite.substring(0,favorite.length()-1);
		String city = request.getParameter("city");
		String description = request.getParameter("description");
		
		User user = new User();
		user.setAge(age);
		user.setBirthday(birthday);
		user.setCity(city);
		user.setDescription(description);
		user.setPassword(password);
		user.setUsername(username);
		user.setSex(sex);
		user.setFavorite(favorite);
		this.userdi.saveuser(user);
	}
	
}