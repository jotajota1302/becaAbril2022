package edu.es.eoi.bizum.repository;

import edu.es.eoi.bizum.entity.User;

public interface UserRepository {

	boolean createUser(User user);

	User findUserByTelephone(String telephone);

	User login(String username, String password);

}