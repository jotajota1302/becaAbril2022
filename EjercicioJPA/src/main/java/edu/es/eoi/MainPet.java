package edu.es.eoi;

import java.sql.Date;
import java.util.Calendar;

public class MainPet {
	
	public static void main(String[] args) {
		
		PetRepository repository= new PetRepository();
		
		//guardar un pet
		
		Pet pet=new Pet();
		pet.setName("Thor");
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.DAY_OF_MONTH, 3);			
		
		pet.setBirthDate(new Date(calendar.getTimeInMillis()));
		
		repository.create(pet);
	
		Pet mascota= repository.read(2);
		
		System.out.println(mascota.getType().getName());
	}

}
