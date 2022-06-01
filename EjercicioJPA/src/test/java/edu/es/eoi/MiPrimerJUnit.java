package edu.es.eoi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiPrimerJUnit {

	@Test
	void testSuma() {		
		ClaseParaTest test= new ClaseParaTest();		
		assertEquals(7,test.suma(3,4));
		assertNotEquals(8,test.suma(3,4));
		
	}

	@Test
	void testDivide() {
		ClaseParaTest test= new ClaseParaTest();		
		assertEquals(1,test.divide(4,4));		
		
	}
	
	@Test
	void testSubString() {
		ClaseParaTest test= new ClaseParaTest();		
		assertEquals("SOME",test.subString("SOME TEXT",4));
	}

}
