package edu.es.eoi.springbootmyfirstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.es.eoi.springbootmyfirstapp.service.AlumnoService;

@Component
public class AlumnoController {

	@Autowired
	public AlumnoService service;
	
	public void callService(String alumnoId) {
		
		System.out.println("llamo al servicio desde mi controlador con alumnoid: " + alumnoId);
		 
		service.findAlumno(alumnoId);
		
	}
	
}
