package norlando.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import norlando.util.DBUtil;

public class BaseDaoImpl<Entity> implements BaseDao<Entity> {
	
	protected Class clazz;
	
	
	public BaseDaoImpl() {
		//利用反射的ParameterizedType   由userImpl得到User
		ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass();
		//通过参数列表（泛型）得到里面的实际参数类型，强转成class类型。
		clazz = (Class) pt.getActualTypeArguments()[0];
		
//		System.out.println(clazz); //打印class norlando.entity.User
	}

	/**
	 * 保存，对象
	 */
	@Override	
	public boolean save(Entity entity) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		int num = 0;
		String sql = "insert into " + clazz.getSimpleName() +" value (null";
		Field[] fs = clazz.getDeclaredFields();
		for(int i = 1 ; i < fs.length;i++){
			sql +=",?";
//System.out.println(fs[i]);
		}
		sql = sql +")";
//System.out.println(sql);
		PreparedStatement ps = DBUtil.getPs(conn, sql);
		for (int i = 1; i < fs.length; i++) {
			//ps.setObjet(i,user.getusername);
			String methodName = "get" + Character.toUpperCase(fs[i].getName().charAt(0)) + fs[i].getName().substring(1);
//System.out.println(methodName);
			Method m = clazz.getDeclaredMethod(methodName);
			ps.setObject(i, m.invoke(entity));//这里int类型为什么也可存放？？？？
		}
			num = ps.executeUpdate();
		DBUtil.close(ps);
		DBUtil.close(conn);
		return num >0;
	}


	@Override
	public boolean update(Entity entity) throws Exception {
		int num = 0 ;
		Connection conn = DBUtil.getConn();
		String sql = "update " + clazz.getSimpleName() + " set ";
		Field[] fs = clazz.getDeclaredFields();
		for (int i = 1; i < fs.length; i++) {
			sql +=fs[i].getName()+"=?,";
		}
		sql = sql.substring(0,sql.length()-1);
		sql += " where id = ?";
//System.out.println(sql);
		PreparedStatement ps = DBUtil.getPs(conn, sql);
		for (int i = 1; i < fs.length; i++) {
			String methodName = "get"+ Character.toUpperCase(fs[i].getName().charAt(0))+fs[i].getName().substring(1);
//System.out.println(methodName);
			Method m = clazz.getDeclaredMethod(methodName);
			ps.setObject(i, m.invoke(entity));
		}
			Method getId = clazz.getDeclaredMethod("getId");
			ps.setInt(fs.length, (Integer) getId.invoke(entity));
	//clazz.getDeclaredMethod("get"+Character.toUpperCase(fs[0].getName().charAt(0))+fs[0].getName().substring(1))).invoke(entity);
			num = ps.executeUpdate();
			DBUtil.close(ps);
			DBUtil.close(conn);
		return num >0;
	}


	@Override
	public Entity findById(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "select * from " + clazz.getSimpleName() +" where id=?";
		PreparedStatement ps = DBUtil.getPs(conn, sql);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		Entity entity = (Entity)clazz.newInstance();//用反射new一个要封装的对象；
		//user.setInt();
		Field[] fs = clazz.getDeclaredFields();
		if(rs.next()){
//			rs.getObject(columnLabel);
			for (int i = 0; i < fs.length; i++) {
				String methodName = "set"+Character.toUpperCase(fs[i].getName().charAt(0))+fs[i].getName().substring(1);
				Method m = clazz.getDeclaredMethod(methodName, fs[i].getType());
				m.invoke(entity, rs.getObject(fs[i].getName()));
			}
		}
		DBUtil.close(rs);
		DBUtil.close(ps);
		DBUtil.close(conn);
		return entity;
	}


	@Override
	public List<Entity> findAll() throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "select * from "+clazz.getSimpleName();
		PreparedStatement ps = DBUtil.getPs(conn, sql);
		ResultSet rs = ps.executeQuery();
		List<Entity> list = new ArrayList<Entity>();
		Field[] fs = clazz.getDeclaredFields();
		while(rs.next()){
			Entity entity = (Entity)clazz.newInstance();
			for (int i = 0; i < fs.length; i++) {
				String methodName = "set"+ Character.toUpperCase(fs[i].getName().charAt(0))+fs[i].getName().substring(1);
				Method m = clazz.getDeclaredMethod(methodName, fs[i].getType());
				m.invoke(entity,rs.getObject(fs[i].getName()));
			}
//			System.out.println(entity);
			list.add(entity);
			
		}
		DBUtil.close(rs);
		DBUtil.close(ps);
		DBUtil.close(conn);
		return list;
	}
	
	@Override
	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		int num = 0;
		Connection conn = DBUtil.getConn();
		String sql = "delete from " + clazz.getSimpleName()+" where id = ?";
//		System.out.println(sql);
		PreparedStatement ps = DBUtil.getPs(conn, sql);
		ps.setInt(1, id);
		num = ps.executeUpdate();
		DBUtil.close(ps);
		DBUtil.close(conn);
		return num>0;
	}



}
