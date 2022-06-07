package edu.es.eoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/client")
public class MiprimerControlador {
		
	@RequestMapping(method = RequestMethod.GET)	
	public String getHelloHtml() {
		
		//recuperar todos los alumnos
		
		return "hello.html";
	}
	
	@RequestMapping(value = "/dni",method = RequestMethod.GET)
	@ResponseBody
	public String getDniByRequest(@RequestParam String nombre) {		
		
		System.out.println("Voy a buscar el dni de: " + nombre);
		
		return "483612738A";
	}
	
	@RequestMapping(value = "/dni/{nombre}",method = RequestMethod.GET)
	@ResponseBody
	public String getDniByPathPariable(@PathVariable String nombre) {		
		
		System.out.println("Voy a buscar el dni de: " + nombre);
		
		return "483612738A";
	}

}
