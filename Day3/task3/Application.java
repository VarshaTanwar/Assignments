package com.training;
import com.training.interfaces.Rentals;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculate customer1 = new Calculate();
			    
				Scanner sc = new Scanner(System.in);
				int choice = 0;
				double totalRent = 0.0;
				while(choice!=1)
				{
					System.out.println("Please enter item you would like to rent(1/2):\n ");
					
					int key = sc.nextInt();
					Rentals selected = customer1.getProduct(key);
					
					if(selected!=null)
					{ 
						 totalRent =selected.GetTotalRent(selected);
						//totalRent += customer1.calculateRent(selected);
						System.out.println("Total rent for the items is " + totalRent );
					}
					else
						{
						System.out.println("Invalid Input. Please try again !!!");
						} 
					System.out.println("Enter 1 to terminate,else continue");
					choice = sc.nextInt();
				}
				
				sc.close();
	}

}
