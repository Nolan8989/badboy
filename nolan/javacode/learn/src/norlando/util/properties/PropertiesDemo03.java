package norlando.util.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * �����ļ��Ķ�ȡ
 * 1��properties
 * load(InputStream inStream) 
 * load(Reader reader) 
 * 2��xml
 * loadFromXML(InputStream in) 
 * @author Administrator
 *
 */
public class PropertiesDemo03 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidPropertiesFormatException 
	 */
	public static void main(String[] args) throws InvalidPropertiesFormatException, IOException {
		Properties dbInfo =new Properties();
		//��ȡ properties ����·��
		InputStream is =new FileInputStream("D:/wk0803/Collection/src/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		is.close();
		
		//��ȡ properties ���·�� (���Ƽ�)
		is =new FileInputStream("src/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		//��ȡ properties ���·�� (���Ƽ�)
		is =new FileInputStream("bin/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		
		
		//��ȡ�����ļ� (�Ƽ�)
		//1����ǰ�߳� bin (�ֽ������һ��) ""
		//Thread.currentThread().getContextClassLoader().getResourceAsStream("");
		is =Thread.currentThread().getContextClassLoader().getResourceAsStream("db.xml");		
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		
		//2����ǰ�� class����
		//bin(�ֽ������һ��)  /
		//PropertiesDemo03.class.getResourceAsStream("/");
		is =PropertiesDemo03.class.getResourceAsStream("/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
	}

}
