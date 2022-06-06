package edu.es.eoi.springbootmyfirstapp.repository;

import org.springframework.stereotype.Component;

@Component
public class AlumnoRepositoryJPAmpl implements AlumnoRepository {
	
	public void findSomething(int pk) {
		
		System.out.println("estoy buscando el alumno con el id " + pk +" con JPA");
		
		//logica de buscar con el entitymanager
		
	}

}
