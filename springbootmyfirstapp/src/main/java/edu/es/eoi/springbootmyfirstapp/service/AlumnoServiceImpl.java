package edu.es.eoi.springbootmyfirstapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.es.eoi.springbootmyfirstapp.repository.AlumnoRepository;

@Component
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	public AlumnoRepository repository;	
	
	public void findAlumno(String pk) {
		
		//logica negocio
		
		System.out.println("voy a buscar desde el servicio al alumno: " + pk);
		
		repository.findSomething(Integer.valueOf(pk));
		
	}
}
