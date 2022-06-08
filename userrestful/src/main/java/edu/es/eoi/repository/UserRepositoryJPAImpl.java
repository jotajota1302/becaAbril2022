package edu.es.eoi.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.User;

@Repository
public class UserRepositoryJPAImpl implements UserRepository {
	
	@Autowired
	EntityManager manager;
		
	@Override
	public User find(int id) {
		
		return manager.find(User.class,id);
		
	}

}
