package edu.es.eoi;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Main {

	private static Logger logger=Logger.getLogger(Main.class);
	
	public static List<CrazyFighter> fighters= new ArrayList<CrazyFighter>();	
	
	public static void main(String[] args) {
	
		logger.debug("init app");
		
		createFighters();		
		
		CrazyFighter winner=fighters.get(0).fight(fighters.get(2));
		
		System.out.println("ha ganado " + winner.getName());
		
		logger.debug("end app");
		
	}

	private static void createFighters() {
				
		CrazyFighter crazyFighter1=new CrazyFighter("Cuervo Mortifero", 150, 18, 1);
		CrazyFighter crazyFighter2=new CrazyFighter("Cactus Surfero", 180, 13, 1);
		CrazyFighter crazyFighter3=new CrazyFighter("Baston Afilado", 160, 16, 1);
		
		fighters.add(crazyFighter1);
		fighters.add(crazyFighter2);
		fighters.add(crazyFighter3);
	}

}
