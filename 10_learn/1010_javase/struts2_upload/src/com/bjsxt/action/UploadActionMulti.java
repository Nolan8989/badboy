package com.bjsxt.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;

public class UploadActionMulti extends ActionSupport{
	private String fileDir;
	
	
	
	public String getFileDir() {
		return fileDir;
	}
	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}

	private File[] bjsxt;
	private String[] bjsxtContentType;
	private String[]  bjsxtFileName;
	
	
	 
	
	public File[] getBjsxt() {
		return bjsxt;
	}
	public void setBjsxt(File[] bjsxt) {
		this.bjsxt = bjsxt;
	}
	public String[] getBjsxtContentType() {
		return bjsxtContentType;
	}
	public void setBjsxtContentType(String[] bjsxtContentType) {
		this.bjsxtContentType = bjsxtContentType;
	}
	public String[] getBjsxtFileName() {
		return bjsxtFileName;
	}
	public void setBjsxtFileName(String[] bjsxtFileName) {
		this.bjsxtFileName = bjsxtFileName;
	}
	public String testUpload(){
		System.out.println("UploadAction.testUpload()");
		try {
			for (int i = 0; i < bjsxt.length; i++) {
				String fliew = fileDir+UUID.randomUUID().toString()+bjsxtFileName[i];
				OutputStream out  = new FileOutputStream(fliew);
				InputStream in = new FileInputStream(bjsxt[i]);
				
				int temp = 0;
				
				byte[] b = new byte[8192];
				while ((temp = in.read(b))!=-1) {
					out.write(b, 0, temp);
				}
				
				
				out.flush();
				out.close();
				in.close();
				
				
			}
			
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.SUCCESS;
	}
	
}
