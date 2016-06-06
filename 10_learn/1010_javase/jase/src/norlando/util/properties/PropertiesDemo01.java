package norlando.util.properties;

import java.util.Properties;

/**
 * Properties �������ļ�����
 * 1����������  -->�����ļ�
 * 2����ȡ�����ļ�
 * 
 * Properties:Ҫ�����ֵ ֻ��Ϊ�ַ���������Ϊnull
 * ��Ҫʹ��put ��get
 * ʹ����������:
 * 1������ֵ setProperty(String key, String value) 
 * 2����ȡֵ getProperty(String key, String defaultValue) 
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
		//����ֵ
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		//pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		//��ȡֵ		
		String user =pro.getProperty("user","bjsxt");
		System.out.println(user);
		
		
		
		
	}

}
