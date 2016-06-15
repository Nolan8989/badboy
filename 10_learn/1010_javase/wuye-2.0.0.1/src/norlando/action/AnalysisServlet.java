package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.service.AnalysisDataService;
import norlando.service.impl.AnalysisDataServiceImpl;


public class AnalysisServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AnalysisServlet() {
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
			String cmd = request.getParameter("cmd");
			if("degree".equals(cmd)){
				
				this.analysisDataDegree(request, response);
			}else if("ajaxdegree".equals(cmd)){
				String bid = request.getParameter("build_id");
				String  chartXml = analysisDataService.analysisDegreeByBuildId(Integer.parseInt(bid));
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/plain;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.print(chartXml);
				out.flush();
				out.close();
				
				
			}else if("ajaxdegree2".equals(cmd)){
				
				this.analysisDataDegree2(request, response);
				
			}else if("agepart".equals(cmd)){
				this.analysisAgeData(request, response);
				
			}
	}
	
	private void analysisDataDegree2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String bid = request.getParameter("build_id");
		 
		
//		 freemarker veolcity
		request.setAttribute("caption", "学历分析jsp模板制造数据");
		request.setAttribute("subcaption", "jsp模板制造数据");
		request.setAttribute("isLink",true);
		List dataSetList= analysisDataService.findAnalysisDegreeByBuildId(Integer.parseInt(bid));
		request.setAttribute("dataSetList",dataSetList);
		
		request.getRequestDispatcher("resident/piedata.jsp").forward(request, response);
	}

	private void analysisDataDegree(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String bid = request.getParameter("build_id");
		String  chartXml = analysisDataService.analysisDegreeByBuildId(Integer.parseInt(bid));
		
		//
		
		request.setAttribute("chartXml", chartXml);
		request.getRequestDispatcher("resident/degree.jsp").forward(request, response);
	}
	private void analysisAgeData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String bid = request.getParameter("build_id");
		String  chartXml = analysisDataService.analysisAgePartByBuildId(Integer.parseInt(bid));
		
		//
		
		request.setAttribute("chartXml", chartXml);
		request.getRequestDispatcher("resident/showage.jsp").forward(request, response);
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
		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	
	private AnalysisDataService analysisDataService = null;
	public void init() throws ServletException {
		// Put your code here
		analysisDataService = new AnalysisDataServiceImpl();
	}

}
