package com.training;

import com.training.interfaces.Rentals;

public class Computer implements Rentals {

	public String getitemName() {
		// TODO Auto-generated method stub
		return "DELL";
	}

	public double getPerDayRent() {
		// TODO Auto-generated method stub
		return 500.0;
	}

	public int getNodays() {
		// TODO Auto-generated method stub
		return 2;
	}

	public double GetTotalRent(Rentals item) {
		System.out.println(item.APPNAME);
		return this.getNodays()*this.getPerDayRent();
	} 
	

}
