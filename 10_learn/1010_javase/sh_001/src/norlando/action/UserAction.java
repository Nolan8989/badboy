package norlando.action;

import java.util.List;

import norlando.dao.UserDao;
import norlando.po.User;

public class UserAction {
	
	private UserDao userDao = (UserDao) DaoFactory.getDao("UserDao");
	private User user;
	private List<User> list;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	

	
	
	
	public String add(){
		System.out.print(user.getName());
		userDao.add(user);
		return null;
	}

	
	
	public String findAll(){
		this.list = userDao.findAll();
		return "list";
	}
	
}
