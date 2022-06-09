package edu.es.eoi.repository;

import java.util.List;

import edu.es.eoi.entity.Cliente;

public interface ClientRepository {

	Cliente find(String dni);

	Cliente create(Cliente cliente);

	Cliente update(Cliente cliente);

	void delete(Cliente cliente);
	
	public List<Cliente> findAll();

}