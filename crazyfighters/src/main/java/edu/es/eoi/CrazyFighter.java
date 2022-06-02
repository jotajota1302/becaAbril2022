package edu.es.eoi;

import org.apache.log4j.Logger;

public class CrazyFighter {
	
	private static Logger logger=Logger.getLogger(CrazyFighter.class);
	
	private String name;
	
	private int vitality;
	
	private int attack;
	
	private int level;	
	
	
	public CrazyFighter fight(CrazyFighter opponent) {
		
		logger.debug("init fight");
		
		int myVitality=this.vitality;
		int vitalityOpponent=opponent.getVitality();
		
		logger.debug("vitality: " + myVitality);
		logger.debug("opponentVitality: " + vitalityOpponent);
		
		while(myVitality>0||vitalityOpponent>0) {
			
			int randomNumber1=Integer.valueOf(Math.round(Math.random()*5)+"");
			logger.debug("attackplus: " + randomNumber1);
			
			logger.debug(this.getName()+ "attacks:  "+ opponent.getName());
			
			vitalityOpponent=vitalityOpponent-(this.attack+randomNumber1);		
				
			if(vitalityOpponent<0) {
				break;
			}
			
			int randomNumber2=Integer.valueOf(Math.round(Math.random()*5)+"");
			
			myVitality=myVitality-opponent.getAttack()-randomNumber2;
			
		}
		
		if(myVitality>=0) {
			return this;
		}else {
			return opponent;
		}
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}


	public CrazyFighter(String name, int vitality, int attack, int level) {
		super();
		this.name = name;
		this.vitality = vitality;
		this.attack = attack;
		this.level = level;
	}


	public CrazyFighter() {
		super();
	}
	
	
	

}
