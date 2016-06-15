package com.sanqi.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sanqi.db.DBManager;

public class DeptDAO {
	//查询
	public ArrayList<Object[]> search(int page,int item) throws ClassNotFoundException, SQLException{
		DBManager db=new DBManager();
		int begin=(page-1)*item;
		String sql="select empno,ename,job,sal from (";
		sql+="select rownum rn,emp.* from emp)"; 
       	sql+="where rn>? and rownum<=?";
       	Object[] params={begin,item};
		ArrayList<Object[]> al=db.cha(sql, params);
		return al;
	}
	//总条数
	public int count() throws ClassNotFoundException, SQLException{
		DBManager db=new DBManager();
		String sql="select count(*) from emp";
		int num=db.count(sql);
		return num;
		
	}
}
