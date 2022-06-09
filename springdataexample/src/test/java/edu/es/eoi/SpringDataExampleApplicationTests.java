package edu.es.eoi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataExampleApplicationTests {

	@Autowired
	UserRepository repository;
	
	@Test
	void contextLoads() {
		
		//probar las funciones del repository para un CRUD
		System.out.println(repository.count());
		
	
		
		
	}

}
