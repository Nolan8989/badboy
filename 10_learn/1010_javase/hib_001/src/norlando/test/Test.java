package norlando.test;

import norlando.po.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure();
		
		SessionFactory factory =conf.buildSessionFactory(); 
		
		Session session = factory.openSession();
		//默认autoCommit=false    在hibernate 的写操作中， 需要显式 事务边界定义。
		
		User user = new User();
		user.setName("hibernate");
		user.setPhone("110");
		
		
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
	}
}
