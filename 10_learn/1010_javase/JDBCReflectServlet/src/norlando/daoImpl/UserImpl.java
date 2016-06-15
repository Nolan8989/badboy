package norlando.daoImpl;


import norlando.basedao.BaseDaoImpl;
import norlando.dao.UserDao;
import norlando.entity.User;

public class UserImpl extends BaseDaoImpl<User> implements UserDao<User> {



	@Override
	public boolean cheack(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
