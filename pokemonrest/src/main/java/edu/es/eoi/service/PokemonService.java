package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.PokemonDto;
import edu.es.eoi.entity.Pokemon;
import edu.es.eoi.entity.PokemonType;
import edu.es.eoi.entity.Stats;
import edu.es.eoi.repository.PokemonRepository;
import edu.es.eoi.repository.PokemonTypeRepository;
import edu.es.eoi.repository.StatsRepository;

@Service
public class PokemonService {

	@Autowired
	PokemonRepository pokemonRepository;

	@Autowired
	PokemonTypeRepository pokemonTypeRepository;

	@Autowired
	StatsRepository statsRepository;

	public PokemonDto findById(int id) {

		Pokemon entity = pokemonRepository.findById(id).get();

		PokemonDto dto = new PokemonDto();
		dto.setName(entity.getName());

		// como transformo una lista de pokemon type en una lista de String

		List<String> types = new ArrayList<String>();
		List<PokemonType> pokemonTypes = entity.getTypes();

		for (PokemonType pokemonType : pokemonTypes) {
			types.add(pokemonType.getName());
		}

		dto.setTypes(types);
		
		//encontrar el ataque y defensa
		
		Stats stats=statsRepository.findById(id).get();
		
		dto.setAttack(String.valueOf(stats.getAttack()));
		dto.setDefense(String.valueOf(stats.getDefense()));
		
		return dto;
		
	}

}
