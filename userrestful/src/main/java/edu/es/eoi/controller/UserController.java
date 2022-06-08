package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.User;
import edu.es.eoi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public User findUser(@PathVariable String id) {
		
		try {
			//valido que la id sea un int
			int pk=Integer.valueOf(id);
			return service.find(pk);
			
		} catch (Exception e) {
			System.out.println("id con formato incorrecto");
			return null;
		}		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void createUser(@RequestBody User user) {	
		
		if(user.getId()!=0) {
			System.out.println("usuario ya existente");	
		}else {
			System.out.println("guardo el user: " + user.getUsername());
		}
		
		
		
	}

}
