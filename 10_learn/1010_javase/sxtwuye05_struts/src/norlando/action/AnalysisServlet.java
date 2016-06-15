package norlando.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.services.AnalysisDataService;
import norlando.services.impl.AnalysisDataServiceImpl;

public class AnalysisServlet extends HttpServlet {

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

	
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
			}else if("ajaxdegreejsp".equals(cmd)){
				this.analysisDataDegreeJsp(request, response);
			}
	}
	
	
	
	
	private void analysisDataDegreeJsp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String bid = request.getParameter("build_id");
		List dataSetList = analysisDataService.analysisDegreeByBuildIdJsp(Integer.parseInt(bid));
		request.setAttribute("caption", "jsp报表ajax回复");
		request.setAttribute("subcaption", "报表啊");
		request.setAttribute("dataSetList", dataSetList);
		request.setAttribute("isLink",true);
		
		request.getRequestDispatcher("resident/piedata.jsp").forward(request, response);
	}

	
	
	
	private void analysisDataDegree(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		String bid = request.getParameter("build_id");
		String  chartXml = analysisDataService.analysisDegreeByBuildId(Integer.parseInt(bid));
		request.setAttribute("chartXml", chartXml);
		request.getRequestDispatcher("resident/degree.jsp").forward(request, response);
	}


	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

	private AnalysisDataService analysisDataService = null;
	public void init() throws ServletException {
		// Put your code here
		analysisDataService = new AnalysisDataServiceImpl();
	}

	
	
	
}
