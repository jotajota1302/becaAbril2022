package edu.es.eoi.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonDto {

	private String name;
	
	private List<String> types;
	
	private String attack;
	
	private String defense;
}
