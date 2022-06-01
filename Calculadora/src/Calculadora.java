import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		final int SUMA = 1;
		final int RESTA = 2;
		final int MULTIPLICACION = 3;
		final int DIVISION = 4;
		final int VALOR_ABSOLUTO = 5;
		final int MOSTRAR_PI = 6;

		System.out.println("CALCULADORA \n 1-Sumar \n 2-Restar \n"
				+ " 3-Multiplicar \n 4-Dividir \n 5- Valor Absoluto \n" + " 6-Mostrar PI \n Elige una opcion:");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int operacion = teclado.nextInt();
		
		if (operacion > 0 && operacion < 5) {
			System.out.println("Escriba el primer numero");
			int n1 = teclado.nextInt();
			System.out.println("Escriba el segundo numero");
			int n2 = teclado.nextInt();
			switch (operacion) {
			case SUMA:
				suma(n1, n2);
				main(args);
				break;
			case RESTA:
				resta(n1, n2);
				main(args);
				break;
			case MULTIPLICACION:
				multi(n1, n2);
				main(args);
				break;
			case DIVISION:
				divi(n1, n2);
				main(args);
				break;
			}
		} else if (operacion == VALOR_ABSOLUTO) {
			System.out.println("Escriba un numero");
			double absoluto = teclado.nextDouble();
			System.out.println("El valor absoluto de " + absoluto + " es: " + Math.abs(absoluto));
			main(args);
		} else if (operacion == MOSTRAR_PI) {
			System.out.println(Math.PI);
			main(args);
		} else if (operacion>=7){
			System.out.println("Goodbye");	
		}
		
		
	}
	
	public static int suma(int numero1, int numero2) {
		int suma = numero1 + numero2;
		System.out.println(numero1 + " + " + numero2 + " = " + suma);
		return suma;
	}

	public static int resta(int numero1, int numero2) {
		int resta = numero1 - numero2;
		System.out.println(numero1 + " - " + numero2 + " = " + resta);
		return resta;
	}

	public static int multi(int numero1, int numero2) {
		int multi = numero1 * numero2;
		System.out.println(numero1 + " * " + numero2 + " = " + multi);
		return multi;
	}

	public static double divi(int numero1, int numero2) {
		int divi = numero1 / numero2;
		System.out.println(numero1 + " / " + numero2 + " = " + divi);
		return divi;
	}

}
