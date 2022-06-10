package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estadisticas_base")
@Getter
@Setter
public class Stats {

	@Id
	@Column(name = "numero_pokedex")
	private int id;
	
	@Column(name = "ps")
	private int health;
	
	@Column(name = "ataque")
	private int attack;
	
	@Column(name = "defensa")
	private int defense;
	
	@Column(name = "especial")
	private int special;
	
	@Column(name = "velocidad")
	private int speed;

}
