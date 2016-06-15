package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.services.FindAddrService;
import norlando.services.impl.FindAddrServiceImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FindAddrServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String cmd = request.getParameter("cmd");
			if("build".equals(cmd)){
			
			this.findAllBuilding(request, response);
		}
		
	}
	
	
	private void findAllBuilding(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		List listb = this.findAddrService.findAllBuilding();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out  = response.getWriter();
		out.print(gson.toJson(listb));
		out.flush();
		out.close();
		
	}

	private FindAddrService findAddrService = null;
	private Gson gson = null;
	public void init() throws ServletException {
		// Put your code here
		gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		findAddrService = new FindAddrServiceImpl();
	}

}
