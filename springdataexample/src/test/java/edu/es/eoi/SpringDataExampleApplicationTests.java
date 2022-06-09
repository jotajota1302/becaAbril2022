package edu.es.eoi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataExampleApplicationTests {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AnimalRepository animalRepo;
	
	@Test
	void contextLoads() {
	
		User user= new User();
		user.setUsername("Test");
		user.setPassword("pw");
		user.setMail("mail");
		
		userRepo.save(user);		
		
		Animal animal= new Animal();
		animal.setNombre("PEPE");
		animal.setRaza("LORO");
		
		animalRepo.save(animal);
		
		user.setAnimal(animal);
		
		userRepo.save(user);		
		
		userRepo.deleteAll();		
	
	}

}
