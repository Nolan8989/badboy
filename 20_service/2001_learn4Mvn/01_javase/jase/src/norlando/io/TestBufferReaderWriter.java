package norlando.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		//String tempstr = null;
		int tmp ;
		try {
			fr = new FileReader("d:/javas/resource/filereader.txt");
			fw = new FileWriter("d:/javas/resource/filewriter.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
//			while((tempstr = br.readLine()) != null){
//				System.out.println(tempstr);
//				bw.write(tempstr);
//			}
			while((tmp = br.read()) != -1){
				System.out.println((char)tmp);
				bw.write(tmp);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
