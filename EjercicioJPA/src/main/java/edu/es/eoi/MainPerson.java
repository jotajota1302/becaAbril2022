package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MainPerson {

	public static void main(String[] args) {
		
		EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();
		
		Person p=manager.find(Person.class,1);		
		
		System.out.println(p.getAddress().getAddress());
	
	}

}
