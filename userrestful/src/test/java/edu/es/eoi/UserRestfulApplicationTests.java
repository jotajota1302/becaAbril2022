package edu.es.eoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

@SpringBootTest
class UserRestfulApplicationTests {

	@Autowired
	private UserRepository repository;
		
	@Test
	void testUserRepository() {
		
//		UserRepository repository= new UserRepositoryJPAImpl();
		
		User user=repository.find(1);
		
		Assertions.assertEquals("JJ",user.getUsername());
		
	}

}
