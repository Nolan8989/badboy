package com.bjsxt.service.impl;

import java.util.List;

import com.bjsxt.dao.SelectRoomDao;
import com.bjsxt.dao.impl.SelectRoomDaoImpl;
import com.bjsxt.service.SelectRoomService;

public class SelectRoomServiceImpl implements SelectRoomService{
	private static SelectRoomDao selectRoomDao = new SelectRoomDaoImpl() ;

	@Override
	public List findAllBuild() {
		// TODO Auto-generated method stub
		return selectRoomDao.findAllBuild();
	}

	@Override
	public List findRoomByUnitId(int uid) {
		// TODO Auto-generated method stub
		return selectRoomDao.findRoomByUnitId(uid);
	}

	@Override
	public List findUnitByBuildId(int bid) {
		// TODO Auto-generated method stub
		return selectRoomDao.findUnitByBuildId(bid);
	}
	 
}

 