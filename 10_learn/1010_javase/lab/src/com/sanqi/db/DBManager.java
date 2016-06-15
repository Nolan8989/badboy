package com.sanqi.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
public class DBManager {

			private static Connection con;
			public DBManager() throws ClassNotFoundException, SQLException{
				
				con=getcon();
			}
			public Connection  getcon() throws ClassNotFoundException, SQLException{
				String strDriver="oracle.jdbc.driver.OracleDriver";
				String strUrl="jdbc:oracle:thin:@localhost:1521:orcl";
				String userName="scott";
				String userPass="tiger";
				Connection con=null;
				PreparedStatement  stm=null;
				//System.out.println(strDriver);
				Class.forName(strDriver);
				con=DriverManager.getConnection(strUrl, userName, userPass);
				//stm=con.prepareStatement(sql);
				return con;
			}
			//查询所有记录
			public ArrayList<Object[]> cha(String sql,Object []params) throws ClassNotFoundException, SQLException{
				PreparedStatement stm=con.prepareStatement(sql);
				
				if(params!=null){
					int len=params.length;
					for (int i = 0; i < len; i++) {
						stm.setObject(i+1, params[i]);
					}	
				}
				ArrayList<Object[]> al=new ArrayList<Object[]>();
				ResultSet rs=stm.executeQuery();
				ResultSetMetaData temp=rs.getMetaData();
				int num=temp.getColumnCount();
				Object []title=new Object[num];
				for (int i = 0; i < title.length; i++) {
					title[i]=temp.getColumnName(i+1);
				}
				al.add(title);
				while (rs.next()) {
					Object []arr=new Object[num];
					for(int i=0;i<num;i++){
						arr[i]=rs.getObject(i+1);
						
					}
					al.add(arr);
				}
				rs.close();
				stm.close();
				return al;
			}
			//聚合查询，查询总条数
			public int count(String sql) throws ClassNotFoundException, SQLException{
				PreparedStatement stm=con.prepareStatement(sql);
				ResultSet rs=stm.executeQuery();
				int num=0;
				if(rs.next()){
					num=rs.getInt(1);
				}
				rs.close();
				stm.close();
				return num;
			}
			
	
}
