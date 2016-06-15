package norlando.dao.impl;


import norlando.base.BaseDaoImpl;
import norlando.dao.UserDao;
import norlando.entity.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao<User> {



	@Override
	public boolean cheack(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
