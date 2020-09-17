package com.training.example;

import com.training.ifaces.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowRoom saiCars = new NewShowRoom();
		
		//int key = Integer.parseInt(args[0]);		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(choice!=1)
		{
			System.out.println("Please enter key:\n ");
			
			int key = sc.nextInt();
			Automobile selected = saiCars.getProduct(key);
			if(selected!=null)
			{
				saiCars.printEstimate(selected);
			}
			else
				{
				System.out.println("Invalid Input !!!");
				} 
			System.out.println("Enter 1 to terminate");
			choice = sc.nextInt();
		}
		
		sc.close();
	}
	
}
