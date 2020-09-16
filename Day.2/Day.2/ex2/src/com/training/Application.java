package com.training;

public class Application {

	public static void main(String[] args) {
		Insurance client1 = new Insurance(101,"Joey",27,10000.0);
		 
		double premiumAmount = client1.calculatePremium();
		System.out.println("The premium amount for" + client1.getPolicyHolderName()+ " is " + premiumAmount);

	}

}
