package norlando.exception;

import java.io.FileReader;


public class Test035 {
	public static void main(String[] args) {
		try {
			new Test035().openFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	String openFile() throws Exception {  //���Լ��������쳣��˭������˭����
		System.out.println("Test035.openFile()");
		FileReader fr = new FileReader("");
		return "";
	}
}
