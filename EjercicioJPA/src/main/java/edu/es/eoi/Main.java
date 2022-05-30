package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("EjemploJPA_PU");
		
		EntityManager manager=emf.createEntityManager();
		
		Alumno a=manager.find(Alumno.class,1);
		
		System.out.println(a.getDni());
		
		
	}

}
