package edu.es.eoi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MundoBancarioRepository {

	EntityManager manager=Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();
	
	public List<Cuenta> findCuentasByCliente(String dni){
		
				
		return null;
		
		
	}
	
}
