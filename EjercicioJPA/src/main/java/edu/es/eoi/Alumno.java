package edu.es.eoi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno",schema = "beca")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int id;
	
	@Column(name = "dni")
	private String nif;
	
	@Column(name="apellidos")
	private String surname;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name = "telefono")
	private String phone;
	
	@Column(name="edad")
	private Integer age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
