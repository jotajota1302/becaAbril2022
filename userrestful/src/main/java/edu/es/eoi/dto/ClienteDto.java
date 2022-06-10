package edu.es.eoi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteDto {
	
	@JsonProperty(value = "nif")
	private String dni;	

	private double saldo;
	
	private int cuentas;
	
	private List<String> bancos;
	
	@JsonProperty
	private boolean moroso;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getCuentas() {
		return cuentas;
	}

	public void setCuentas(int cuentas) {
		this.cuentas = cuentas;
	}

	public List<String> getBancos() {
		return bancos;
	}

	public void setBancos(List<String> bancos) {
		this.bancos = bancos;
	}

	public boolean isMoroso() {
		return moroso;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}
	
	
	
}
