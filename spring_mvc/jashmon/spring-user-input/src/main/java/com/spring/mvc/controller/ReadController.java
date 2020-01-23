package com.spring.mvc.controller;

import java.io.IOException;
import java.util.List;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ReadController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/read")
	public ModelAndView readUser(ModelAndView model) throws IOException {

		List<User> listUser = userDao.read();
		
		model.addObject("listUser", listUser);
		model.setViewName("read");

		return model;
	}
}
