package norlando.dao;

import java.util.List;

import norlando.po.Build;
import norlando.po.Room;
import norlando.po.Unit;

public interface SelectRoomDao {

	List<Build> findAllBuild();

	List<Unit> findUnitByBuidId(int bid);

	List<Room> findRoomByUnitId(int uid);

}
