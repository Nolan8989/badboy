package norlando.util.properties;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties 与配置文件关联
 * 存储到文件中  .properties  .xml
 * 1、properties
 *    store(OutputStream out, String comments) 
 *    store(Writer writer, String comments) 
 * 2、xml
 *  storeToXML(OutputStream os, String comment, String encoding) 
   
 *    
 * @author Administrator
 *
 */
public class PropertiesDemo02 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Properties pro =new Properties();
		//设置值
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		
		//存储到文件中 绝对路径 properties
		BufferedOutputStream  bos =new BufferedOutputStream(
					new FileOutputStream("D:/wk0803/Collection/db.properties")
				);
		pro.store(bos, "数据库连接的配置文件信息");
		bos.close();
		//存储到文件中 相对路径 xml
		BufferedOutputStream  bosXml =new BufferedOutputStream(
				new FileOutputStream("src/db.xml")
			);
		pro.storeToXML(bosXml, "数据库连接的配置文件信息","gbk");
		bos.close();
		
		
	}

}
