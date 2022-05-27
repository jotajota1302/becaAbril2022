package edu.es.eoi.bizum.service;

import edu.es.eoi.bizum.entity.User;

public class UserServiceImpl implements UserService {

	
	@Override
	public boolean login(String username, String password) {

		return true;

	}

	@Override
	public boolean register(User newUser) {

		return true;

	}

	@Override
	public boolean exists(String telephone) {

		return true;

	}
	
}
