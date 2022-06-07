package edu.es.eoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class MiprimerControlador {
		
	@RequestMapping(method = RequestMethod.GET)
	public String getHello() {
		
		System.out.println("Alguien me ha llamado");
		
		//si hay que llamar aun servicio lo llamo
		
		return "hello.html";
	}

}
