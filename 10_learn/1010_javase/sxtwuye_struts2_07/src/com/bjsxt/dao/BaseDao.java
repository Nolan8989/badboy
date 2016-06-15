package com.bjsxt.dao;

import java.util.List;

import com.bjsxt.util.PageGoogle;

public interface BaseDao {
//	��ѯ����
//	select * from user where id>50
	/**
	 * @param sql sql��ѯ���
	 * @param params ����
	 * @param clazz  ������������ŵĶ�������
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
	 * @param sql  Ҫ���з�ҳ��sql
	 * @param params  sql����
	 * @param clazz  ��ҳ��ѯ������ݵ�����
	 * @param pageNum  ��ǰ����
	 * @param pageSize һҳ��ʾ������
	 * @param navNum  һҳ��ʾ���ٸ�����
	 * @return
	 */
	PageGoogle pageTool(String sql,Object[] params,Class clazz,int pageNum,int pageSize,int navNum);
	
}
