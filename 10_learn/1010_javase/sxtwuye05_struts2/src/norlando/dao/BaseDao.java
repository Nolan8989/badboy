package norlando.dao;

import java.util.List;

import norlando.po.Resident;
import norlando.util.PageGoogle;


public interface BaseDao {

	
	
	/**
	 * @param sql 查询语句
	 * @param params 参数
	 * @param clazz  返回容量里面放的对象类型
	 * @return
	 */
	<T> List<T> getRowsFields(String sql,Object[] params,Class<T> clazz);
	
	
	int updateData(String sql, Object[] params);
	
	
	<T> T getRowFields(String sql, Object[] params, Class<T> clazz);
	
	
	/** 
	 * @param sql
	 * @param params
	 * @return 第一个值且只取一个
	 */
	Object getValue(String sql, Object[] params);
	
	
	int save(Object object);
	
	
	
	Object getObjById(Class clazz, int id);

	int saveOrUpdate(Object obj);

	int delete(Object obj);

	List getAllData(Class c);

	int update(Object obj);
	
	/**封装后的分页查询(google)
	 * @param sql 查询语句,可以带?
	 * @param params sql语句的参数, Object[]类型
	 * @param clazz 分页查询结果数据的类型
	 * @param pageSize  当前导航
	 * @param num 一页显示多少行
	 * @param navNum 一页显示多少个导航
	 * @return
	 */
	PageGoogle getPesdentLimitPage(String sql, Object[] params,Class clazz, int pageSize, int num, int navNum);
}
