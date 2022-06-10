package edu.es.eoi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pokemon")
@Getter
@Setter
public class Pokemon {

	@Id
	@Column(name = "numero_pokedex")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "peso")
	private String weight;
	
	@Column(name = "altura")
	private String height;
	
	
}
