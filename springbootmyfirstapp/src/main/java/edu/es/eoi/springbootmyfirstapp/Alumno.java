package edu.es.eoi.springbootmyfirstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Alumno {

	private String nombre;
	
	@Autowired
	private Perro perro;	
	
}
