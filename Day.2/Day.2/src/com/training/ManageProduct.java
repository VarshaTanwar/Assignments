package com.training;

public class ManageProduct {
	
	public Product[] calculateDiscount(Product[] productList)
	{
		double discount = 0.0;
		for(int i=0;i<productList.length;i++){
		
			if(productList[i].getRatePerUnit()>500 && productList[i].getRatePerUnit()<=1000){
				discount=0.10;
			} 
			else if(productList[i].getRatePerUnit()>1000)
			{
				discount=0.15;
			}
			productList[i].setDiscount(discount);
		}
		return productList;
	}

public double findPercentage(Product product)
{  double discount = 0.0;
	switch(product.getProducttType()){
	case 1: 
		discount = 0.5;
		break;
	case 2:
		discount = 0.10;
		break;
	case 3:
		discount = 0.15;
		break;
	default:
		discount = 0.28;
		break;
		
		
	
	} 
	return discount;
}
  
   public void showProductsLegacy(Product[] productList){
	   for(int i=0;i<productList.length;i++){
		   System.out.println("product:"+ i +productList[i].getProductName());
	   }
   }
	public void showProductForEach(Product[] productList){
	
		for(int i=0;i<productList.length;i++)
		{  
			
			System.out.println(productList[i].getProductName()+ " has " + productList[i].getRatePerUnit()+ " and total discount is " + mainDiscount(productList[i]));
		}
	} 
	public double mainDiscount(Product product)
	{
		double amount = 0.0;
		amount = product.getRatePerUnit()*product.getQuantity();
		double totaldiscount = 0.0;
		totaldiscount= product.getDiscount()*product.getQuantity()*product.getRatePerUnit();
		return amount-totaldiscount;
	}

}

