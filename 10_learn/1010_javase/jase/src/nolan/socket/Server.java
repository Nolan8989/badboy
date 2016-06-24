package nolan.socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server  = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		BufferedReader brin = null;
		Socket socket = null;
		try{
			server = new ServerSocket(8888);
			socket = server.accept();
			System.out.println("客服端已经连入！");
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
				String str = br.readLine();
				System.out.println("客户端说：" + str);
				String str2 = "";
				str2 = brin.readLine();
				if(str2.equals("end")){
					break;
				}
				bw.write(str2 + "\n");
				bw.flush();
			}
		
		}catch(SecurityException e){
			e.printStackTrace();
		}catch(SocketTimeoutException e){
			e.printStackTrace();
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
