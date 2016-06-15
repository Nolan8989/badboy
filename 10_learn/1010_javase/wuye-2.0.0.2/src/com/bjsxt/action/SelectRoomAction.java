package com.bjsxt.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.bjsxt.service.SelectRoomService;
import com.bjsxt.service.impl.SelectRoomServiceImpl;
import com.bjsxt.util.GsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;

public class SelectRoomAction extends ActionSupport{
	private InputStream inputStreamBuild;
	private String contentType;

	private static SelectRoomService selectRoomService = new SelectRoomServiceImpl() ; 
	 
	 
	
	
	
	public String getContentType() {
		return contentType;
	}




	public void setContentType(String contentType) {
		this.contentType = contentType;
	}




	public InputStream getInputStreamBuild() {
		return inputStreamBuild;
	}




	public void setInputStreamBuild(InputStream inputStreamBuild) {
		this.inputStreamBuild = inputStreamBuild;
	}




	public String findAllBuild() throws Exception{
//		ServletActionContext.getResponse();
		this.contentType = "text/plain;charset=utf-8";
		List listAllBuild = selectRoomService.findAllBuild();
		Gson gson = GsonUtil.getGsonUtil().getGson();
		String buildstr = gson.toJson(listAllBuild);
		this.inputStreamBuild=  new ByteArrayInputStream(buildstr.getBytes("utf-8"));
		return "build";
	}
	
	
	public String findAllBuildResponse() throws Exception{
//		ServletActionContext.getResponse();
//		this.contentType = "text/plain;charset=utf-8";
//		List listAllBuild = selectRoomService.findAllBuild();
//		Gson gson = GsonUtil.getGsonUtil().getGson();
//		String buildstr = gson.toJson(listAllBuild);
//		this.inputStreamBuild=  new ByteArrayInputStream(buildstr.getBytes("utf-8"));
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		List listAllBuild = selectRoomService.findAllBuild();
		Gson gson = GsonUtil.getGsonUtil().getGson();
		String buildstr = gson.toJson(listAllBuild);
		out.print(buildstr);
		out.flush();
		out.close();
		
		return this.NONE;
	}
	
	
	
	private int bid;





	public int getBid() {
		return bid;
	}




	public void setBid(int bid) {
		this.bid = bid;
	}
	

	
	public String findUnitByBuild() throws Exception{
		List listUnit = selectRoomService.findUnitByBuildId(bid);
		Gson gson  = GsonUtil.getGsonUtil().getGson();
		String unitstr = gson.toJson(listUnit);
		this.inputStreamBuild  = new ByteArrayInputStream(unitstr.getBytes("utf-8"));
		this.contentType = "text/plain;charset=utf-8";
		return "unit";
		
		
	}
	
	private int uid;
	
	
	public int getUid() {
		return uid;
	}




	public void setUid(int uid) {
		this.uid = uid;
	}




	public String findRoomByUnitId() throws Exception{
		List listRoom = selectRoomService.findRoomByUnitId(uid);
		Gson gson  = GsonUtil.getGsonUtil().getGson();
		String unitstr = gson.toJson(listRoom);
		this.inputStreamBuild  = new ByteArrayInputStream(unitstr.getBytes("utf-8"));
		this.contentType = "text/plain;charset=utf-8";
		return "room";
		
		
	}
	
}
