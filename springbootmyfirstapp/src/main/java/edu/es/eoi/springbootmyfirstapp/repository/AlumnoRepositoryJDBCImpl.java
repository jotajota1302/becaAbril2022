package edu.es.eoi.springbootmyfirstapp.repository;

public class AlumnoRepositoryJDBCImpl implements AlumnoRepository {
	
	public void findSomething(int pk) {
		
		System.out.println("estoy buscando el alumno con el id " + pk +" con JDBC");
		
		//logica de buscar con una select el alumno
		
	}

}
