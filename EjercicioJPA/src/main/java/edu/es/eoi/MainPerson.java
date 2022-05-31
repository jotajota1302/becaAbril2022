package edu.es.eoi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MainPerson {

	public static void main(String[] args) {
		
		EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();
				
		Person person = new Person();
		person.setName("Pepito");
		
		Address address=new Address();
		address.setAddress("Calle la flor");
	
		person.setAddress(address);
		address.setPerson(person);
		
//		manager.getTransaction().begin();		
//		manager.persist(person);
//		manager.getTransaction().commit();
		
		Person p=manager.find(Person.class, 1);
		
		List<Article> lista=p.getArticles();
		
		for (Article article : lista) {
			
			System.out.println(article.getName());					
			
			System.out.println(article.getShops());
			
		}
		
	
	
	}

}
