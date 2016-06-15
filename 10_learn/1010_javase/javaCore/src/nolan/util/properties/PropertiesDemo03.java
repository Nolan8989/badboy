package nolan.util.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * 配置文件的读取
 * 1、properties
 * load(InputStream inStream) 
 * load(Reader reader) 
 * 2、xml
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
		//读取 properties 绝对路径
		InputStream is =new FileInputStream("D:/wk0803/Collection/src/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		is.close();
		
		//读取 properties 相对路径 (不推荐)
		is =new FileInputStream("src/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		//读取 properties 相对路径 (不推荐)
		is =new FileInputStream("bin/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		
		
		//读取配置文件 (推荐)
		//1、当前线程 bin (字节码的上一层) ""
		//Thread.currentThread().getContextClassLoader().getResourceAsStream("");
		is =Thread.currentThread().getContextClassLoader().getResourceAsStream("db.xml");		
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
		
		//2、当前类 class对象
		//bin(字节码的上一层)  /
		//PropertiesDemo03.class.getResourceAsStream("/");
		is =PropertiesDemo03.class.getResourceAsStream("/db.xml");
		dbInfo.loadFromXML(is);	
		System.out.println(dbInfo.getProperty("user","bj"));
	}

}
