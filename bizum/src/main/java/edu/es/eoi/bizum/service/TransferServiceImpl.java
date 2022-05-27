package edu.es.eoi.bizum.service;

import java.util.List;

import edu.es.eoi.bizum.entity.Transfer;
import edu.es.eoi.bizum.entity.User;

public class TransferServiceImpl implements TransferService {
	
	public boolean send(User from, User to,double amount) {

		return true;

	}
	
	public List<Transfer> findSendedByUser(User user) {

		return null;

	}
	
	public  List<Transfer> findReceivedByUser(User user) {

		return null;

	}
}
