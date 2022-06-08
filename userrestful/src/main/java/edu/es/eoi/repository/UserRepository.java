package edu.es.eoi.repository;

import edu.es.eoi.entity.User;

public interface UserRepository {

	User find(int id);

}