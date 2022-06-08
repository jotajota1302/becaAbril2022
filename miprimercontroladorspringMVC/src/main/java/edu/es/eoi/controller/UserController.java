package edu.es.eoi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.domain.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public List<User> findAll(){
		
		List<User> users= new ArrayList<User>();
		
		for (int i = 0; i <10; i++) {
			User user= new User();
				user.setMail("mail".concat(String.valueOf(i)).concat("@mail.com"));
				users.add(user);
		}
		
		return users;
		
	}

}
