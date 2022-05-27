package edu.es.eoi.bizum.view;

import java.util.List;
import java.util.Scanner;

import edu.es.eoi.bizum.BizumApp;
import edu.es.eoi.bizum.controller.TransferController;
import edu.es.eoi.bizum.entity.Transfer;

public class TransferMenu {
	
	static TransferController controller= new TransferController();

	public static void printMenu() {

		System.out.println("Bienvenido a tu zona personal " + BizumApp.loggedUser.getName() + ", que quieres hacer?");
		System.out.println("1-Enviar dinero");
		System.out.println("2-Ver transferencias recibidas");
		System.out.println("3-Ver transferencias enviadas");
		System.out.println("4-Logout");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();

		if (opcion == 0 || opcion > 4) {
			System.out.println("opcion incorrecta");
			printMenu();
		} else {

			switch (opcion) {
			case 1:
					SendTransferView.printSendMenu();
					printMenu();
				break;
			case 2:
					List<Transfer> received= controller.findReceivedByUser(BizumApp.loggedUser);
					TransfersListView.printReceived(received);
					printMenu();
				break;
			case 3:
				List<Transfer> sended= controller.findSendedByUser(BizumApp.loggedUser);
				TransfersListView.printSended(sended);
				printMenu();
			case 4:
				BizumApp.loggedUser=null;
				MainMenu.printMenu();
			default:
				break;
			}

		}
		
	}

}
