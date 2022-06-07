package edu.es.eoi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.es.eoi.domain.Cliente;

@Controller
@RequestMapping("/cliente")
public class MiprimerControlador {

	@RequestMapping(method = RequestMethod.GET)
	public String getHelloHtml() {

		// recuperar todos los clientes

		return "hello.html";
	}

	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	@ResponseBody
	public List<Cliente> getAllClients() {

		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente("JJ", "123345678A"));
		lista.add(new Cliente("Pedro", "723981273B"));
		lista.add(new Cliente("Maria", "234234234C"));

		return lista;
	}

	@RequestMapping(value = "/dni", method = RequestMethod.GET)
	@ResponseBody
	public String getDniByRequest(@RequestParam String nombre) {

		System.out.println("Voy a buscar el dni de: " + nombre);

		return "483612738A";
	}

	@RequestMapping(value = "/dni/{nombre}", method = RequestMethod.GET)
	@ResponseBody
	public String getDniByPathPariable(@PathVariable String nombre) {

		System.out.println("Voy a buscar el dni de: " + nombre);

		return "483612738A";
	}

}
