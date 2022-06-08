package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestfulApplication.class, args);
	}

	@Bean
	EntityManager getEntityManager() {
		
		return Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();
	}
	
}
