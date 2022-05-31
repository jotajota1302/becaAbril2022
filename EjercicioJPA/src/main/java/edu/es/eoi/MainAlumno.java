package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class MainAlumno {
	
	public static EntityManager manager=Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();	

	public static void main(String[] args) {

		//crear un alumno		
		Alumno alumno1= new Alumno();
		alumno1.setName("JJ");
		alumno1.setNif("67423468B");
		
		manager.getTransaction().begin();		
//		manager.persist(alumno1);		
		manager.getTransaction().commit();
		
		//read alumno		
		Alumno result = manager.find(Alumno.class, 6);
		System.out.println(result.getName());
		
		//como modifico un registro		
		Alumno toUpdate=manager.find(Alumno.class, 6);
		toUpdate.setAge(30);
		
		manager.getTransaction().begin();		
		manager.merge(toUpdate);
		manager.getTransaction().commit();		
		
		//delete un registro		
		Alumno toDelete=manager.find(Alumno.class, 14);
		
		manager.getTransaction().begin();		
		manager.remove(toDelete);
		manager.getTransaction().commit();		
		
		
	}

}
