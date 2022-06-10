package edu.es.eoi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipo")
@Getter
@Setter
public class PokemonType {
	
	@Id
	@Column(name = "id_tipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	
	@Column(name = "nombre")
	private String name;

	@ManyToMany(mappedBy = "types",fetch = FetchType.LAZY)
	private List<Pokemon> pokemons;
}
