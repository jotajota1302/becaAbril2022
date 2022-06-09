package edu.es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Cliente;

@Repository
public class ClientRepositoryJPAImpl implements ClientRepository {
	
	@Autowired
	EntityManager manager;
		
	
	@Override
	public Cliente find(String dni) {
		
		return manager.find(Cliente.class,dni);
		
	}
	
	@Override
	public Cliente create(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		return cliente;
	}
	
	@Override
	public Cliente update(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();
		
		return cliente;
	}
	
	@Override
	public void delete(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.remove(cliente);
		manager.getTransaction().commit();
		
	}
	
	public List<Cliente> findAll() {
		Query query = manager.createQuery("FROM Cliente");
		return query.getResultList();
	}

}
