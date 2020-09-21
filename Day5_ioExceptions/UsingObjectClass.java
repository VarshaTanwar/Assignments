package com.training;

public class UsingObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java1 = new Book(123,"Head first","kathy",450);
		Book java2 = new Book(123,"Head first","kathy",450);
   
		System.out.println(java1.equals(java2)); 
		
		Book java3=java2;
		System.out.println(java3.equals(java2)); 
		
	}

}
