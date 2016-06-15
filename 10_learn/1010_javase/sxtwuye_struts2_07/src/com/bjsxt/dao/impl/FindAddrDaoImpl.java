package com.bjsxt.dao.impl;

import java.util.List;

import com.bjsxt.dao.FindAddrDao;
import com.bjsxt.po.Build;

public class FindAddrDaoImpl extends BaseDaoImpl implements FindAddrDao{

	@Override
	public List findAllBuilding() {
		// TODO Auto-generated method stub
		return this.getAllData(Build.class);
	}

}
