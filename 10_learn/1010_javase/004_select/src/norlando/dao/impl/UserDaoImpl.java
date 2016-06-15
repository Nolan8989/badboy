package norlando.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import norlando.base.BaseDaoImpl;
import norlando.dao.UserDao;
import norlando.entity.User;
import norlando.util.DBUtil;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public  List findUsernameByKeyWord(String username) {
		List list = new ArrayList<String>();
		Connection conn  = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConn();
		String sql = "select username from user where  username like  ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, username+"%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("username"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(conn);
		}
		
		
		
		return list;
	}

	@Override
	public List findUserByKeyWord(String username,int star,int step) {
		List list = new ArrayList<String>();
		Connection conn  = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConn();
		String sql = "select * from user where  username like  ? limit ? ,?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, username+"%");
			ps.setInt(2, star);
			ps.setInt(3, step);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				user.setSex(rs.getInt("sex"));
				list.add(user);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(conn);
		}

		return list;
	}
	

}
