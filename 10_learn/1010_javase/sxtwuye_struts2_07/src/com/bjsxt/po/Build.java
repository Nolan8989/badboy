package com.bjsxt.po;

import com.google.gson.annotations.Expose;

/*
 * CREATE TABLE `t_build` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `buildnum` varchar(255) DEFAULT NULL,
  `buildname` varchar(255) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;
 */
public class Build {
	@Expose
	private int id;
	private String buildnum;
	@Expose
	private String buildname;
	private String addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuildnum() {
		return buildnum;
	}
	public void setBuildnum(String buildnum) {
		this.buildnum = buildnum;
	}
	public String getBuildname() {
		return buildname;
	}
	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Build(int id, String buildname) {
		super();
		this.id = id;
		this.buildname = buildname;
	}
	public Build() {
		super();
	}
	
 
}
