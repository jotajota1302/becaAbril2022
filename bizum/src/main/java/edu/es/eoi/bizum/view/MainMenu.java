package edu.es.eoi.bizum.view;

import java.util.Scanner;

import edu.es.eoi.bizum.BizumApp;

public class MainMenu {

	public static void printMenu() {

		if (BizumApp.loggedUser != null) {
			TransferMenu.printMenu();
		} else {
			System.out.println("Bienvenido a Bizum, seleccione una opción: ");
			System.out.println("1-Login: ");
			System.out.println("2-Nuevo Usuario: ");
			System.out.println("3-Salir: ");

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int opcion = scan.nextInt();

			if (opcion == 0 || opcion > 3) {
				System.out.println("opcion incorrecta");
				printMenu();
			} else {

				switch (opcion) {
				case 1:
					LoginMenu.printMenu();
					break;
				case 2:
					RegisterMenu.printMenu();
					break;
				case 3:
					System.out.println("Muchas gracias, hasta luego!!");
					System.exit(1);
				default:
					break;
				}

			}
		}

	}

}
