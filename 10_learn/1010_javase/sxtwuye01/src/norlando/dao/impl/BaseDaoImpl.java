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
import norlando.util.BeanUtil;
import norlando.util.DBUtil;

public class BaseDaoImpl implements BaseDao {

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
				Object object = clazz.newInstance();
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String fieldName = rsmd.getColumnName(i+1);
					Field f = clazz.getDeclaredField(fieldName);
					Method setObj = clazz.getMethod(BeanUtil.getSetterName(fieldName),new Class[]{f.getType()});
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
