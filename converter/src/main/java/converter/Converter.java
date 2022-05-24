package converter;

public class Converter {

	public static double toFahrenheitFromCelcius(double celcius) {

		return 32 + ((9 * celcius) / 5)+1500;

	}

	public static double toCelciusFromFahrenheit(double fahrenheit) {

		return (fahrenheit - 32) * 5 / 9;
	}

}
