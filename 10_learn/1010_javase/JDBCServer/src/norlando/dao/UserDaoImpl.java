package norlando.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import norlando.entity.User;
import norlando.util.DBUtil;

public class UserDaoImpl {

	public void saveuser(User user) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "insert into user values(null,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = DBUtil.getPs(conn, sql);
		try {
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setInt(3, user.getAge());
			ps.setString(4,user.getSex());
			ps.setString(5, user.getBirthday());
			ps.setString(6, user.getFavorite());
			ps.setString(7,user.getCity());
			ps.setString(8,user.getDescription());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(ps);
			DBUtil.close(conn);
		}
		
	}



}
