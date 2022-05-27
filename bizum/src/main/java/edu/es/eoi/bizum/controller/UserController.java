package edu.es.eoi.bizum.controller;

import edu.es.eoi.bizum.entity.User;
import edu.es.eoi.bizum.service.UserService;
import edu.es.eoi.bizum.service.UserServiceImpl;

public class UserController {

	private UserService service= new UserServiceImpl();
	
	public User login(String username,String password) {
		
		return service.login(username, password);
	}
	
	public void register(User newUser) {
		
		service.register(newUser);
		
	}
	
}
