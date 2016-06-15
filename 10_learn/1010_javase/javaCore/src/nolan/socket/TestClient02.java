package nolan.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket;
		DataInputStream dis;
		DataOutputStream dos;
		BufferedReader br ; 
		try {
			socket = new Socket("127.0.0.1",7899);
			br = new BufferedReader(
					new InputStreamReader(System.in)
				);
			dos = new DataOutputStream( 
							socket.getOutputStream()
							);
			dis =new DataInputStream( 
					socket.getInputStream()
			);
			
			while(true){
				String str =br.readLine();
				dos.writeUTF(str);
				dos.flush();
				str = dis.readUTF();
				System.out.println(str);
				if(str.equals("FAQªÿ¿°£∫bye")){
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
