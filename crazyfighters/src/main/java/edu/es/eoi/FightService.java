package edu.es.eoi;

import org.apache.log4j.Logger;

public class FightService {

	public  int ATTACK_PLUS_MAX = 8;
	
	private static Logger logger=Logger.getLogger(FightService.class);
	
	public AbstractFighter fight(AbstractFighter fighterOne, AbstractFighter fighterTwo) {

		logger.debug("init fight");

		int vitalityOne = fighterOne.getVitality();
		int vitalityTwo = fighterTwo.getVitality();

		logger.debug(fighterOne.getName()+" : " + vitalityOne);
		logger.debug(fighterTwo.getName()+" : " + vitalityTwo);

		while (vitalityOne > 0 || vitalityTwo > 0) {

			int randomNumber1 = getRandomPlusAttack();
			
			logger.debug("attackplus: " + randomNumber1);

			logger.debug(fighterOne.getName() + "attacks:  " + fighterTwo.getName());

			vitalityTwo = vitalityTwo - (fighterOne.getAttack() + randomNumber1);

			logger.debug("vitalityTwo " + vitalityTwo);
			
			if (vitalityTwo <= 0) {
				break;
			}

			int randomNumber2 = getRandomPlusAttack();

			vitalityOne = vitalityOne - (fighterTwo.getAttack() - randomNumber2);
			
			logger.debug("vitalityOne " + vitalityOne);
			
		}

		if (vitalityOne >= 0) {
			return fighterOne;
		} else {
			return fighterTwo;
		}

	}

	private Integer getRandomPlusAttack() {
		
		return Integer.valueOf(String.valueOf(Math.round(Math.random() * ATTACK_PLUS_MAX)));
		
	}

}
