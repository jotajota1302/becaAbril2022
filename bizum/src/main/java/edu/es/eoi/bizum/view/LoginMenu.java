package edu.es.eoi.bizum.view;

import java.util.Scanner;

import edu.es.eoi.bizum.BizumApp;
import edu.es.eoi.bizum.controller.UserController;
import edu.es.eoi.bizum.entity.User;

public class LoginMenu {

	static UserController controller= new UserController();
	static int intentos=3;
	
	public static void printMenu() {
		
		System.out.println("Introduzca su nombre de usuario: ");
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		String username=scan.next();
		
		System.out.println("Introduzca su password: ");
		scan=new Scanner(System.in);
		String password=scan.next();

		User user=controller.login(username, password);
		
		if(user!=null) {
			BizumApp.loggedUser=user;
			TransferMenu.printMenu();
		}else {
			System.out.println("Alguno de los datos introducidos es incorrecto");
			System.out.println("Te quedan " + intentos +" intentos");
			intentos=intentos-1;
			if(intentos==0) {
				System.out.println("Por seguridad volvemos al menu principal");
				intentos=3;
				MainMenu.printMenu();
			}
			printMenu();
		}
		
	}

}
