package edu.es.eoi.bizum.service;

import edu.es.eoi.bizum.entity.User;

public interface LoginInterface {

	User login(String username, String password);

}