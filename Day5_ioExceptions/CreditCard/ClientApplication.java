package com.training;
 
import java.io.*;

import com.training.CreditCard;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CreditCard holderList[] = new CreditCard[3]; 
       
       holderList[0] = new CreditCard("joey","08/23",10000.0);
       holderList[1] = new CreditCard("chloe","09/24",40000.0);
       holderList[2] = new CreditCard("kevin","06/22",20000.0);
       
       
       BusinessService service = new BusinessService();
       boolean result = service.writeFile(1,holderList);
		
		if(result)
		{
			System.out.println("Details of the Card holders persisted");
		} 
		else
		{
			System.out.println("Error-Check");
		} 
        
		CreditCard holderList1[] = service.readObject();
				for(int j=0;j<3;j++)
				{
					System.out.println("Card-Holder Name "+ holderList1[j].getCustomerName()+ " Expiry date " + holderList1[j].getExpiryDate()+ " Card limit "+holderList1[j].getCardLimit());
				} 
				
				
		 result = service.writeFile(2,holderList);	
		 System.out.println("Details of the Card holders written");
		
		try {
			CreditCard holderList3[] = service.readfile(new File("card.txt"));
			for(int j=0;j<3;j++)
			{
				System.out.println("Card-Holder Name "+ holderList3[j].getCustomerName()+ " Expiry date " + holderList3[j].getExpiryDate()+ " Card limit "+holderList3[j].getCardLimit());
			} 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		CreditCard holderList2[]=service.deleteFromFile(holderList,"kevin");
		for(int j=0;j<2;j++)
		{
			System.out.println("Card-Holder Name "+ holderList2[j].getCustomerName()+ " Expiry date " + holderList2[j].getExpiryDate()+ " Card limit "+holderList2[j].getCardLimit());
		} 
	} 

}
