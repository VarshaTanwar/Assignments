package com.training;

import java.io.Serializable;

public class CreditCard implements Serializable{ 
	private String customerName;
	private String expiryDate;
	private double cardLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(String customerName, String expiryDate, double cardLimit) {
		super();
		this.customerName = customerName;
		this.expiryDate = expiryDate;
		this.cardLimit = cardLimit;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}
	public String toString() {
		return customerName + "," + expiryDate  + "," + cardLimit ;
	}
	
	

}
