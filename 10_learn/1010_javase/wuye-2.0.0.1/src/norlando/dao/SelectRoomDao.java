package norlando.dao;

import java.util.List;

public interface SelectRoomDao {
	List findAllBuild();
	List findUnitByBuildId(int bid);
	List findRoomByUnitId(int uid);
}
