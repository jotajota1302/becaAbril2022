package edu.es.eoi.springbootmyfirstapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootmyfirstappApplicationTests {

	@Autowired
	public Alumno alumno;
	
	@Autowired
	public AlumnoService service;
	
	@Test
	void contextLoads() {
		
		System.out.println(alumno.getPerro().getRaza());
		
		service.doSomething();
	}

}
