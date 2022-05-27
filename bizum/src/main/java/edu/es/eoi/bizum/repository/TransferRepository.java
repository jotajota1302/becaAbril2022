package edu.es.eoi.bizum.repository;

import java.util.List;

import edu.es.eoi.bizum.entity.Transfer;

public interface TransferRepository {

	boolean createTransfer(Transfer transfer);

	List<Transfer> findTransfersSendedByTelephone(String telephone);

	List<Transfer> findTransfersReceivedByTelephone(String telephone);

}