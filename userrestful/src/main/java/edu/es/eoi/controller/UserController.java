package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.User;
import edu.es.eoi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable String id) {

		try {
			int pk = Integer.valueOf(id);
			return new ResponseEntity<>(service.find(pk), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody User user) {

		if (user.getId() != 0) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		} else {
			service.create(user);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable String id) {

		User user = service.find(Integer.valueOf(id));
		service.delete(user);

		return new ResponseEntity<>(HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable String id, @RequestBody User user) {

		if (user.getId() != Integer.valueOf(id)) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			service.update(user);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}

	}

}
