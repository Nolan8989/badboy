package norlando.services.impl;

import java.util.List;

import norlando.dao.SelectRoomDao;
import norlando.dao.impl.SelectRoomDaoImpl;
import norlando.po.Build;
import norlando.po.Room;
import norlando.po.Unit;
import norlando.services.SelectRoomService;

public class SelectRoomServiceImpl implements SelectRoomService {
	SelectRoomDao srd = new SelectRoomDaoImpl();
	@Override
	public List<Build> findAllBuild() {
		// TODO Auto-generated method stub
		return this.srd.findAllBuild();
	}

	@Override
	public List<Unit> findUnitByBuildId(int bid) {
		// TODO Auto-generated method stub
		return this.srd.findUnitByBuidId(bid);
	}

	@Override
	public List<Room> findRoomByUnitId(int uid) {
		// TODO Auto-generated method stub
		return this.srd.findRoomByUnitId(uid);
	}

}
