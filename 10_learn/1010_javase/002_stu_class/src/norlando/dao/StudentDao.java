package norlando.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import norlando.entity.Student;
import norlando.util.DBUtil;

public class StudentDao {

	public List findByCid(int cid) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Student> strlist = new ArrayList<Student>();
		try{
			conn = DBUtil.getConn();
			String sql = "select * from student where cid = ?";
			ps = DBUtil.getPs(conn, sql);
			ps.setInt(1, cid);
			rs = ps.executeQuery();
			while(rs.next()){
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setGender(rs.getInt("gender"));
				s.setCid(cid);
				strlist.add(s);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(conn);
		}
		return strlist;
	}
	
}
