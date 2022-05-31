package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PetRepository {

	public EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();

	// ACCESO A DATOS DE LA TABLA PET

	public void create(Pet pet) {

		manager.getTransaction().begin();
		manager.persist(pet);
		manager.getTransaction().commit();
	}

	public Pet read(int pk) {

		return manager.find(Pet.class, pk);
	}

	public void update(Pet pet) {

		manager.getTransaction().begin();
		manager.merge(pet);
		manager.getTransaction().commit();
	}

	public void delete(Pet pet) {

		manager.getTransaction().begin();
		manager.remove(pet);
		manager.getTransaction().commit();
	}

}
