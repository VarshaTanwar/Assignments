package com.training;

import com.training.exceptions.RangeCheckException;



public class Customer {
	
	private String customerId;
	private String customerName;
	private long mobileNumber;
	private String email;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String customerName, long mobileNumber,
			String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) throws RangeCheckException {
		if(mobileNumber<0 || mobileNumber > 99999)
		{
			throw new RangeCheckException("Invalid Mobile Number");
		}
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", mobileNumber=" + mobileNumber + ", email="
				+ email + "]";
	}
	
	

}
