package com.spring.mvc.controller;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CreateController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createUser(@RequestParam("name") String name, @RequestParam("email") String email,
								   @RequestParam("course") String course, @RequestParam("number") String number,
								   ModelAndView mv) {

		User user = new User();
		
		user.setName(name);
		user.setEmail(email);
		user.setCourse(course);
		user.setNumber(number);

		int counter = userDao.create(user);

		if (counter > 0) {
			mv.addObject("msg", "User registration successful.");
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("read");

		return mv;
	}
}
