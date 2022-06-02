package edu.es.eoi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FightServiceTest {

	@Test
	void test() {
		
		AbstractFighter crazyFighter1=new CrazyFighter("Cuervo Mortifero", 150, 100, 1);
		AbstractFighter crazyFighter2=new CrazyFighter("Cactus Surfero", 100, 15, 1);
		
		FightService service=new FightService();
		service.ATTACK_PLUS_MAX=0;		
		
		AbstractFighter winner1=service.fight(crazyFighter1, crazyFighter2);
		
		assertEquals(crazyFighter1, winner1);
		
		AbstractFighter winner2=service.fight(crazyFighter2, crazyFighter1);
		
		assertEquals(crazyFighter1, winner2);
	}

}
