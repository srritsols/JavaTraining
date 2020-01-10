package com.spring.mvc.dao;

import com.spring.mvc.model.User;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public int create(User user) {
        return 0;
    }

    @Override
    public List<User> read() {
        return null;
    }

    @Override
    public List<User> findStudentById(int userId) {
        return null;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(int userId) {
        return 0;
    }
}
