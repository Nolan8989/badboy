package norlando.dao;

import java.util.List;

public interface BaseDao {

	
	
	/**
	 * @param sql 查询语句
	 * @param params 参数
	 * @param clazz  返回容量里面放的对象类型
	 * @return
	 */
	<T> List<T> getRowsFields(String sql,Object[] params,Class<T> clazz);
}
