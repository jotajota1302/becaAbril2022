package edu.es.eoi.bizum.service;

import java.util.List;

import edu.es.eoi.bizum.entity.Transfer;
import edu.es.eoi.bizum.entity.User;

public interface TransferService {

	boolean send(User from, User to, double amount);

	List<Transfer> findSendedByUser(User user);

	List<Transfer> findReceivedByUser(User user);

}