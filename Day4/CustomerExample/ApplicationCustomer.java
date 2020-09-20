package com.training;

import com.training.exceptions.RangeCheckException;


public class ApplicationCustomer {

	public static void main(String[] args){
		// TODO Auto-generated method stub 
		try{
		Customer ram = new Customer();
		
		ram.setCustomerId("123");
		ram.setEmail("ram.abc.com");
		ram.setMobileNumber(213456);
		ram.setCustomerName("Ram");  
		
		
		CustomerService service = new CustomerService();
		 
		System.out.println(service.generateUserId(ram));
		service.printCustomer(ram); 
		service.encryptEmail(ram);
		}
        catch(RangeCheckException e)
        {
        	System.out.println(e.getMessage());
        }
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	} 

}
