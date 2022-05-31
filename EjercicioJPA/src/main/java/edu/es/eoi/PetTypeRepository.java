package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PetTypeRepository {

	public EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();

	// ACCESO A DATOS DE LA TABLA PET

	public void create(PetType pettype) {

		manager.getTransaction().begin();
		manager.persist(pettype);
		manager.getTransaction().commit();
	}

	public PetType read(int pk) {

		return manager.find(PetType.class, pk);
	}

	public void update(PetType pettype) {

		manager.getTransaction().begin();
		manager.merge(pettype);
		manager.getTransaction().commit();
	}

	public void delete(PetType pettype) {

		manager.getTransaction().begin();
		manager.remove(pettype);
		manager.getTransaction().commit();
	}

}
