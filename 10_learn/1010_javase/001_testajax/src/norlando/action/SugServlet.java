package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class SugServlet extends HttpServlet {

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

@SuppressWarnings("all")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String[] str = new String[]{"abc","abd","aaa","adyr","sfsd","bbbb","sflkjl","刘大","刘二","刘三","刘四"};
		List list = new ArrayList();
		String username = request.getParameter("username");
		if(null != username && !"".equals(username)){
			String username2 = new String (username.getBytes("iso8859-1"),"utf-8");
			
			for (int i = 0;i < str.length; i++){
				if(str[i].startsWith(username2)){
					list.add(str[i]);
				}
			}
		
		}
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/plain;charset=utf-8");
			
			
			PrintWriter out = response.getWriter();
			out.print(gson.toJson(list));
			
			out.flush();
			out.close();
		
		
	}

	
	
	
	
	Gson gson = null;
	public void init() throws ServletException {
		// Put your code here
		gson = new Gson();
	}

}
