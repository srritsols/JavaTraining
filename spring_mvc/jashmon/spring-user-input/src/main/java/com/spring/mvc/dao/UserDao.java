package com.spring.mvc.dao;

import java.util.List;

import com.spring.mvc.model.User;

public interface UserDao {

	public int create(User user);

	public List<User> read();

	public List<User> findUserById(int userID);

	public int update(User user);

	public int delete(int userId);

}
