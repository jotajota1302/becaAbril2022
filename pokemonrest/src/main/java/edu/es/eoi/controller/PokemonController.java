package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.PokemonDto;
import edu.es.eoi.service.PokemonService;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

	@Autowired
	PokemonService service; 
	
	@RequestMapping(method = RequestMethod.GET,value = "/{id}")
	public ResponseEntity<PokemonDto> findById(@PathVariable Integer id){
		
		return new ResponseEntity<PokemonDto>(service.findById(id),HttpStatus.OK);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PokemonDto>> findAll(@RequestParam @Nullable String param){
		
		return new ResponseEntity<List<PokemonDto>>(service.findAll(),HttpStatus.OK);
		
	}
	
}
