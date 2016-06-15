package norlando.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




import norlando.base.BaseDaoImpl;
import norlando.dao.CityDao;
import norlando.entity.City;
import norlando.util.DBUtil;

public class CityDaoImpl extends BaseDaoImpl<City> implements CityDao {

	@Override
	public List<City> cityByProId(int proid) throws Exception {
		// TODO Auto-generated method stub
		Connection	conn = DBUtil.getConn();
		String sql = "select * from city where province_id =" + proid;
		PreparedStatement ps = DBUtil.getPs(conn, sql);
		ResultSet rs  = ps.executeQuery();
		List<City> clist = new ArrayList();
		while(rs.next()){
			City c = new City();
			c.setId(rs.getInt("id"));
			c.setName(rs.getString("name"));
			c.setProvince_id(rs.getInt("province_id"));
			clist.add(c);
			
		}
		
		return clist;
	}

	
}
