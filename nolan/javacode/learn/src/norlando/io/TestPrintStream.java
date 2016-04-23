package norlando.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		try {
			ps = new PrintStream( 
					new FileOutputStream( 
							new File("d:/javas/resource/printStream.txt")
							)
					);
			ps.println("hi");
			ps.println(" nihaome");
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
