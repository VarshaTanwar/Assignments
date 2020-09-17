package com.training.example;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	public Automobile getProduct(int key) {

		if(key==3)
		{
			return new Tractor();
		}
		return super.getProduct(key);
	}

	
}
