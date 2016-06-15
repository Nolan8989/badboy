package com.bjsxt.dao;

import java.util.List;

import com.bjsxt.po.Resident;
import com.bjsxt.util.PageGoogle;

public interface ResidentDao {
	int getResidentRowCount(String sql,Object[] params);
	
	List findResidentAllPage(String sql,Object[] params,Class clazz);
	
	PageGoogle findRsd4PageData(String sql,Object[] params,Class clazz,int pageNum,int pageSize,int navNum);
	int addRsd(Resident rsd);
}
