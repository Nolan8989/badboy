package norlando.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
/**
 * 工厂模式
 * @author Administrator
 *
 */
public class DaoFactory {
	
	private static Map<String,Object> map = new HashMap<String,Object>();
	
	static{
		
		try {
			Properties pp = new Properties();
			String path = ServletActionContext.getRequest().getRealPath("WEB-INF/classes/dao.properties");
			System.out.println(path);
			pp.load(new FileInputStream(new File(path)));
			Set<Object> ss= pp.keySet();
			
			for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
				String key = (String) iterator.next();
				System.out.println(key);
				
				String className = pp.getProperty(key);
				Class c = Class.forName(className);
				Object dao = c.newInstance();
				
				map.put(key, dao);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	public static Object getDao(String key){
		return map.get(key);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
