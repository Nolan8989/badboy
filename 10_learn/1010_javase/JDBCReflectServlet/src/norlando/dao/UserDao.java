package norlando.dao;


import norlando.basedao.BaseDao;

public interface UserDao<Entity> extends BaseDao<Entity>{
	public boolean cheack(String username,String password);
	
}
