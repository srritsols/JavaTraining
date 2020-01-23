package com.spring.mvc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.User;

@Controller
public class UpdateController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/update/{userId}")
	public ModelAndView findUserById(ModelAndView model, @PathVariable("userId") int userId)
			throws IOException {

		List<User> listUser = userDao.findUserById(userId);
		model.addObject("listUser", listUser);
		model.setViewName("update");

		return model;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateUser(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email, @RequestParam("course") String course,
								   @RequestParam("number") String number, ModelAndView mv) {

		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setCourse(course);
		user.setNumber(number);

		int counter = userDao.update(user);

		if (counter > 0) {
			mv.addObject("msg", "User records updated against student id: " + user.getId());
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("update");

		return mv;
	}
}
