package com.training;

public class CustomerService { 
	
	public String generateUserId(Customer cust)
	{   String userid = "";
		try {
			int firstPart = Integer.parseInt(cust.getCustomerId());
			String secondPart = cust.getEmail().substring(1,4);
			userid = firstPart + secondPart;
		} catch (NumberFormatException e) {
			System.err.println("Customer Id should be a number");
			e.printStackTrace();
		}
		return userid;
	}
	public void printCustomer(Customer cust)
	{
		try {
			System.out.println(cust.getCustomerName().length());
			
		} 
		catch (NullPointerException e) {
			System.err.println("Customer Name Should not be empty");
			e.printStackTrace();
			
		} 
		System.out.println("Outside catch block");
	}
		
		
	
	public String encryptEmail(Customer c){
	
	String email = c.getEmail();
	String encrpyted = null;
	boolean status = email.contains("@");
	if(status)
	{  try
	{
		throw new Exception("Invalid Email Id");
		
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		return "from catch";
	}
	finally{
		System.err.println("Inside finally block");
	} 
	}
	else
	{
		encrpyted = "abcd" + email + "123@";
	}
	return encrpyted;
}
	

}


