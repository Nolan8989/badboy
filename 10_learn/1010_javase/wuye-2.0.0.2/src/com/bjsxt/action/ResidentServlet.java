package com.bjsxt.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bjsxt.dao.BaseDao;
import com.bjsxt.dao.impl.BaseDaoImpl;
import com.bjsxt.po.Resident;
import com.bjsxt.service.ResidentService;
import com.bjsxt.service.impl.ResidentServiceImpl;
import com.bjsxt.util.PageBaidu;
import com.bjsxt.util.PageGoogle;

public class ResidentServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ResidentServlet() {
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
//		request.setCharacterEncoding("utf-8");
		String cmd = request.getParameter("cmd");
		if("pagebaidu".equals(cmd)){
			this.handerRsdPage(request,response);
			
		}else if("googlepage".equals(cmd)){
			this.handerRsdGooglePage(request, response);
			
		}else if("showdegree".equals(cmd)){
			this.showDegree(request, response);
			
		}else if("addrsd".equals(cmd)){
			this.addRsd(request, response);
		}
	}

	private  void addRsd(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException{

//		response.setCharacterEncoding(arg0)
//		String token = request.getParameter("token");
//		HttpSession session = request.getSession();
//		String t = (String) session.getAttribute("token");
//		
//		if(t!=null&&token!=null&&token.equals(t)){
//			session.removeAttribute("token");
		
			
		
		
		
		
		
		
		
		
		
//			String rsdname = request.getParameter("rsdname");
//			String email  = request.getParameter("email");
//			String gender  = request.getParameter("gender");
//			String identity  = request.getParameter("identity");
//			
//			
//			Resident rsd = new Resident();
//			rsd.setRsdname(rsdname);
//			rsd.setEmail(email);
//			rsd.setGender(Integer.parseInt(gender));
//			rsd.setIdentity(identity);
		Resident rsd = (Resident) request.getAttribute("beanObject");
			int flag = residentService.addRsd(rsd);
			request.setAttribute("addflag", flag);
			request.getRequestDispatcher("resident/addresident.jsp").forward(request, response);
			
			
//		}else{
//			
//			response.sendRedirect("error.jsp");
//			
//		}
		
		


		
	}
	
	
	private void showDegree(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException{
		String degreeid = request.getParameter("degreeid");
		String build_id = request.getParameter("build_id");
		String numstr = request.getParameter("num");
		int num = 1;
		try {
			num = Integer.parseInt(numstr);
		} catch (Exception e) {
			// TODO: handle exception
			num = 1;
		}
		
		PageGoogle page = residentService.findRsdByBuildAndDegree(num, Integer.parseInt(degreeid),Integer.parseInt(build_id),8);
		request.setAttribute("page", page);
//		request.setAttribute("degreeid", degreeid);
//		request.setAttribute("build_id", build_id);
		
		System.out.println("ResidentServlet.showDegree()");
		request.getRequestDispatcher("resident/showdegree.jsp").forward(request, response);
	}
	
	private  void handerRsdGooglePage(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException{
		String pageSizeStr = request.getParameter("pageSize");
		String numstr= request.getParameter("num");
		int pageSize = 10;
		
		try {
			pageSize = Integer.parseInt(pageSizeStr);
		} catch (Exception e) {
			// TODO: handle exception
			pageSize =10;
		}
		int num = 1;
		try {
			num = Integer.parseInt(numstr);
		} catch (Exception e) {
			// TODO: handle exception
			num=1;
		}
		
//		获取总行数
//		int rowCount = residentService.getResidentCount();
		int navNum = 10;
		
		
//		PageGoogle page = new PageGoogle(rowCount, pageSize, num, navNum);
////		2.思路   去数据库  分页查询
//		
//		List listrsd = residentService.findResidentAllPage(page.getStartRow(), page.getPageSize());
		
		PageGoogle page = baseDao.pageTool("select * from t_resident", null, Resident.class,num, pageSize, navNum);
		
		request.setAttribute("page", page);
		
		
//		request.setAttribute("listrsd", listrsd);
		
		
		request.getRequestDispatcher("resident/gfindrsd.jsp").forward(request, response);
	}
	
	private void handerRsdPage(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException{

		String numstr= request.getParameter("num");
		int num = 1;
		try {
			num = Integer.parseInt(numstr);
		} catch (Exception e) {
			// TODO: handle exception
			num=1;
		}
		
		int pageSize = 20;
//		获取数据库总行数
		int  rowCount = this.residentService.getResidentCount();
		PageBaidu page = new PageBaidu(rowCount, pageSize, num);
//		page.getStartRow();
//		page.getPageSize();
		
		List listrsd = residentService.findResidentAllPage(page.getStartRow(), page.getPageSize());
		request.setAttribute("listrsd", listrsd);
		request.setAttribute("page", page);
		request.getRequestDispatcher("resident/findrsd.jsp").forward(request, response);
	}
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	
	private ResidentService residentService = null;
	
	private BaseDao baseDao = null;
	public void init() throws ServletException {
		// Put your code here
		residentService = new ResidentServiceImpl();
		baseDao = new BaseDaoImpl();
	}

}
