package edu.es.eoi;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.User;
import edu.es.eoi.repository.ClientRepository;
import edu.es.eoi.repository.ClientSpringDataRepository;
import edu.es.eoi.repository.UserRepository;

@SpringBootTest
class UserRestfulApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ClientSpringDataRepository clientSpringDataRepository;

	@Test
	void testUserRepository() {
					
		User tmp=new User();
		tmp.setUsername("test");
		tmp.setMail("mailtest");
		tmp.setPassword("pwtest");
		
		userRepository.create(tmp);
		
		User user=userRepository.find(tmp.getId());			
		Assertions.assertEquals("test",user.getUsername());
		
		user.setMail("updated");
		userRepository.update(user);
		
		Assertions.assertEquals("updated",userRepository.find(user.getId()).getMail());
				
		userRepository.delete(user);		
		Assertions.assertNull(userRepository.find(tmp.getId()));			
		
	}
	
	@Test
	void testClientRepository() {

		Cliente tmp=new Cliente();
		tmp.setDireccion("addresstest");
		tmp.setDni("88888888A");
		tmp.setNombre("JJ");		
		
		clientSpringDataRepository.save(tmp);
		
		Cliente cliente=clientSpringDataRepository.findById(tmp.getDni()).get();	
		Assertions.assertEquals("JJ",cliente.getNombre());
		
		cliente.setDireccion("updated");
		clientSpringDataRepository.save(cliente);
		
		Assertions.assertEquals("updated",clientSpringDataRepository.findById(cliente.getDni()).get().getDireccion());
				
		clientSpringDataRepository.delete(cliente);		
		
		Assertions.assertEquals(Optional.empty(),clientSpringDataRepository.findById(tmp.getDni()));			
		
	}
	
	@Test
	void testClientRepositorySpringData() {

		Cliente tmp=new Cliente();
		tmp.setDireccion("addresstest");
		tmp.setDni("88888888A");
		tmp.setNombre("JJ");		
		
		clientRepository.create(tmp);
		
		Cliente cliente=clientRepository.find(tmp.getDni());			
		Assertions.assertEquals("JJ",cliente.getNombre());
		
		cliente.setDireccion("updated");
		clientRepository.update(cliente);
		
		Assertions.assertEquals("updated",clientRepository.find(cliente.getDni()).getDireccion());
				
		clientRepository.delete(cliente);		
		Assertions.assertNull(clientRepository.find(tmp.getDni()));			
		
	}

}
