package edu.es.eoi;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.entity.Pokemon;
import edu.es.eoi.entity.PokemonType;
import edu.es.eoi.repository.PokemonRepository;
import edu.es.eoi.repository.PokemonTypeRepository;
import edu.es.eoi.repository.StatsRepository;

@SpringBootTest
class PokemonRestApplicationTests {

	@Autowired
	PokemonRepository pokemonRepo;
	
	@Autowired
	PokemonTypeRepository pokemonTypeRepo;
	
	@Autowired
	StatsRepository statsRepository;
	
	@Test
	void contextLoads() {

		
		Assertions.assertEquals(151,pokemonRepo.count());
		
		Pokemon pok=pokemonRepo.findById(1).get();
	
		for (PokemonType tipo : pok.getTypes()) {
			System.out.println(tipo.getName());
		}
		
		Assertions.assertEquals(15,pokemonTypeRepo.count());
		
		System.out.println(statsRepository.findById(1).get().getAttack());
		
	}

}
