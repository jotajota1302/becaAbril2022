package edu.es.eoi.bizum.view;

import java.util.List;

import edu.es.eoi.bizum.entity.Transfer;

public class TransfersListView {
	
	static void printSended(List<Transfer> sended) {
		
		for (Transfer transfer : sended) {
			System.out.println(transfer.getAmount()+"€, PARA:"+ transfer.getTo().getTelephone()+" FECHA:" + transfer.getDate());
		}	
	}
	
	static void printReceived(List<Transfer> received) {
		
		for (Transfer transfer : received) {
			System.out.println(transfer.getAmount()+"€, DE: "+ transfer.getTo().getTelephone()+", FECHA: " + transfer.getDate());
		}
		
		
	}

}
