package com.bjsxt.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class ReadImageAction extends ActionSupport{
	private InputStream imageStream;

	private String inputPath;
	
	
	public String getInputPath() {
		return inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public InputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(InputStream imageStream) {
		this.imageStream = imageStream;
	}
	
	
	
	private String imageName;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	public String showImage(){
		try {
			this.imageStream = new FileInputStream(this.inputPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.imageStream = ReadImageAction.class.getClassLoader().getResourceAsStream("redis×÷Òµ.bmp");
		}
		return "show";
		
	}
}
