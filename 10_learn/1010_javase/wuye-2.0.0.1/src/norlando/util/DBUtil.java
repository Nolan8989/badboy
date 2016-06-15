package norlando.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil 
{
 
	
	public static Connection getConn(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//装载驱动
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wuye","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void close(Connection conn, Statement ps,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Connection conn=getConn();
		System.out.println(conn);
	}
}
