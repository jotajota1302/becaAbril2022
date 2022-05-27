package edu.es.eoi.bizum.service;

import java.util.List;

import edu.es.eoi.bizum.entity.Transfer;
import edu.es.eoi.bizum.entity.User;
import edu.es.eoi.bizum.repository.TransferRepository;
import edu.es.eoi.bizum.repository.TransferRepositoryImpl;

public class TransferServiceImpl implements TransferService {
	
	private TransferRepository repository= new TransferRepositoryImpl();
	
	public boolean send(User from, User to,double amount) {

		Transfer transfer= new Transfer();
		transfer.setFrom(from);
		transfer.setTo(to);
		transfer.setAmount(amount);
		
		return repository.createTransfer(transfer);

	}
	
	public List<Transfer> findSendedByUser(User user) {

		return repository.findTransfersSendedByTelephone(user.getTelephone());

	}
	
	public  List<Transfer> findReceivedByUser(User user) {

		return repository.findTransfersReceivedByTelephone(user.getTelephone());

	}
}
