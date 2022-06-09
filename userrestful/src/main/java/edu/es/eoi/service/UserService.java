package edu.es.eoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User find(int id) {
		
		return repository.find(id);
	}
	
	public User create(User user) {		
		
		return repository.create(user);
	}
	
	public User update(User user) {	
		
		return repository.update(user);
	}
	
	public void delete(User user) {
		
		repository.delete(user);	
		
	}	

}
