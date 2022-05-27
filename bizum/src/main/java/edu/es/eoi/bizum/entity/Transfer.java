package edu.es.eoi.bizum.entity;

import java.time.LocalDateTime;

public class Transfer {
	
	private User from;
	
	private User to;
	
	private double amount;
	
	private LocalDateTime transferDate;
	
	private String date;

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public User getTo() {
		return to;
	}

	public void setTo(User to) {
		this.to = to;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(LocalDateTime transferDate) {
		this.transferDate = transferDate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	
}
