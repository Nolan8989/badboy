package com.bjsxt.po;

import java.util.Date;

/**
 *   `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `degree` int(11) DEFAULT NULL,
  `identity` varchar(255) DEFAULT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  `previmgpath` varchar(255) DEFAULT NULL,
  `build_id` int(11) DEFAULT NULL,
  `unit_id` int(11) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
 * @author Administrator
 *
 */
public class Resident {
	private int id;
	private String rsdname;
	private int gender;
	private String phone;
	private String email;
	private int age;
	private int degree;
	private String identity;
	
	private String imgpath;
	
	private String previmgpath;
	
	
	private int build_id;//楼栋的id
	private int unit_id;//楼栋单元id
	private int room_id;//哪个室
	private Date starttime;//合同有效时间范围
	private Date endtime;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRsdname() {
		return rsdname;
	}
	public void setRsdname(String rsdname) {
		this.rsdname = rsdname;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	public String getPrevimgpath() {
		return previmgpath;
	}
	public void setPrevimgpath(String previmgpath) {
		this.previmgpath = previmgpath;
	}
	public int getBuild_id() {
		return build_id;
	}
	public void setBuild_id(int buildId) {
		build_id = buildId;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unitId) {
		unit_id = unitId;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int roomId) {
		room_id = roomId;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	
	
	public Resident() {
		super();
	}
	public Resident(String rsdname, int gender, String phone, String email,
			int age, int degree) {
		super();
		this.rsdname = rsdname;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.degree = degree;
	}
 
	 
	
	
	
	
}
