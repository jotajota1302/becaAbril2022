package edu.es.eoi;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MainPet {

	public static EntityManager manager=Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();	
	
	public static void main(String[] args) {
		
		//guardar un pet
		
		Pet pet=new Pet();
		pet.setName("Thor");
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.DAY_OF_MONTH, 3);			
		
		pet.setBirthDate(new Date(calendar.getTimeInMillis()));
		
		manager.getTransaction().begin();
//		manager.persist(pet);
		manager.getTransaction().commit();		
	
		Pet mascota= manager.find(Pet.class, 2);
		
		System.out.println(mascota.getType().getName());
	}

}
