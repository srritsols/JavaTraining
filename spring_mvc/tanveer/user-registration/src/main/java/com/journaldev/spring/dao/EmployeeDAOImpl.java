package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addEmployee(Employee p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Employee saved successfully, Employee Details="+p);
	}

	@Override//------------------1=1==11==1=1=1
	public void updateEmployee(Employee p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Employee updated successfully, Employee Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployees() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> employeesList = session.createQuery("from Employee").list();
		for(Employee p : employeesList){
			logger.info("Employee List::"+p);
		}
		return employeesList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Employee p = (Employee) session.load(Employee.class, new Integer(id));
		logger.info("Employee loaded successfully, Employee details="+p);
		return p;
	}

	@Override
	public void removeEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee p = (Employee) session.load(Employee.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Employee deleted successfully, Employee details="+p);
	}

}
