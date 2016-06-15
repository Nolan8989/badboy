package norlando.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import norlando.entity.Classes;
import norlando.util.DBUtil;


public class ClassDao {
	public List findClassAll(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Classes> clist = new ArrayList<Classes>();
		try {
			
			
			conn = DBUtil.getConn();
			String sql = "select * from classes";
			ps = DBUtil.getPs(conn, sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Classes c = new Classes();
				c.setId(rs.getInt("id"));
				c.setClassname(rs.getString("classname"));
				c.setClassdesc(rs.getString("classdesc"));
				clist.add(c);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(conn);
			
		}
		
		return clist;
	}
}
