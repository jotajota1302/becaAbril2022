package edu.es.eoi;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class CrazyFighterApp {

	private static Logger logger=Logger.getLogger(CrazyFighterApp.class);
	
	public static List<AbstractFighter> fighters= new ArrayList<AbstractFighter>();	
	
	public static FightService service=new FightService();
	
	public static void main(String[] args) {
	
		logger.debug("init app");
		
		fighters=FighterFactory.getFighters();		
		
		AbstractFighter winner=service.fight(fighters.get(0), fighters.get(3));
		
		System.out.println("ha ganado " + winner.getName());
		
		logger.debug("end app");
		
	}


}
