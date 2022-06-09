package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.service.ClientService;

@RestController
@RequestMapping("/clientes")
public class ClientController {

	@Autowired
	private ClientService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> find() {
	
		return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
				
	}
	
	@RequestMapping(value = "/{dni}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable String dni) {
	
			if(dni.length()<8||dni.length()>9) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		
			ClienteDto cliente=service.find(dni);
			
			if(cliente!=null) {
				return new ResponseEntity<>(cliente, HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody ClienteDto cliente) {

		if (cliente.getDni().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			service.create(cliente);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}

	}

	@RequestMapping(value = "/{dni}", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable String dni) {

		ClienteDto cliente = service.find(dni);
		service.delete(cliente);

		return new ResponseEntity<>(HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{dni}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable String dni, @RequestBody ClienteDto cliente) {

		if (!cliente.getDni().equals(dni)) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			service.update(cliente);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}

	}

}
