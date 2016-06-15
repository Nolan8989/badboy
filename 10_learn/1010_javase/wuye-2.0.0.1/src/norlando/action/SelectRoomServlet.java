package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.po.Build;
import norlando.po.Unit;
import norlando.service.SelectRoomService;
import norlando.service.impl.SelectRoomServiceImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SelectRoomServlet extends HttpServlet {

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
		response.setCharacterEncoding("gbk");
		response.setContentType("text/plain;charset=gbk");
		PrintWriter out = response.getWriter();
		if ("build".equals(cmd)) {
//			out.print("{\"uname\":\"zs\",\"age\":13}");
			List<Build> listb = selectRoomService.findAllBuild();
			String bstr = gson.toJson(listb);
			out.print(bstr);
			
		}else if("unit".equals(cmd)){
			String bidstr = request.getParameter("bid");
			List<Unit> listu = selectRoomService.findUnitByBuildId(Integer.parseInt(bidstr));
			String bstr = gson.toJson(listu);
			out.print(bstr);
			
			
			
		}else if("room".equals(cmd)){
			String uidstr = request.getParameter("uid");
			List<Unit> listu = selectRoomService.findRoomByUnitId(Integer.parseInt(uidstr));
			String bstr = gson.toJson(listu);
			out.print(bstr);
			
			
			
		}
		out.flush();
		out.close();
	}
	
	private SelectRoomService selectRoomService = null; 
	 
	private Gson gson = null;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		selectRoomService = new SelectRoomServiceImpl();
		gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		
	}

}
