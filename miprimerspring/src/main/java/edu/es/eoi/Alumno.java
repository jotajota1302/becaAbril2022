package edu.es.eoi;

public class Alumno {

	private String nombre;
	
	private Perro perro;

	public Alumno(Perro perro) {
		super();
		this.perro = perro;
	}

	public Alumno() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}	
	
	
	
	
}
