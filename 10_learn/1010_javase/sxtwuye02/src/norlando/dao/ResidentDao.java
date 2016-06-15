package norlando.dao;

import java.util.List;


import com.bjsxt.po.Resident;

public interface ResidentDao extends BaseDao {

	/**
	 * 连接数据库查找Resident的数量.
	 * @param object 
	 * @param sql 
	 * @return
	 */
	int getResidentRowsCount(String sql, Object[] params);

	List getResdentLimitPage(String sql, Object[] params,Class<Resident> clazz);

	

}
