package com.bjsxt.po;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;

public class User {
	@Expose
	private int id;
	@Expose
	private String uname;
	private String pwd;
	@Expose
	private List favs;
	@Expose
	private Map<String, String> addr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List getFavs() {
		return favs;
	}

	public void setFavs(List favs) {
		this.favs = favs;
	}

	public Map<String, String> getAddr() {
		return addr;
	}

	public void setAddr(Map<String, String> addr) {
		this.addr = addr;
	}
	
	
}
