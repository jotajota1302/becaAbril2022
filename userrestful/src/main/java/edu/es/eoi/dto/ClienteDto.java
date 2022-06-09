package edu.es.eoi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteDto {
	
	@JsonProperty(value = "nif")
	private String dni;	

	private String nombre;
	
	private String direccion;

	private double saldo;
	
	@JsonProperty(value = "deudor")
	private boolean moroso;
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isMoroso() {
		return moroso;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
	
}
