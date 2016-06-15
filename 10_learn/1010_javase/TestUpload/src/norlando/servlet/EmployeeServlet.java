package norlando.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.File;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import norlando.dao.impl.EmployeeDaoImpl;
import norlando.entity.Employee;

public class EmployeeServlet extends HttpServlet {
	private EmployeeDaoImpl eldi = new EmployeeDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * Servlet服务器相应页面的入口，在这里判断前台页面的需求，并指定方法执行。
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if("save".equals(method)){
			save(request,response);
			response.sendRedirect("EmployeeServlet?method=view");
		}else if("preUpdate".equals(method)){
			reUpdate(request,response);
			request.getRequestDispatcher("jsp/employee/employee_update.jsp").forward(request, response);
		}else if("update".equals(method)){
			update(request,response);
			response.sendRedirect("EmployeeServlet?method=view");
		}else if("view".equals(method)){
			view(request,response);
			request.getRequestDispatcher("jsp/employee/employee_view.jsp").forward(request, response);
		}else if("delete".equals(method)){
			delete(request,response);
			response.sendRedirect("EmployeeServlet?method=view");
		}else if ("downLoad".equals(method)){
			downLoad(request,response);
		}
	}
	
	
	
	/**
	 * 修改
	 * @param request
	 * @param response
	 */
	private void update(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			//1:第一次save没有上传照片,这次修改也没有上传照片
			//2:第一次save没有上传照片,这次上传了照片(smartupload)
			//3:第一次save上传照片了 ,这次没有上传照片
			//4:第一次save上传照片了,这次也上传了(smartupload[新上传的会把旧的覆盖掉])
			
			SmartUpload su = new SmartUpload();
			su.initialize(this.getServletConfig(),request,response);
			su.upload();
			Request req = su.getRequest();
			File file = su.getFiles().getFile(0);
			String sid =req.getParameter("id");
			int id = Integer.parseInt(sid);
			String name = req.getParameter("name");
			String salary = req.getParameter("salary");
			String title = req.getParameter("title");
			String birthday = req.getParameter("birthday");
			
			
			Employee emp = this.eldi.findById(id);
			//这里要从数据库里面取到之前的Path  //不能这样写String path = req.getParameter("path");
			String path = emp.getPath();
			
			
			
			
			if(file.getSize() > 0){
				//判断修改前是否上传过文件
				if(path != null){
					//如果存在new出来文件
					java.io.File f = new java.io.File(path);
					if(f.exists()){
						f.delete();
					}
				}
				//拼文件路径
				ServletContext sc = this.getServletContext();
				String basePath = sc.getRealPath("\\upload");
				path = basePath + "\\" + UUID.randomUUID().toString() + file.getFileName();
				
				//System.out.println(file.getFieldName()); //path
				
				file.saveAs(path);
				//path = realPath;
				
			}
			
			emp.setBirthday(birthday);
			emp.setId(id);
			emp.setName(name);
			emp.setPath(path);
			emp.setSalary(salary);
			emp.setTitle(title);
			
			this.eldi.update(emp);
			
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * 下载
	 * @param request
	 * @param response
	 */
	private void downLoad(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			String sid = request.getParameter("id");
			int id = Integer.parseInt(sid);
			Employee emp;
			emp = this.eldi.findById(id);
			String path = emp.getPath();
			String photoName  =new String("照片".getBytes("utf-8"),"iso-8859-1");		//如果需要文件附加中文,需转码
			photoName += path.substring(path.lastIndexOf("."));//拼接带中文的文件名(照片.gif)
			
			
			/*
			String path ="";
			try {
				path = new String(path2.getBytes("iso"),"utf-8");
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			*/
			
			
			/**
			 * 设置response对象的响应头内容
			 */
			response.setContentType("application/x-download");
			response.addHeader("Content-Disposition", "anttachment;filename="+photoName);
			
//System.out.println(path);
		
			//FileInputSteam读取只带路径文件
			FileInputStream fis = new FileInputStream(path);
			//得到response的写出流
			OutputStream os = response.getOutputStream();
			
			int temp = 0;
			byte[] bs = new byte[256];
			while((temp = fis.read(bs))!= -1){
				os.write(bs,0,temp);
			}
			fis.close();
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	

	/**
	 * 预修改 四步
	 * @param request
	 * @param response
	 */
	private void reUpdate(HttpServletRequest request,
			HttpServletResponse response) {
		//1.取到request的id
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			//2.根据id查找emp对象
			Employee emp = this.eldi.findById(id);
			//3.设置emp到request
			request.setAttribute("emp", emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	

	/**
	 * 删除
	 * @param request
	 * @param response
	 */
	private void delete(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		
			
		try {
			Employee emp = this.eldi.findById(id);
			//这里要从数据库里面取到之前的Path  //不能这样写String path = req.getParameter("path");
			String path = emp.getPath();					
				//判断修改前是否上传过文件
				if(path != null){
					//如果存在new出来文件
					java.io.File f = new java.io.File(path);
					if(f.exists()){
						f.delete();
					}
				}
			this.eldi.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	/**
	 * 显示视图   
	 * @param request
	 * @param response
	 */
	private void view(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		List<Employee> elist;
		try {
			//1.数据库去除对象集合
			elist = this.eldi.findAll();
			//2.将对象集合设置到request中
			request.setAttribute("elist", elist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	
	/**
	 * 保存
	 * @param request
	 * @param response
	 */
	private void save(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		try {
			SmartUpload su = new SmartUpload();
			su.initialize(this.getServletConfig(), request,response);
			
//			su.setMaxFileSize(100000);		//单个文件的最大上传限制
//			su.setTotalMaxFileSize(500000);	//总文件上传最大限制
//			su.setAllowedFilesList("doc,txt,jpg,png,gif");	//允许上传文件的类型
//报错   //  	su.setDeniedFilesList("exe,bat,html,htm,,");//不允许上传文件的类型 //ServletException, IOException, SQLException
			su.upload();
			//事先设置路径为空,数据库可以存储空
			String realPath = null;
			//得到request对象(com.smart.upload.Request),用来得到form提交过了的参数。
			Request req = su.getRequest();
			//得到上传的第一个文件对象，3个目的：1.判断文件大小(是否存在) 2.得到文件名字，设置文件保存路径 3.保存文件
			File file = su.getFiles().getFile(0); 
			//判断文件是否存在
			if(file.getSize() > 0){
				//拼路径存储路径
				//1.拿到ServletContext
				ServletContext sc = this.getServletContext();
				//2.拿到存储路径
				String basePath = sc.getRealPath("/upload");// 得到文件夹路径。
				//3.拼出路径字符串(1.bassPath+UUID+原始文件名字带文件后缀)
				realPath = basePath + "\\" + UUID.randomUUID().toString() + file.getFileName();
//System.out.println(realPath);
				//保存文件
				file.saveAs(realPath);
			}
			//得到其他参数
			String name = req.getParameter("name");
			String salary = req.getParameter("salary");
			String title = req.getParameter("title");
			String birthday = req.getParameter("birthday");
			//封装对象
			Employee emp = new Employee();
			emp.setBirthday(birthday);
			emp.setName(name);
			emp.setPath(realPath);
			emp.setSalary(salary);
			emp.setTitle(title);
			//保存对象
			this.eldi.save(emp);
			
			
			
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
