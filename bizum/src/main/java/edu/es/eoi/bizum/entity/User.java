package edu.es.eoi.bizum.entity;

import java.util.List;

public class User extends Person{

	private String username;
	
	private String mail;
	
	private String password;
	
	private List<Transfer> sended;
	
	private List<Transfer> received;
	
	private double balance;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Transfer> getSended() {
		return sended;
	}

	public void setSended(List<Transfer> sended) {
		this.sended = sended;
	}

	public List<Transfer> getReceived() {
		return received;
	}

	public void setReceived(List<Transfer> received) {
		this.received = received;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
