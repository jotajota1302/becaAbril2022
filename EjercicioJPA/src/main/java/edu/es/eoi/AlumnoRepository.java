package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AlumnoRepository {

	public EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();

	// ACCESO A DATOS DE LA TABLA ALUMNO

	public void create(Alumno alumno) {

		manager.getTransaction().begin();
		manager.persist(alumno);
		manager.getTransaction().commit();
	}

	public Alumno read(int pk) {

		return manager.find(Alumno.class, pk);
	}

	public void update(Alumno alumno) {

		manager.getTransaction().begin();
		manager.merge(alumno);
		manager.getTransaction().commit();
	}

	public void delete(Alumno alumno) {

		manager.getTransaction().begin();
		manager.remove(alumno);
		manager.getTransaction().commit();
	}

}
