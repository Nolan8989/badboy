package norlando.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import norlando.dao.SelectRoomDao;
import norlando.po.Build;
import norlando.po.Room;
import norlando.po.Unit;
import norlando.util.DBUtil;

public class SelectRoomDaoImpl implements SelectRoomDao {

	@Override
	public List<Build> findAllBuild() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn =DBUtil.getConn();
		String sql = "select * from t_build";
		List<Build> listb = new ArrayList<Build>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Build b = new Build(rs.getInt("id"),rs.getString("buildname"));
				listb.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return listb;
	}

	@Override
	public List<Unit> findUnitByBuidId(int bid) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn =DBUtil.getConn();
		String sql = "select * from t_unit where build_id=?";
		List<Unit> listb = new ArrayList<Unit>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bid);
			rs = ps.executeQuery();
			while (rs.next()) {
				 Unit u = new Unit(rs.getInt("id"), rs.getString("unitname"));
				listb.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return listb;
	}

	@Override
	public List<Room> findRoomByUnitId(int uid) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn =DBUtil.getConn();
		String sql = "select * from t_room where unit_id=?";
		List<Room> listb = new ArrayList<Room>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, uid);
			rs = ps.executeQuery();
			while (rs.next()) {
				Room r = new Room(rs.getInt("id"), rs.getString("roomname"));
				listb.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return listb;
	}

}
