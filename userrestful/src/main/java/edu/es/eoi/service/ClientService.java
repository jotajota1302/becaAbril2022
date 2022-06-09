package edu.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public Cliente find(String dni) {

		return repository.find(dni);
	}

	public Cliente create(Cliente cliente) {

		return repository.create(cliente);
	}

	public Cliente update(Cliente cliente) {

		return repository.update(cliente);
	}

	public void delete(Cliente cliente) {

		repository.delete(cliente);

	}

	public List<Cliente> findAll() {

		return repository.findAll();

	}

}
