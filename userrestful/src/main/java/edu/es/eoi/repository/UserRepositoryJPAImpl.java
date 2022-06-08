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
	
	public User create(User user) {
		
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		return user;
	}
	
	public User update(User user) {
		
		manager.getTransaction().begin();
		manager.merge(user);
		manager.getTransaction().commit();
		
		return user;
	}
	
	public void delete(User user) {
		
		manager.getTransaction().begin();
		manager.remove(user);
		manager.getTransaction().commit();
		
	}

}
