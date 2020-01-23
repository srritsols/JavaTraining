package com.spring.mvc.controller;

import java.io.IOException;

import com.spring.mvc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DeleteController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/delete/{userId}")
	public ModelAndView deleteUserById(ModelAndView mv, @PathVariable("userId") int userId)
			throws IOException {

		int counter = userDao.delete(userId);

		if (counter > 0) {
			mv.addObject("msg", "User records deleted against student id: " + userId);
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("delete");

		return mv;
	}

}
