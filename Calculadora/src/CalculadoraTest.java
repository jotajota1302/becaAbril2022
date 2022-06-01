import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testMain() {
		Calculadora calculadora=new Calculadora();
		assertNotNull(calculadora);
		Calculadora.main(null);	
	}

	@Test
	void testSuma() {		
		assertEquals(6,Calculadora.suma(2,4));		
	}

	@Test
	void testResta() {
		assertEquals(2,Calculadora.resta(4,2));	
	}

	@Test
	void testMulti() {
		assertEquals(8,Calculadora.multi(2,4));		
	}

	@Test
	void testDivi() {
		assertEquals(2,Calculadora.divi(4,2));		
	}

}
