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


import norlando.dao.BaseDao;
import norlando.dao.BaseDao01;
import norlando.po.Resident;
import norlando.util.BeanUtil;
import norlando.util.DBUtil;
import norlando.util.PageGoogle;

public class BaseDaoImpl implements BaseDao {

	
	
	
	public static void main(String[] args) {
		BaseDao baseDao = new BaseDaoImpl();
		for (int i = 0; i < 9; i++) {
			Resident rsd = new Resident("iiiiiiiiiiiii"+i, 1, "1388888888", "eee@234.com", 13, 3);
			baseDao.save(rsd);
		}
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
	public <T> List<T> getRowsFields(String sql, Object[] params, Class<T> clazz) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		conn = DBUtil.getConn();
		
		try {	
			ps = DBUtil.getPs(conn, sql);
			//遍历参数
			if(params != null){
				for (int i = 0; i < params.length; i++) {
						ps.setObject(i+1, params[i]);
				}
			}
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			while(rs.next()){
				Object obj = clazz.newInstance();
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String fieldName = rsmd.getColumnName(i+1);
					Field f = clazz.getDeclaredField(fieldName);
					Method setObj = clazz.getMethod(BeanUtil.getSetterName(fieldName),new Class[]{f.getType()});
					Object objvalue = rs.getObject(fieldName);
					if(objvalue != null){
						setObj.invoke(obj, objvalue);
					}
				}
				list.add(obj);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return list;
	}

	
	
	
	
	
	@Override
	public int updateData(String sql, Object[] params) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int flag = 1;//1操作成功  0失败
		try{
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			if(params != null){
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
//System.out.println(params);
				}
			}
//System.out.println(sql);
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			flag = 0;
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
		if(list != null && list.size() >0){
			obj = list.get(0);
		}
		return (T)obj;
	}

	
	
	
	
	@Override
	public Object getValue(String sql, Object[] params) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConn();
		Object obj = null;
		try{
		ps = DBUtil.getPs(conn, sql);
			if( params != null){
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
			}
			rs = ps.executeQuery();
			rs.next();
			obj = rs.getObject(1);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		return obj;
	}

	
	
	
	
	
	@Override
	public int save(Object object) {
		// TODO Auto-generated method stub
		
		Class clazz = object.getClass();
		
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into t_");
		sql1.append(clazz.getSimpleName());
		sql1.append("(");
		
		StringBuffer sql2 = new StringBuffer();
		Field[] fs = clazz.getDeclaredFields();
		List list = new ArrayList();
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			if(!"id".equals(f.getName())){
				try{
					Method getM = null;
					if("boolean".equals(f.getType().getName()) || "java.lang.Boolean".equals(f.getType().getName())){
						getM = clazz.getMethod(BeanUtil.getBooleanGetterName(f.getName()));
					}else{
						getM = clazz.getMethod(BeanUtil.getGetterName(f.getName()) );
					}
					list.add(getM.invoke(object));
					sql1.append(f.getName());
					sql2.append("?");
					if(i<(fs.length-1)){
						sql1.append(",");
						sql2.append(",");
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
		}
		sql1.append(")");
		String fsql = sql1.toString() + "values (" + sql2.toString() + ")";
		System.out.println(fsql);
		int flag = updateData(fsql,list.toArray());
		
		return flag;
	}

	
	
	
	
	@Override
	public Object getObjById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveOrUpdate(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

//	查询到所有的数据，根据映射
	@Override
	public  List getAllData(Class c){
		return getRowsFields("select * from t_"+c.getSimpleName().toLowerCase(),null,c);
	}

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	/**封装后的分页查询(google)
	 * @param sql 查询语句,可以带?
	 * @param params sql语句的参数, Object[]类型
	 * @param clazz 分页查询结果数据的类型
	 * @param pageSize  当前导航
	 * @param num 一页显示多少行
	 * @param navNum 一页显示多少个导航
	 * @return
	 */
	@Override
	public PageGoogle getPesdentLimitPage(String sql, Object[] params,Class clazz, int pageSize, int num, int navNum) {
		// TODO Auto-generated method stub
		
		String sqlStr = "select count(*) from (" + sql+ ")rc";
		Number number = (Number)this.getValue(sqlStr, params);
		int rowCount = number.intValue();
		PageGoogle page = new PageGoogle(rowCount,pageSize,num,navNum);
		
		String pageStr = sql + " limit ?,?";
		Object[] np = null ;
		if(params != null){
			np= new Object[params.length + 2];
			for (int i = 0; i < params.length; i++) {
				np[i] = params[i];
			}
			np[params.length] = page.getStartRow();
			np[params.length + 1] = page.getPageSize();
		}else{
			np= new Object[2];
			np[0] = page.getStartRow();
			np[1] = page.getPageSize();
		}
//		System.out.println(pageStr);
		List pageData = this.getRowsFields(pageStr, np, clazz);
		page.setPageData(pageData);
		return page;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
