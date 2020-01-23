package com.spring.mvc.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import com.spring.mvc.model.User;


public class UserDAOImpl implements UserDao{
	private static final Logger logger = Logger.getLogger(UserDAOImpl.class.getName());

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
		
	} 
	
	public void create(User p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("User saved successfully, User Details="+p);
	
	}

	public void read(User p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("User updated successfully, Person Details="+p);
	}
@SuppressWarnings("unchecked")
	public List<User> listUser() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		for(User p : userList){
			logger.info("User List::"+p);
		}
		return userList;
	}

	public User update(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		User p = (User) session.load(User.class, new Integer(id));
		logger.info("User loaded successfully, User details="+p);
		return p;
	}

	public void delete(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User p = (User) session.load(User.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("User deleted successfully, User details="+p);
	}

	public List<User> read() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findStudentById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
