package com.nolan.server;

import java.io.IOException;
import java.io.OutputStream;

public class Response {

	
	private OutputStream outStream;
	
	protected Response (OutputStream outSteam){
		
		this.outStream = outSteam;
	}
	
	
	
	public void print(String info){
		try {
			outStream.write(info.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void println(String info){
		try {
			outStream.write((info+"\r\n").getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
