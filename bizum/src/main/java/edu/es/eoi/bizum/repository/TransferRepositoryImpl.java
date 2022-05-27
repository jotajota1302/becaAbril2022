package edu.es.eoi.bizum.repository;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import edu.es.eoi.bizum.entity.Transfer;
import edu.es.eoi.bizum.json.TransferJson;

public class TransferRepositoryImpl implements TransferRepository {
		
	public boolean createTransfer(Transfer transfer) {

		try {

			Reader reader = new FileReader(new File("src/main/resources/transfers.json"));

			List<TransferJson> transfersJson = new Gson().fromJson(reader, new TypeToken<List<TransferJson>>() {}.getType());

			if (transfersJson == null) {
				transfersJson = new ArrayList<TransferJson>();
			}
			
			TransferJson json = new TransferJson();
			transfer.setTransferDate(LocalDateTime.now());
			json.setDate(transfer.getTransferDate().toString());
			json.setTransfer(transfer);

			transfersJson.add(json);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			FileWriter writter = new FileWriter(new File("src/main/resources/transfers.json"), false);
			gson.toJson(transfersJson, writter);

			writter.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	public List<Transfer> findTransfersSendedByTelephone(String telephone) {

		List<Transfer> list= new ArrayList<Transfer>();
		
		try {

			Reader reader = new FileReader(new File("src/main/resources/transfers.json"));

			List<TransferJson> transfersJson = new Gson().fromJson(reader, new TypeToken<List<TransferJson>>() {}.getType());

			for (TransferJson transferJson : transfersJson) {
				if(transferJson.getTransfer().getFrom().getTelephone().equals(telephone)) {
					transferJson.getTransfer().setDate(transferJson.getDate());
					list.add(transferJson.getTransfer());
				}
			}


		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return list;
	}
	
	
	public List<Transfer> findTransfersReceivedByTelephone(String telephone) {

		List<Transfer> list= new ArrayList<Transfer>();
		
		try {

			Reader reader = new FileReader(new File("src/main/resources/transfers.json"));

			List<TransferJson> transfersJson = new Gson().fromJson(reader, new TypeToken<List<TransferJson>>() {}.getType());

			for (TransferJson transferJson : transfersJson) {
				if(transferJson.getTransfer().getTo().getTelephone().equals(telephone)) {
					transferJson.getTransfer().setDate(transferJson.getDate());
					list.add(transferJson.getTransfer());
				}
			}


		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return list;
	}


}
