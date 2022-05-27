package edu.es.eoi.bizum.service;

import edu.es.eoi.bizum.entity.User;
import edu.es.eoi.bizum.repository.UserRepository;
import edu.es.eoi.bizum.repository.UserRepositoryJsonImpl;

public class UserServiceImpl implements UserService {

	private UserRepository repository = new UserRepositoryJsonImpl();

	//REQ. 1
	public User login(String username, String password) {

		return repository.login(username, password);

	}


	//REQ. 1.2
	public boolean register(User newUser) {

		return repository.createUser(newUser);

	}

	//REQ. 1.3
	public User exists(String telephone) {

		return repository.findUserByTelephone(telephone);

	}

}
