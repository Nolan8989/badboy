package norlando.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import norlando.dao.AnalysisDataDao;
import norlando.util.DBUtil;


public class AnalysisDataDaoImpl implements AnalysisDataDao{

	@Override
	public List analysisDegreeByBuildId(int buildId) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		conn = DBUtil.getConn();
		String sql = "select  ifnull(tab01.dnum,0) dnum ,td.id degreeid,td.dname dname  from "+
					"	(select degree,count(degree) dnum from t_resident where build_id=? group by degree)tab01 "+
					"	right join t_degree td on  tab01.degree=td.id	";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, buildId);
			rs = ps.executeQuery();
			while (rs.next()) {
				List set = new ArrayList();
				set.add(rs.getString("dname"));
				set.add(rs.getInt("dnum"));
				set.add(rs.getInt("degreeid"));
				list.add(set);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return list;
	}

	@Override
	public List analysisAgePartByBuildId(int buildId) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		conn = DBUtil.getConn();
		String sql ="select ifnull(tagetab.anum,0) agenum ,ta.id aid,ta.agepart agepart from  "+
					" (select (case  when age between 1 and 10 then '1-10' "+
					" when age between 11 and 20 then '11-20' "+
					" when age between 21 and 30 then '21-30' "+
					" when age between 31 and 40 then '31-40' "+
					" when age between 41 and 50 then '41-50' "+
					" when age between 51 and 60 then '51-60'  else '61以上'   end "+
					" )tage,count(age) anum from t_resident  where build_id=?  group by tage )tagetab  right join  t_agepart  ta  on tagetab.tage=ta.agepart";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, buildId);
			rs = ps.executeQuery();
			while (rs.next()) {
				List set = new ArrayList();
				set.add(rs.getString("agepart"));
				set.add(rs.getInt("agenum"));
				set.add(rs.getInt("aid"));
				list.add(set);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return list;
	}

}
