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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
