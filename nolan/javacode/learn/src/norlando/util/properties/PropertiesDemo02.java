package norlando.util.properties;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties �������ļ�����
 * �洢���ļ���  .properties  .xml
 * 1��properties
 *    store(OutputStream out, String comments) 
 *    store(Writer writer, String comments) 
 * 2��xml
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
		//����ֵ
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		
		//�洢���ļ��� ����·�� properties
		BufferedOutputStream  bos =new BufferedOutputStream(
					new FileOutputStream("D:/wk0803/Collection/db.properties")
				);
		pro.store(bos, "���ݿ����ӵ������ļ���Ϣ");
		bos.close();
		//�洢���ļ��� ���·�� xml
		BufferedOutputStream  bosXml =new BufferedOutputStream(
				new FileOutputStream("src/db.xml")
			);
		pro.storeToXML(bosXml, "���ݿ����ӵ������ļ���Ϣ","gbk");
		bos.close();
		
		
	}

}
