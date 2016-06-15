package norlando.dao;

import java.util.List;

/**
 * @author Administrator
 *
 */
public interface BaseDao01 {

	
//	查询多行
//	select * from user where id>50
	/**
	 * @param sql sql查询语句
	 * @param params 参数
	 * @param clazz  返回容量里面放的对象类型
	 * @return
	 */
//	alt=shift=j
	<T> List<T> getRowsFields(String sql,Object[] params,Class<T> clazz);

	int updateData(String sql, Object[] params);

	<T> T getRowFields(String sql, Object[] params, Class<T> clazz);

	Object getValue(String sql, Object[] params);
	
	
	
	
	
	
	int save(Object object);
	
	Object getObjById(Class clazz, int id);

	int saveOrUpdate(Object obj);

	int delete(Object obj);

	List getAllData(Class c);

	int update(Object obj);
}
