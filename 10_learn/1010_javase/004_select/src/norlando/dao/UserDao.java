package norlando.dao;

import java.util.List;

import norlando.base.BaseDao;
import norlando.entity.User;

public interface UserDao extends BaseDao<User> {

	public  List findUsernameByKeyWord(String keyword);

	public List findUserByKeyWord(String username,int star,int step);
}
