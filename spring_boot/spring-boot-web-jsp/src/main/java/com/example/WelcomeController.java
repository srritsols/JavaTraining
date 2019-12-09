package com.example;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
 
	private String message = "Hello World";

	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {

		User user = new User();
		user.setFirstName("Arun"); user.setLastName("V");
		userRepository.save(user);
 		System.out.println("User Saved: " + user.getId());
		model.put("message", this.message);
		return "welcome ";
	}

}