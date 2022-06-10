package edu.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.es.eoi.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{

}
