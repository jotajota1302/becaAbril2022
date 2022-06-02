package edu.es.eoi.bizum.service;

import edu.es.eoi.bizum.entity.User;

public interface UserService extends LoginInterface {

	boolean register(User newUser);

	User exists(String telephone);

}