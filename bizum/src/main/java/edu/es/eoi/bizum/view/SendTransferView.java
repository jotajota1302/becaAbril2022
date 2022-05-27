package edu.es.eoi.bizum.view;

import java.util.Scanner;

import edu.es.eoi.bizum.BizumApp;
import edu.es.eoi.bizum.controller.TransferController;

public class SendTransferView {
	
	static TransferController controller= new TransferController();
	
	public static void printSendMenu() {
		
		System.out.println("Introduce telefono destino: ");
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		String telephone = scan.next();			
		System.out.println("Introduce cantidad: ");
		scan= new Scanner(System.in);
		double amount = scan.nextDouble();	

		controller.send(BizumApp.loggedUser.getTelephone(),telephone, amount);
				
		
	}

}
