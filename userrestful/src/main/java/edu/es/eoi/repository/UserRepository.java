package edu.es.eoi.repository;

import edu.es.eoi.entity.User;

public interface UserRepository {

	User find(int id);
	
	public User create(User user);
	
	public User update(User user);
	
	public void delete(User user);

}