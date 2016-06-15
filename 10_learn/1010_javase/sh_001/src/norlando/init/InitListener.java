package norlando.init;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		ServletContext app = arg0.getServletContext();
		
		
		Map<Integer,String > roleMap = new HashMap<Integer,String>();
		roleMap.put(0, "--请选择--");
		roleMap.put(1, "超级管理员");
		roleMap.put(2, "管理员");
		roleMap.put(3, "操作员");
		roleMap.put(4, "普通用户");
		
		
		app.setAttribute("roleMap", roleMap);
		
		System.out.println("角色类型初始化完成!......");
		
	}

}
