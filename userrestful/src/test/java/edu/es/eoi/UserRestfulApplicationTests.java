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
					
		User tmp=new User();
		tmp.setUsername("test");
		tmp.setMail("mailtest");
		tmp.setPassword("pwtest");
		
		repository.create(tmp);
		
		User user=repository.find(tmp.getId());			
		Assertions.assertEquals("test",user.getUsername());
		
		user.setMail("updated");
		repository.update(user);
		
		Assertions.assertEquals("updated",repository.find(user.getId()).getMail());
				
		repository.delete(user);		
		Assertions.assertNull(repository.find(tmp.getId()));			
		
	}

}
