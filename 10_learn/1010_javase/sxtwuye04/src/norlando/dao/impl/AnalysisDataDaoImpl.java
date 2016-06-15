package norlando.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import norlando.dao.AnalysisDataDao;
import norlando.util.DBUtil;

public class AnalysisDataDaoImpl extends BaseDaoImpl implements AnalysisDataDao {

	@Override
	public List analysisDegreeByBuildId(int buildId) {
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

	
	

}
