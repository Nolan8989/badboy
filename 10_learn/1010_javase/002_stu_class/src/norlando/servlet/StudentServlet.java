package norlando.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.dao.StudentDao;

public class StudentServlet extends HttpServlet {

	StudentDao sd = new StudentDao();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String _cid = request.getParameter("cid");
		int cid = Integer.parseInt(_cid);
		List stulist = this.sd.findByCid(cid);
		request.setAttribute("stulist", stulist);
		request.getRequestDispatcher("stuAjaxback.jsp").forward(request, response);
	}

}
