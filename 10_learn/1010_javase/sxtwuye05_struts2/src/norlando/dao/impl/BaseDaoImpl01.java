package norlando.dao.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import norlando.dao.BaseDao01;
import norlando.util.BeanUtil;
import norlando.util.DBUtil;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class BaseDaoImpl01 implements BaseDao01 {
//	select * from t_resident;
//	select rsdname,identity  from t-resident
	

	
	
	
	
	public static void main(String[] args) {
		BaseDao01 baseDao = new BaseDaoImpl01();
//		List<Resident> list = 	baseDao.getRowsFields("select * from t_resident	", null	, Resident.class);
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Resident rsd = (Resident) iterator.next();
//			System.out.println(rsd.getRsdname());
//		}
		
//		Resident rsd =  baseDao.getRowFields("select * from t_resident where id=?", new Object[]{771}, Resident.class);
//		System.out.println(rsd.getRsdname());
//		Number n =  (Number) baseDao.getValue("select count(*) from t_resident", null);
//		System.out.println(n.intValue());
//		int f = baseDao.updateData("delete from t_resident where id=?", new Object[]{771});
//		System.out.println(f);
}

	
	
	
	
	
	
	@Override
	public<T> List<T> getRowsFields(String sql, Object[] params, Class<T> clazz) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		conn = DBUtil.getConn();
		
		
		try {
		ps = DBUtil.getPs(conn, sql);
			if(params != null){
//				初始化参数				
				for(int i = 0 ; i <params.length; i++){
					ps.setObject(i+1, params[i]);
				}
			}
//			执行查询			
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			//rsmd.getColumnCount();
			//rsmd.getColumnName(1);
//			数据初始化思路？？？			
			while(rs.next()){
				Object obj = clazz.newInstance();
				
				for(int i = 0 ; i <rsmd.getColumnCount();i++){
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
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		return list;
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
//			初始化参数
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
//		int flag = 1;//1操作成功  0失败
//		try {
//			conn = DBUtil.getConn();
//			conn.setAutoCommit(false);
//			ps = conn.prepareStatement(sql);
//			if (params!=null) {
////				初始化参数
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
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int flag = 1;//1操作成功  0失败
		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			if (params!=null) {
//				初始化参数
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
			}
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			flag= 0;
 
		}finally{
	 
			DBUtil.close(conn, ps, rs);
		}
		return flag;
	}


	@Override
	public <T> T getRowFields(String sql, Object[] params, Class<T> clazz) {
		// TODO Auto-generated method stub
		
				List list = this.getRowsFields(sql, params, clazz);
				Object obj = null;
				if(list!=null && list.size()>0){
					obj = list.get(0);
				
				}
				return (T) obj;
	}


	
	@Override
	public int save(Object object){
		
		Class clazz = object.getClass();
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into t_");
		sql.append(clazz.getSimpleName());
		sql.append("(");
		
		
		StringBuffer sql2 = new StringBuffer();
		Field [] fs = clazz.getDeclaredFields();
		List list = new ArrayList();
		for(int i = 0 ;i <fs.length; i++){
			Field f = fs[i];
			if(!"id".equals(f.getName())){
				try{
					Method getM = null;
					if("boolean".equals(f.getType().getName()) || "java.lang.Boolean".equals(f.getType().getName())){
						getM = clazz.getMethod(BeanUtil.getBooleanGetterName(f.getName()));
					}else {
						getM = clazz.getMethod(BeanUtil.getGetterName(f.getName()));
					}
					
					list.add(getM.invoke(object));
					sql.append(f.getName());
					sql2.append("?");
					if (i<(fs.length-1)) {
						sql.append(",");
						sql2.append(",");
					}
				}catch(Exception e){
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


	


	@Override
	public Object getObjById(Class clazz, int id) {
		// TODO Auto-generated method stub
		String sql = "select * from t_"+clazz.getSimpleName()+"  where id = ?";
		Object obj = this.getRowFields(sql, new Object[]{id}, clazz);
		return obj;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	/**通过对象映射修改记录
	 * 约定优于配置！
	 * @param obj
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public  int update(Object obj)    {
		//更新时，首先要确定有这个记录。通过ID!!!
		//Less is More! 简洁就是美！
		//约定优于配置！
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
	
	
	
//	如果有就修改，没有就添加 
//	如果有id  先通过id查出来
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
//				代码重用
				return save(obj);
			}else{
//				
//				代码重用
				return update(obj);
			}
			
		} catch ( Exception e) {
			e.printStackTrace();
		} 
		return 0;
	}
	
	
//	通过id删除掉相应的数据
	@Override
	public  int delete(Object obj) {
		//把这个对象对应的记录删掉！ 通过ID确定是否对应！！！
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
	
	
//	查询到所有的数据，根据映射
	@Override
	public  List getAllData(Class c){
		return getRowsFields("select * from t_"+c.getSimpleName().toLowerCase(),null,c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
