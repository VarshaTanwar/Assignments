package com.training;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class BookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Book java = new Book();
		Book python = new Book();
		
		
		try {
			java.setAuthorName("Joey K");
			java.setBookId(123);
			java.setBookName(null);
			
		}
			
		 catch (MyCustomException e) {
			// TODO Auto-generated catch block
			System.out.println("My Custom Exception Found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} 
		try{
			java.setPrice(5000);
	
		}
			
		 catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println("Range Check Exception Found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} 
		try{
			
			python = new Book(234,"K Sharma","Python rules",200.0);
		}
			
		 catch (RangeCheckException e) {
					// TODO Auto-generated catch block
					System.out.println("Range Check Exception Found");
					System.err.println(e.getMessage());
					e.printStackTrace();
		}  
		System.out.println(python.getAuthorName());
		BookService service = new BookService();
		
		service.addBook(java);
		service.addBook(python);
		
	    System.out.println(service.getOneBook(123));
		System.out.println(service.getOneBook(234));
		
		Book[] books = service.getAllBooks();
		for(int i=0;i<2;i++) {
			System.out.println(books[i]);
	}
	}
}
