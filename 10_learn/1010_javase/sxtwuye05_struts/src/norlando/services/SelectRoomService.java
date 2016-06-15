package norlando.services;

import java.util.List;

import norlando.po.Build;
import norlando.po.Room;
import norlando.po.Unit;

public interface SelectRoomService {

	List<Build> findAllBuild();

	List<Unit> findUnitByBuildId(int bid);

	List<Room> findRoomByUnitId(int uid);

}
