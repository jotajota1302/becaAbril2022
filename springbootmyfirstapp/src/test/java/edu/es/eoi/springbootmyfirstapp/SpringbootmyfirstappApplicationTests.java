package edu.es.eoi.springbootmyfirstapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.springbootmyfirstapp.controller.AlumnoController;
import edu.es.eoi.springbootmyfirstapp.repository.AlumnoRepositoryJDBCImpl;

@SpringBootTest
class SpringbootmyfirstappApplicationTests {

	@Autowired
	AlumnoController controller;
	@Test
	void contextLoads() {		
	
		controller.callService("4");
		
		AlumnoRepositoryJDBCImpl repo= new AlumnoRepositoryJDBCImpl();
		repo.findSomething(6);
	
	}

}
