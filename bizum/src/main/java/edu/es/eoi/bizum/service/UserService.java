package edu.es.eoi.bizum.service;

import edu.es.eoi.bizum.entity.User;

public interface UserService {

	boolean login(String username, String password);

	boolean register(User newUser);

	boolean exists(String telephone);

}