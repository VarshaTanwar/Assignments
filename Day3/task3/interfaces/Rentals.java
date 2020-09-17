package com.training.interfaces;

public interface Rentals {

	String APPNAME = "Rental Portal System";
	
	String getitemName();
	double getPerDayRent();
	int getNodays(); 
	
	public double GetTotalRent(Rentals items);
}
