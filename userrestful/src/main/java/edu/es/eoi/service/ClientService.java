package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;
import edu.es.eoi.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public ClienteDto find(String dni) {

		// encontrar un cliente entidad y devolverme un dto
		Cliente entity = repository.find(dni);
		ClienteDto dto = convertToDto(entity);

		return dto;
	}

	public Cliente create(ClienteDto dto) {

		return repository.create(convertToEntity(dto));
	}

	public ClienteDto update(ClienteDto dto) {

		Cliente cliente = repository.find(dto.getDni());
		cliente.setDireccion(dto.getDireccion());
		cliente.setDni(dto.getDni());
		cliente.setNombre(dto.getNombre());
		repository.update(cliente);

		return dto;
	}

	public void delete(ClienteDto cliente) {

		repository.delete(repository.find(cliente.getDni()));
	}

	public List<ClienteDto> findAll() {

		List<ClienteDto> dtos = new ArrayList<ClienteDto>();
		for (Cliente cliente : repository.findAll()) {
			dtos.add(convertToDto(cliente));
		}

		return dtos;
	}

	private ClienteDto convertToDto(Cliente entity) {

		ClienteDto dto = new ClienteDto();
		dto.setDni(entity.getDni());
		dto.setNombre(entity.getNombre());
		dto.setDireccion(entity.getDireccion());
		double saldo = 0;
		for (Cuenta cuenta : entity.getCuentas()) {
			saldo = saldo + cuenta.getSaldo();
		}
		dto.setSaldo(saldo);
		// logica de negocio
		if (saldo < 0) {
			dto.setMoroso(true);
		}
		return dto;
	}

	private Cliente convertToEntity(ClienteDto dto) {

		Cliente cliente = new Cliente();
		cliente.setDni(dto.getDni());
		cliente.setDireccion(dto.getDireccion());
		cliente.setNombre(dto.getNombre());

		return cliente;
	}

}
