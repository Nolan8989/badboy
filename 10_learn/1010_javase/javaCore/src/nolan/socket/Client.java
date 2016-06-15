package nolan.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		BufferedReader brin = null;
		Socket socket = null;
		try{
			socket = new Socket(InetAddress.getLocalHost(),8888);
			br = new BufferedReader(
					new InputStreamReader(socket.getInputStream())
					);
			bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
					);
			brin = new BufferedReader(
					new InputStreamReader(System.in)
					);
			while(true){
				String str = brin.readLine();
				if(str.equals("end")){
					break;
				}
				bw.write(str + "\n");
				bw.flush();
				String str2 = "";
				str2 = br.readLine();
				System.out.println("·þÎñÆ÷Ëµ£º" + str2);
				
			}
		
		}catch(IOException e ){
			e.printStackTrace();
		}
		finally{
				try {
					if(bw != null){
					bw.close();
					}
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
				
				try {
					if(br != null){
					br.close();
					}
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
				try {
					if(brin != null){
					brin.close();
					}
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
				try {
					if(socket != null){
					socket.close();
					}
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
		}
		
		
	}

}

