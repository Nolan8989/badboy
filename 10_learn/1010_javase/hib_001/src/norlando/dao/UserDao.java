package norlando.dao;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import norlando.po.User;
import norlando.util.HibUtil;


public class UserDao {
	
	
	public void add(User user){
		Session session = HibUtil.getSession();
		
		session.beginTransaction();
		
		
		session.save(user);
		
		
		session.close();
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	public void del(User user){
		Session session = HibUtil.getSession();
		
		session.beginTransaction();
		
		
		session.delete(user);
		
		
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	public void update(User user){
		Session session = HibUtil.getSession();
		
		session.beginTransaction();
		
		
		session.update(user);
		
		
		session.getTransaction().commit();
		session.close();
	}
	
	
	public User findeById(Integer id){
		Session session = HibUtil.getSession();
		User user = (User)session.get(User.class, id);
		
		
		session.close();
		
		
		return user;
	}
	
	
	
	public List<User> findAll(){
		Session session = HibUtil.getSession();
		
		
		String hql = "from User";
		Query query = session.createQuery(hql);
		
		
		List<User> list = query.list();
		session.close();
		return list;
	}
	
	
	
	public static void main(String[] args) {
		UserDao dao = new UserDao();
//		List<User> list=dao.findAll();
		
		
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			User user = (User) iterator.next();
//			System.out.println(user.getName());
//		}
		
		
		User user = dao.findeById(1);
		System.out.println(user.getName() + "======1");
		user.setName("struts2");
		dao.update(user);
		User user2 = dao.findeById(1);
		System.out.println(user2.getName() + "=======2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
