package com.bjsxt.service;

import java.util.List;

import com.bjsxt.po.Resident;
import com.bjsxt.util.PageGoogle;

public interface ResidentService {
	int getResidentCount();
	
	List findResidentAllPage(int startRow,int pageSize);
	
	PageGoogle findRsdByBuildAndDegree(int num,int degree,int buildid,int navNum);
	int addRsd(Resident rsd);
}
