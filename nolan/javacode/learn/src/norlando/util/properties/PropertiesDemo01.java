package norlando.util.properties;

import java.util.Properties;

/**
 * Properties 与配置文件关联
 * 1、创建对象  -->配置文件
 * 2、读取配置文件
 * 
 * Properties:要求键与值 只能为字符串，不能为null
 * 不要使用put 与get
 * 使用新增方法:
 * 1、设置值 setProperty(String key, String value) 
 * 2、获取值 getProperty(String key, String defaultValue) 
 * 
 * 
 * @author Administrator
 *
 */
public class PropertiesDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties pro =new Properties();
		//设置值
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		//pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		//获取值		
		String user =pro.getProperty("user","bjsxt");
		System.out.println(user);
		
		
		
		
	}

}
