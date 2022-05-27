package edu.es.eoi.bizum.controller;

import java.util.List;

import edu.es.eoi.bizum.entity.Transfer;
import edu.es.eoi.bizum.entity.User;
import edu.es.eoi.bizum.service.TransferService;
import edu.es.eoi.bizum.service.TransferServiceImpl;
import edu.es.eoi.bizum.service.UserService;
import edu.es.eoi.bizum.service.UserServiceImpl;

public class TransferController {
	
	private TransferService transferService= new TransferServiceImpl();
	
	private UserService userService= new UserServiceImpl();
	
	public void send(String telephoneFrom,String telephoneTo,double amount) {
		
		User from=userService.exists(telephoneFrom);
		User to=userService.exists(telephoneTo);		
		
		if(to!=null) {
			transferService.send(from, to, amount);
		}
		else{
			System.out.println("el telefono no pertenece a ningun usuario registrado ");
		}
		
	}
	
	public List<Transfer> findSendedByUser(User user){
		
		return transferService.findSendedByUser(user);
	}
	
	public List<Transfer> findReceivedByUser(User user){
		
		return transferService.findReceivedByUser(user);
	}

}
