package com.bjsxt.dao.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bjsxt.dao.BaseDao;
import com.bjsxt.po.Resident;
import com.bjsxt.util.BeanUtil;
import com.bjsxt.util.DBUtil;
import com.bjsxt.util.PageGoogle;

public class BaseDaoImpl implements BaseDao{

//	select * from t_resident;
//	select rsdname,identity  from t-resident
	@SuppressWarnings("unchecked")
	@Override
	public <T>  List<T> getRowsFields(String sql, Object[] params, Class<T> clazz) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		conn = DBUtil.getConn();
		try {
			ps = conn.prepareStatement(sql);
			if (params!=null) {
//				��ʼ������
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
			}
			
//		ִ�в�ѯ
			
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
//			System.out.println(rsmd.getColumnCount());
//			System.out.println(rsmd.getColumnName(1));
//			���ݳ�ʼ��˼·������
			while (rs.next()) {
				Object  obj = clazz.newInstance();
				
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String fieldName = rsmd.getColumnName(i+1);
					Field f = clazz.getDeclaredField(fieldName);
					Method setObj = clazz.getMethod(BeanUtil.getSetterName(fieldName), new Class[]{f.getType()});
					Object objvalue = rs.getObject(fieldName);
					if (objvalue!=null) {
						setObj.invoke(obj, objvalue);
						
					}
				}
				
				list.add(obj);
				
			}
//			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		
		
		return list;
	}
	
	public static void main(String[] args) {
		BaseDao baseDao = new BaseDaoImpl();
//	List<Resident> list = 	baseDao.getRowsFields("select * from t_resident	", null	, Resident.class);
//	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//		Resident rsd = (Resident) iterator.next();
//		System.out.println(rsd.getRsdname());
//	}
		
//		Resident rsd =  baseDao.getRowFields("select * from t_resident where id=?", new Object[]{771}, Resident.class);
//		System.out.println(rsd.getRsdname());
//		Number n =  (Number) baseDao.getValue("select count(*) from t_resident", null);
//		System.out.println(n.intValue());
//		int f = baseDao.updateData("delete from t_resident where id=?", new Object[]{774});
//		System.out.println(f);
		for (int i = 0; i < 10000; i++) {
			Resident rsd = new Resident("cai"+i, 1, "1388888888", "eee@234.com", 13, 3);
			baseDao.save(rsd);
			
		}
//		Resident rsd = baseDao.getObjById(Resident.class, 825);
////		System.out.println(rsd.getRsdname());
//		rsd.setRsdname("66666666666");
////		baseDao.update(rsd);
//		rsd.setId(0);
//		baseDao.saveOrUpdate(rsd);
		
//		baseDao.delete(rsd);
//		List<Resident> rsdlist = baseDao.getAllData(Resident.class);
//		for (Iterator iterator = rsdlist.iterator(); iterator.hasNext();) {
//			Resident resident = (Resident) iterator.next();
//			System.out.println(resident.getId());
//			
//		}
}
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getRowFields(String sql, Object[] params, Class<T> clazz) {
		// TODO Auto-generated method stub
		
		List list = this.getRowsFields(sql, params, clazz);
		Object obj = null;
		if(list!=null&&list.size()>0){
			obj = list.get(0);
		
		}
		return (T) obj;
	}
// select count(*) from t-resident
	@Override
	public Object getValue(String sql, Object[] params) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConn();
		Object obj = null;
		try {
			ps = conn.prepareStatement(sql);
			if (params!=null) {
//			��ʼ������
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
			}
			rs = ps.executeQuery();
			rs.next();
			obj = rs.getObject(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		
		return obj;
	}

//	@Override
//	public int updateData(String sql, Object[] params) {
//		// TODO Auto-generated method stub
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		int flag = 1;//1�����ɹ�  0ʧ��
//		try {
//			conn = DBUtil.getConn();
//			conn.setAutoCommit(false);
//			ps = conn.prepareStatement(sql);
//			if (params!=null) {
////				��ʼ������
//					for (int i = 0; i < params.length; i++) {
//						ps.setObject(i+1, params[i]);
//					}
//				}
//			ps.executeUpdate();
//			int t = 1/0;
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			flag= 0;
//			try {
//				if (conn!=null) {
//					conn.rollback();
//				}
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}finally{
//			if (conn!=null) {
//				try {
//					conn.commit();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			DBUtil.close(conn, ps, rs);
//		}
//		return flag;
//	}
	
	@Override
	public int updateData(String sql, Object[] params) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int flag = 1;//1�����ɹ�  0ʧ��
		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			if (params!=null) {
//				��ʼ������
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
			}
			ps.executeUpdate();
//			int t = 1/0;
		} catch (Exception e) {
			e.printStackTrace();
			flag= 0;
 
		}finally{
	 
			DBUtil.close(conn, ps, rs);
		}
		return flag;
	}
//	orm
//	t_
//insert into t_resident(rsdname,email) vlaues(?,?)
	@SuppressWarnings("unchecked")
	@Override
	public int save(Object object) {
		// TODO Auto-generated method stub
		Class clazz = object.getClass();
		StringBuffer sql = new StringBuffer();
		sql.append("insert into t_");
		sql.append(clazz.getSimpleName());
		sql.append("(");
		
		StringBuffer sql2 = new StringBuffer();
		Field[] fs = clazz.getDeclaredFields();
		List list = new ArrayList();
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			if (!"id".equals(f.getName())) {
				try {
					Method getM = null;
					System.out.println(f.getType().getName());
					if ("boolean".equals(f.getType().getName())||"java.lang.Boolean".equals(f.getType().getName())) {
						getM = clazz.getMethod(BeanUtil.getBooleanGetterName((f.getName())));
					}else{
						getM = clazz.getMethod(BeanUtil.getGetterName((f.getName())));
						
					}
					
					list.add(getM.invoke(object));
					sql.append(f.getName());
					sql2.append("?");
					if (i<(fs.length-1)) {
						sql.append(",");
						sql2.append(",");
						
					}
				} catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
			
		}
		
		sql.append(")");
		String fsql = sql.toString()+" values("+sql2.toString()+")";
		
		System.out.println(fsql);
		int flag = updateData(fsql, list.toArray());
		return flag;
	}

//	select * from t_resident where id = ?
	@SuppressWarnings("unchecked")
	@Override
	public <T>  T getObjById(Class<T> clazz, int id) {
		// TODO Auto-generated method stub
		String sql = "select * from t_"+clazz.getSimpleName()+"  where id = ?";
		Object obj = this.getRowFields(sql, new Object[]{id}, clazz);
		return (T) obj;
	}

	
	
	/**ͨ������ӳ���޸ļ�¼
	 * Լ���������ã�
	 * @param obj
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public  int update(Object obj)    {
		//����ʱ������Ҫȷ���������¼��ͨ��ID!!!
		//Less is More! ����������
		//Լ���������ã�
//		update _user set name=?,pwd=?,email=?,gender=?,ip=? where id=?
		StringBuilder sb;
		List params;
		int flag =0;
		try {
			sb = new StringBuilder("update t_"+obj.getClass().getSimpleName().toLowerCase()+" ");
			sb.append("set  ");
			Field[] fs = obj.getClass().getDeclaredFields();
			params = new ArrayList();
			int j=0;
			for (int i = 0; i < fs.length; i++) {
				if(!"id".equalsIgnoreCase(fs[i].getName())){
					sb.append(fs[i].getName()+"=?");
					Method m  =obj.getClass().getDeclaredMethod(  BeanUtil.getGetterName(fs[i].getName()));
					params.add(m.invoke(obj));
					if(i<fs.length-1){
						sb.append(",");
					}
					j++;
				}
			}
			sb.append(" where id=?");
			Method m  =obj.getClass().getDeclaredMethod( BeanUtil.getGetterName("id"));
			params.add(m.invoke(obj));
			System.out.println(sb);
			  flag = updateData(sb.toString(), params.toArray());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return flag;
	}
	
	
	
//	����о��޸ģ�û�о���� 
//	�����id  ��ͨ��id�����
	@Override
	public  int saveOrUpdate(Object obj){
		Method m = null;
		int id = 0;
//		long num = 0;
		Number num = null;
		try {
			m = obj.getClass().getDeclaredMethod( BeanUtil.getGetterName("id"));
			id = (Integer) m.invoke(obj);
			
//			getValue
			num = (Number) getValue("select count(*) from t_"+obj.getClass().getSimpleName().toLowerCase()+" where id=?", new Object[]{id}); 
			
			if(num.intValue()==0){
//				��������
				return save(obj);
			}else{
//				
//				��������
				return update(obj);
			}
			
		} catch ( Exception e) {
			e.printStackTrace();
		} 
		return 0;
	}
	
	
//	ͨ��idɾ������Ӧ������
	@Override
	public  int delete(Object obj) {
		//����������Ӧ�ļ�¼ɾ���� ͨ��IDȷ���Ƿ��Ӧ������
		//delete from t_user where id=obj.id
		Method m = null;
		String sql = null ;
		int flag = 0;
		try {
			m = obj.getClass().getDeclaredMethod(BeanUtil.getGetterName("id"));
			  sql = "delete from t_"+obj.getClass().getSimpleName().toLowerCase()+" where id=? ";
			 flag =  updateData(sql, new Object[]{m.invoke(obj)});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		return flag;
	}
	
	
//	��ѯ�����е����ݣ�����ӳ��
	@Override
	public  List getAllData(Class c){
		return getRowsFields("select * from t_"+c.getSimpleName().toLowerCase(),null,c);
	}
//select * from t-resident where gender=?
	
//	limit ?,?
	@Override
	public PageGoogle pageTool(String sql, Object[] params, Class clazz,
			int pageNum, int pageSize, int navNum) {
		// TODO Auto-generated method stub
		String rowCountSql = "select count(* ) from ("+sql+")temptab";
		Number number = (Number) this.getValue(rowCountSql, params);
		
		PageGoogle page = new PageGoogle(number.intValue()	, pageSize, pageNum, navNum);
//		select * from t_resident limit ?,?
		
		String pagesql = sql+"   limit ?,?";
		Object[] np = null;
		if(params!=null){
			np = new Object[params.length+2];
			for (int i = 0; i < params.length; i++) {
				np[i] = params[i];
				
			}
			
			np[params.length]=page.getStartRow();
			np[params.length+1]=page.getPageSize();
			
		}else{
			np = new Object[2];
			
			np[0] = page.getStartRow();
			np[1] = page.getPageSize();
			
		}
		
		
//		�Ѿ���ѯ�õķ�ҳ����
		List pageData =  this.getRowsFields(pagesql, np, clazz);
		page.setPageData(pageData);
		
		
		return page;
	}
}
