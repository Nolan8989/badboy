package com.bjsxt.service.impl;

import java.util.List;

import com.bjsxt.dao.FindAddrDao;
import com.bjsxt.dao.impl.FindAddrDaoImpl;
import com.bjsxt.service.FindAddrService;

public class FindAddrServiceImpl implements FindAddrService{
	private static FindAddrDao findAddrDao = new FindAddrDaoImpl();
	@Override
	public List findAllBuilding() {
		// TODO Auto-generated method stub
		return findAddrDao.findAllBuilding();
	}

}
