package edu.es.eoi.entity;

public class Alumno {
	
	private int id;
	
	private String dni;
	
	private String name;
	
	private String surname;
	
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", dni=" + dni + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	
	
	

}
