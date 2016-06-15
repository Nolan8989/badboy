package norlando.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.dao.impl.UserDaoImpl;
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
		String method = request.getParameter("method");
		//String path = request.getContextPath();
		//System.out.println(path);
		//String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		//System.out.println(basePath);
		if("save".equals(method)){
			saveUser(request,response);
			response.sendRedirect("UserServlet?method=view");
		}else if("update".equals(method)){
			userUpdate(request,response);
			response.sendRedirect("UserServlet?method=view");
		}else if("delete".equals(method)){
			userDelete(request,response);
			response.sendRedirect("UserServlet?method=view");
		}else if("view".equals(method)){
			userView(request,response);
		}else if ("preupdate".equals(method)){
			userPreUpdate(request,response);
		}
	}
	private void userPreUpdate(HttpServletRequest request,
			HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			User user = this.userdi.findById(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("jsp/user/user_update.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void userDelete(HttpServletRequest request,
			HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			this.userdi.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void userView(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			//查询User所有数据
			List<User> userList = userdi.findAll();
			//由于UserServlet想把所得到的userList结果显示到user_view.jsp(也是一个servlet)中 , 那么servlet之间传递对象最好的方法：
			request.setAttribute("userList", userList);
			//请求转发，把request对象传递给user_view.jsp
			request.getRequestDispatcher("jsp/user/user_view.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void userUpdate(HttpServletRequest request,
			HttpServletResponse response) {
		int id  = Integer.parseInt(request.getParameter("id"));
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
		user.setId(id);
		user.setAge(age);
		user.setBirthday(birthday);
		user.setCity(city);
		user.setDescription(description);
		user.setPassword(password);
		user.setUsername(username);
		user.setSex(sex);
		user.setFavorite(favorite);
		try {
			this.userdi.update(user); //调用UserDaoImpl的update()保存user到数据库
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("save error!");
		}
		
	}

	/**
	 * 接收前台数据，把属性封装到对象中。以便ado层利用反射机制存储数据到数据库，减少代码。
	 * @param request
	 * @param response
	 */
	private void saveUser(HttpServletRequest request,
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
		try {
			this.userdi.save(user); //调用UserDaoImpl的save()保存user到数据库
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("save error!");
		}
	}
	

				
		

	
	
}