package com.training;

public class Application {

	public static void main(String[] args) {
		Insurance client1 = new Insurance(101,"Joey",27,10000.0);
		Insurance client2 = new Insurance(102,"Clay",22,20000.0);
		
		 
		double premiumAmount = client1.calculatePremium();
		//System.out.println("The premium amount for " + client1.getPolicyHolderName()+ " is " + premiumAmount);
	        premiumAmount = client2.calculatePremium();
		
	//	System.out.println("The premium amount for " + client2.getPolicyHolderName()+ " is " + premiumAmount); 
		
		
		VehicleInsurance vehicle1 = new VehicleInsurance(201,"A",22,10000.0,2,2018,10000.0);
		VehicleInsurance vehicle2 = new VehicleInsurance(202,"B",22,10000.0,4,2018,10000.0);
		VehicleInsurance vehicle3 = new VehicleInsurance(203,"C",22,10000.0,2,2020,10000.0);
		VehicleInsurance vehicle4 = new VehicleInsurance(204,"D",22,10000.0,4,2020,10000.0);
 
		System.out.println("New vehicle cost is "+ vehicle1.calculatePremium() );
		System.out.println("New vehicle cost is "+ vehicle2.calculatePremium() );
		System.out.println("New vehicle cost is "+ vehicle3.calculatePremium() );
		System.out.println("New vehicle cost is "+ vehicle4.calculatePremium() );


	}

}
