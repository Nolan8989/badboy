package com.bjsxt.dao;

import java.util.List;

import com.bjsxt.util.PageGoogle;

public interface BaseDao {
//	查询多行
//	select * from user where id>50
	/**
	 * @param sql sql查询语句
	 * @param params 参数
	 * @param clazz  返回容量里面放的对象类型
	 * @return
	 */
//	alt=shift=j
//	     List  getRowsFields(String sql,Object[] params,Class clazz);

	<T> List<T> getRowsFields(String sql, Object[] params, Class<T> clazz);
	
	<T> T getRowFields(String sql, Object[] params, Class<T> clazz);
	Object  getValue(String sql, Object[] params);
	
	int updateData(String sql,Object[] params );
	
	
	int save(Object object);
	
	<T>  T getObjById(Class<T> clazz,int id);
	int update(Object obj);
	int saveOrUpdate(Object obj);
	int delete(Object obj) ;
	List getAllData(Class c);
//	/
//	select * from t_resident  where gender=1
	
	/**
	 * @param sql  要进行分页的sql
	 * @param params  sql参数
	 * @param clazz  分页查询结果数据的类型
	 * @param pageNum  当前导航
	 * @param pageSize 一页显示多少行
	 * @param navNum  一页显示多少个导航
	 * @return
	 */
	PageGoogle pageTool(String sql,Object[] params,Class clazz,int pageNum,int pageSize,int navNum);
	
}
