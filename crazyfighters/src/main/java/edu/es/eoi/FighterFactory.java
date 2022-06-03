package edu.es.eoi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FighterFactory {
	
	public static EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();
	
	@SuppressWarnings("unchecked")
	public static List<AbstractFighter> getFighters() {
		
		List<AbstractFighter> fighters=new ArrayList<AbstractFighter>();
		
		CrazyFighter crazyFighter1=new CrazyFighter("Cuervo Mortifero", 150, 18, 1);
		CrazyFighter crazyFighter2=new CrazyFighter("Cactus Surfero", 180, 13, 1);
		CrazyFighter crazyFighter3=new CrazyFighter("Baston Afilado", 160, 16, 1);
		Pokemon pokemon= new Pokemon();
		pokemon.setName("pickachu");
		pokemon.setLevel(1);
		pokemon.setVitality(100);
		pokemon.setAttack(25);
		
		fighters.add(crazyFighter1);
		fighters.add(crazyFighter2);
		fighters.add(crazyFighter3);
		fighters.add(pokemon);		
		
		fighters.addAll(manager.createQuery("FROM CrazyFighterEntity").getResultList());		
		
		return fighters;
		
	}

}
