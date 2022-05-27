package edu.es.eoi.bizum;

import edu.es.eoi.bizum.entity.User;
import edu.es.eoi.bizum.repository.UserRepositoryJsonImpl;

public class BizumApp {

	public static void main(String[] args) {
		
		User user= new User();
		user.setName("JJ");
		user.setMail("jotajota@gmail.com");
		user.setPassword("password");
		user.setTelephone("12345678");
				
		UserRepositoryJsonImpl repo=new UserRepositoryJsonImpl();
		
		repo.createUser(user);		
		
	}

}
