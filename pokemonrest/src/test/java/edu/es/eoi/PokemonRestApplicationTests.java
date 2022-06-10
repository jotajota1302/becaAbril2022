package edu.es.eoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PokemonRestApplicationTests {

	@Autowired
	PokemonRepository repository;
	
	@Test
	void contextLoads() {
		
		Assertions.assertEquals(151,repository.count());
		
//		repository.findAll().forEach(p->System.out.println(p.getName()));
		
	  
	}

}
