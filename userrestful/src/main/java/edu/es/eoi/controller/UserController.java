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
	public User find(@PathVariable String id) {
		
		try {		
			int pk=Integer.valueOf(id);
			return service.find(pk);
			
		} catch (Exception e) {
			System.out.println("id con formato incorrecto");
			return null;
		}		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody User user) {	
		
		if(user.getId()!=0) {
			System.out.println("usuario ya existente");	
		}else {
			service.create(user);
		}		
		
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {	
		
		User user=service.find(Integer.valueOf(id));
		
		service.delete(user);
		
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public void update(@PathVariable String id, @RequestBody User user) {	
		
		if(user.getId()!=Integer.valueOf(id)) {
			System.out.println("request incorrecta");
		}else {
			service.update(user);
		}
		
		
		
	}

	
	
}
