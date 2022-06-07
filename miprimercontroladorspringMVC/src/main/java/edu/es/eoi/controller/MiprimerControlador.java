package edu.es.eoi.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.es.eoi.domain.Cliente;

@Controller
@RequestMapping("/cliente")
public class MiprimerControlador {

//	@RequestMapping(method = RequestMethod.GET)
//	public String getHelloHtml() {
//
//		// recuperar todos los clientes
//
//		return "hello.html";
//	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Cliente> getAllClients() {

		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente("JJ", "123345678A"));
		lista.add(new Cliente("Pedro", "723981273B"));
		lista.add(new Cliente("Maria", "234234234C"));

		return lista;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteAll(@Nullable @RequestParam String usuario,@Nullable @RequestParam String pw) {
		
		if(usuario!=null&&usuario.equals("JJ")) {
			return "borro todos los clientes";
		}else {
			return "no permitido";
		}
	
	}

	@RequestMapping(value = "/hora", method = RequestMethod.GET)
	@ResponseBody
	public LocalDateTime getTime() {		
		return LocalDateTime.now();
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String createCliente(@RequestBody @Nullable Cliente cliente) {		
		
		//recoger los campos de cliente y insertarlos en la bbdd
		
		if(cliente==null) {
			System.out.println("faltan los datos del cliente");
			return "falta info";
		}else {
			System.out.println("inserto un cliente nuevo en bbdd");			
			return "Cliente creado";
		}
	}


	@RequestMapping(value = "/{nombre}", method = RequestMethod.GET)
	@ResponseBody
	public String getDniByPathPariable(@PathVariable String nombre) {

		System.out.println("Voy a buscar el dni de: " + nombre);

		return "483612738A";
	}

}
