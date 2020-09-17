package com.training;

public class Application {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawyer rajesh = new Lawyer(123,"Rajesh","High Court","B.L");
		Musician sharma = new Musician(234,"Ramesh Sharma","shenoy","Allahabad");
		
		Billing bill = new Billing();
		 
		bill.printFees(sharma);
		bill.printFees(rajesh);
	}

}
