package norlando.service;

import java.util.List;

public interface SelectRoomService {
	List findAllBuild();
	List findUnitByBuildId(int bid);
	List findRoomByUnitId(int uid);
}
