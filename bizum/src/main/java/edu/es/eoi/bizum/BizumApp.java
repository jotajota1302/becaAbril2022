package edu.es.eoi.bizum;

import edu.es.eoi.bizum.entity.User;
import edu.es.eoi.bizum.repository.UserRepositoryJsonImpl;
import edu.es.eoi.bizum.view.MainMenu;

public class BizumApp {

	public static User loggedUser;
	
	public static void main(String[] args) {
		
//		User user1= new User();
//		user1.setName("Jose Juan");
//		user1.setUsername("JJ");
//		user1.setMail("jotajota@gmail.com");
//		user1.setPassword("password");
//		user1.setTelephone("12345678");
//				
//		UserRepository userRepository=new UserRepositoryJsonImpl();
//		
////		repo.createUser(user);		
//		
//		User user2=userRepository.findUserByTelephone("12345678");
//		
//		System.out.println(user2.getUsername());
//		
//		user2=userRepository.login("JJ", "password");
//		
//		System.out.println(user2.getName());
//		
//		User user3=userRepository.findUserByTelephone("87654321");
//		
//		Transfer transfer= new Transfer();
//		transfer.setFrom(user3);
//		transfer.setTo(user1);
//		transfer.setAmount(100);
//		
//		TransferRepository transferRepository=new TransferRepositoryImpl();
////		transferRepository.createTransfer(transfer);
//		
//		List<Transfer> received=transferRepository.findTransfersReceivedByTelephone("12345678");
//		List<Transfer> sended=transferRepository.findTransfersSendedByTelephone("12345678");
//		
//		System.out.println("recibidas:"+received.size());
//		System.out.println("enviadas: "+ sended.size());
	
//		UserRepositoryJsonImpl repo= new UserRepositoryJsonImpl();
//		loggedUser=repo.findUserByTelephone("12345678");
		
		MainMenu.printMenu();
		
	}

}
