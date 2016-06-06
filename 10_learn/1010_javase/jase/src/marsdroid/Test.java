package org.marsdroid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties properties = new Properties();
		String projectPath = System.getProperty("user.dir");
//		System.out.println(projectPath);
		String propertiesPath = projectPath + File.separator + "resources" + File.separator + "first.properties";
		try {
			InputStream in = new FileInputStream(propertiesPath);
			properties.load(in);
			System.out.println(properties.getProperty("key1 "));
			System.out.println(properties.getProperty("key2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
