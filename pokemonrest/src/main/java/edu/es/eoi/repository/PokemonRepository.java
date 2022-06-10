package edu.es.eoi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.es.eoi.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{

	public List<Pokemon> findByNameContaining(String name);

	public List<Pokemon> findByOrderByWeightDesc();
	
	public List<Pokemon> findByTypes_nameIgnoringCase(String type);
	
}
