package edu.es.eoi;

public class CrazyFighter extends AbstractFighter {

	protected String name;
	protected int vitality;
	protected int attack;
	protected int level;
	
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
	

}
