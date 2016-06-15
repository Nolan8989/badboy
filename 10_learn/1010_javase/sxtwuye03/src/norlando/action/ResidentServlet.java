package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.services.ResidentServices;
import norlando.servies.impl.ResidentServicesImpl;
import norlando.util.PageBaidu;
import norlando.util.PageGoogle;
@SuppressWarnings("all")
public class ResidentServlet extends HttpServlet {


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
		if("pagebaidu".equals(cmd)){
			this.handerRsdPage(request,response);
		}else if("pagegoogle".equals(cmd)) {
			this.gHanderRsdPage(request,response);
		}
	}

	
	private void gHanderRsdPage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String numstr = request.getParameter("num");
		int num = 1;
		try{
			num = Integer.parseInt(numstr);
		}catch(Exception e){
			num = 1;
		}
		
		int rowCount =this.residentServices.getResidentCount() ;
		int pageSize = 10;
		int navNum = 10;
//		PageGoogle page = new PageGoogle(rowCount,pageSize,num,navNum);
//		List residentList = this.residentServices.findResidentLimitPage(page.getStartRow(),page.getPageSize());
//		request.setAttribute("residentList",residentList);
		
		PageGoogle page = this.residentServices.findResidentLimitPage(pageSize,num,navNum);
		request.setAttribute("page",page);
		request.getRequestDispatcher("resident/gfindrsd.jsp").forward(request, response);
	}


	private void handerRsdPage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String numstr = request.getParameter("num");
		int num = 1;
		try{
			num = Integer.parseInt(numstr);
		}catch(Exception e){
			num = 1;
		}
		
		int rowCount =this.residentServices.getResidentCount() ;
		int pageSize = 10;
		PageBaidu page = new PageBaidu(rowCount,pageSize,num);
		List residentList = this.residentServices.findResidentLimitPage(page.getStartRow(),page.getPageSize());
		request.setAttribute("residentList",residentList);
		request.setAttribute("page",page);
		request.getRequestDispatcher("resident/findrsd.jsp").forward(request, response);
		

		
	}

	private ResidentServices residentServices= null;
	public void init() throws ServletException {
		// Put your code here
		residentServices = new ResidentServicesImpl();
	}

}
