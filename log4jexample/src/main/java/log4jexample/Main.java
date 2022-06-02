package log4jexample;

import org.apache.log4j.Logger;

public class Main {
	
	public static Logger logger=Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		logger.debug("entro en la clase main");
		
		System.out.println("Hello world!");
	
		logger.debug("salgo de la clase main");

	}

}
