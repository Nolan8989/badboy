package norlando.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.dao.ClassDao;

public class ClassServlet extends HttpServlet {

	ClassDao cd = new ClassDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List clist = this.cd.findClassAll();
		request.setAttribute("clist", clist);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
