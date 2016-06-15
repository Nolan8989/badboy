package norlando.service.impl;

import java.util.List;

import norlando.dao.SelectRoomDao;
import norlando.dao.impl.SelectRoomDaoImpl;
import norlando.service.SelectRoomService;


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

 