package com.spring.mvc.dao;

import java.util.List;

public interface UserDao {

    public int create(User user);

    public List<User> read();

    public List<User> findStudentById(int userId);

    public int update(User user);

    public int delete(int userId);

}
