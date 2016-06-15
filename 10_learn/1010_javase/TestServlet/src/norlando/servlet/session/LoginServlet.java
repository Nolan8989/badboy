package norlando.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset= utf-8");
		
		
		Cookie[] cs = request.getCookies();//得到Cookies数组
		
		boolean flag1 = false;
		boolean flag2 = false;
		
		if(cs != null){
			for (int i = 0; i < cs.length; i++) {
				Cookie c = cs[i];
				if("username".equals(c.getName())){
					if("admin".equals(c.getValue())){
						flag1 = true;
					}
				}
				if("password".equals(c.getName())){
					if("1234".equals(c.getValue())){
						flag2 = true;
					}
				}
			}
			
		}
		
		if(flag1 && flag2){
			response.sendRedirect("index.jsp");
		} else{
			String error = (String)request.getAttribute("error") == null?"":(String)request.getAttribute("error");
			response.getWriter().write("<html>");
			response.getWriter().write("<head><title>登录页面</title><style>.mycolor{color:red;}</style></head>");
			response.getWriter().write("<body>");
			response.getWriter().write("<form action=CookieCheckServlet method=post >");
			response.getWriter().write("用户名:<input name=username  /><br>");
			response.getWriter().write("密码:<input name=password type=password /><br>");
			response.getWriter().write("两周内自动登录<input type=checkbox name=autologin value=1 /><br>");
			response.getWriter().write("<input value=登录 type=submit />");
			response.getWriter().write("<div class=mycolor >"+error+"</div>");
			response.getWriter().write("</form>");
			response.getWriter().write("</body>");
			response.getWriter().write("</html>");			
		}
		
		
		
	}

}
