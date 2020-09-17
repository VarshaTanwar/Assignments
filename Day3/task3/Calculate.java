package com.training;
import com.training.interfaces.Rentals;

public class Calculate 
{
 
	public Rentals getProduct(int key)
	{
		switch (key) {
		case 1:
			return new Computer();
		case 2:
			return new Furnitures();
		default:
			return null;
		}
	}
	
}
