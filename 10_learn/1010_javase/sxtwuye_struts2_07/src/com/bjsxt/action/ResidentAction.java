package com.bjsxt.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

//import javax.faces.component.UIInput;

import com.bjsxt.dao.BaseDao;
import com.bjsxt.dao.impl.BaseDaoImpl;
import com.bjsxt.po.Resident;
import com.bjsxt.service.ResidentService;
import com.bjsxt.service.impl.ResidentServiceImpl;
import com.bjsxt.util.ImageUtil;
import com.bjsxt.util.PageGoogle;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ResidentAction extends ActionSupport implements ModelDriven<Resident>{
	
	private Resident resident = new Resident();

	
	private static ResidentService residentService = new ResidentServiceImpl();
	private String srcImageDir;
	
	private String srcPrevImageDir;
	
	
	
	public String getSrcImageDir() {
		return srcImageDir;
	}


	public void setSrcImageDir(String srcImageDir) {
		this.srcImageDir = srcImageDir;
	}


	public String getSrcPrevImageDir() {
		return srcPrevImageDir;
	}


	public void setSrcPrevImageDir(String srcPrevImageDir) {
		this.srcPrevImageDir = srcPrevImageDir;
	}


	private File   rsdimg;
	
	private String rsdimgContentType;
	
	private String rsdimgFileName;
	
	
	
	
	public Resident getResident() {
		return resident;
	}


	public void setResident(Resident resident) {
		this.resident = resident;
	}


	public File getRsdimg() {
		return rsdimg;
	}


	public void setRsdimg(File rsdimg) {
		this.rsdimg = rsdimg;
	}


	public String getRsdimgContentType() {
		return rsdimgContentType;
	}


	public void setRsdimgContentType(String rsdimgContentType) {
		this.rsdimgContentType = rsdimgContentType;
	}


	public String getRsdimgFileName() {
		return rsdimgFileName;
	}


	public void setRsdimgFileName(String rsdimgFileName) {
		this.rsdimgFileName = rsdimgFileName;
	}


	@Override
	public Resident getModel() {
		// TODO Auto-generated method stub
		return resident;
	}
	
	
	
	private int addflag;
	
	
	public int getAddflag() {
		return addflag;
	}


	public void setAddflag(int addflag) {
		this.addflag = addflag;
	}
	
	
	


	public String addRsd() throws Exception{
		
		if (rsdimg!=null) {
			String srcPath = this.srcImageDir+UUID.randomUUID().toString()+this.rsdimgFileName;
			OutputStream out  = new FileOutputStream(srcPath);
			InputStream in = new FileInputStream(rsdimg);
			
			int temp = 0;
			
			byte[] b = new byte[8192];
			while ((temp = in.read(b))!=-1) {
				out.write(b, 0, temp);
			}
			out.flush();
			out.close();
			in.close();
			String prevPath = this.srcPrevImageDir+UUID.randomUUID().toString()+this.rsdimgFileName;
			String fileType = this.rsdimgFileName.substring(this.rsdimgFileName.lastIndexOf(".")+1);
			ImageUtil.getPreviewImage(new File(srcPath), new File(prevPath), fileType);
			
			resident.setImgpath(srcPath);
			resident.setPrevimgpath(prevPath);
			
		}
		
		System.out.println(resident);
		
		addflag = residentService.addRsd(resident);
		
		return "add_ok";
	}
	
	private int num=1;
	
	private PageGoogle page;
	
	private int pageSize=10;
	
	
	
	
	
	
	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public PageGoogle getPage() {
		return page;
	}


	public void setPage(PageGoogle page) {
		this.page = page;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

	private static BaseDao baseDao = new BaseDaoImpl();
	public String findRsd4Page(){
		   this.page = baseDao.pageTool("select * from t_resident", null, Resident.class,num, pageSize, 10);
		
		   return "list_rsd";
	}
	
	
	private int rsdid;
	
	
	
	public int getRsdid() {
		return rsdid;
	}


	public void setRsdid(int rsdid) {
		this.rsdid = rsdid;
	}


	private Resident rsd ;
	
	
	public Resident getRsd() {
		return rsd;
	}


	public void setRsd(Resident rsd) {
		this.rsd = rsd;
	}


	public String findOneRsd(){
		this.rsd = baseDao.getObjById(Resident.class, rsdid);
		return "show_rsd";
		
	}
	
	
	
	

}
