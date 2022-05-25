package ejerciciosficheros;

import java.util.List;

public class Alumno {
	
	public String nombre;
	
	public String apellido;
	
	public int edad;
	
	public List<Calificacion> notas;

	public Alumno(String nombre, String apellido, int edad, List<Calificacion> notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.notas = notas;
	}
	
	

}
