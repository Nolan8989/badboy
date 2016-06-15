package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.service.FindAddrService;
import norlando.service.impl.FindAddrServiceImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FindAdrrServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FindAdrrServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
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
	

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	
	private FindAddrService findAddrService = null;
	private Gson gson = null;
	public void init() throws ServletException {
		// Put your code here
		gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		findAddrService = new FindAddrServiceImpl();
	}

}
