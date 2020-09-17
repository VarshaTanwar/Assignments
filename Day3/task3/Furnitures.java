package com.training;

import com.training.interfaces.Rentals;

public class Furnitures implements Rentals {

	public String getitemName() {
		// TODO Auto-generated method stub
		return "Chair";
	}

	public double getPerDayRent() {
		// TODO Auto-generated method stub
		return 100.0;
	}

	public int getNodays() {
		// TODO Auto-generated method stub
		return 5;
		
	
	}

	public double GetTotalRent(Rentals item) {
		System.out.println(item.APPNAME);
		return this.getNodays()*this.getPerDayRent();
	}

}
