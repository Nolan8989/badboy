package norlando.dao;

import java.util.List;

import norlando.po.Resident;
import norlando.util.PageGoogle;



public interface ResidentDao extends BaseDao {

	/**
	 * 连接数据库查找Resident的数量.
	 * @param object 
	 * @param sql 
	 * @return
	 */
	int getResidentRowsCount(String sql, Object[] params);

	List getResdentLimitPage(String sql, Object[] params,Class<Resident> clazz);

	PageGoogle findRsd4PageData(String sql, Object[] objects,Class<Resident> class1, int num, int i, int navNum);

	

}
