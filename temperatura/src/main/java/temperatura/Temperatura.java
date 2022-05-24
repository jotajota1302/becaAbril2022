package temperatura;

import converter.Converter;

public class Temperatura {
	
	
	public static void main(String[] args) {
		
		System.out.println("Voya convertir 100C a F");
		System.out.println(displayTemperatura(Unidad.CELSIUS, Unidad.FAHRENHEIT,100));
		
	}
	

	public static double displayTemperatura(Unidad from,Unidad to, double number) {
			
		if(from.equals(Unidad.CELSIUS)&&to.equals(Unidad.FAHRENHEIT)) {
			return Converter.toFahrenheitFromCelcius(number);
		}
		else if(from.equals(Unidad.FAHRENHEIT)&&to.equals(Unidad.CELSIUS)) {
			return Converter.toCelciusFromFahrenheit(number);
		}else {
			return 0;
		}
		
	}
	
}
