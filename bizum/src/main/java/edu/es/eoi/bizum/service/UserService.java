package edu.es.eoi.bizum.service;

import edu.es.eoi.bizum.entity.User;

public interface UserService {

	User login(String username, String password);

	boolean register(User newUser);

	User exists(String telephone);

}