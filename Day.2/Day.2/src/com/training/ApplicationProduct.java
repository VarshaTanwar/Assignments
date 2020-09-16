package com.training;

public class ApplicationProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product tv = new Product(1010,"LED TV",23000.0,1,4,0.2);
		Product fridge = new Product(1020,"FRIDGE",20000.0,3,3,0.25);

		ManageProduct mgr = new ManageProduct();


		double discountPercentage = mgr.findPercentage(tv);

		System.out.println("discount Percentage - > "+ discountPercentage);

		Product[] productList = new Product[2];

		productList[0]= tv;
		productList[1]= fridge;
		mgr.calculateDiscount(productList);

		mgr.showProductForEach(productList);
		mgr.showProductsLegacy(productList);



	}

}
