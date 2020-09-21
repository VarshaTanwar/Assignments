package com.training;
import java.io.File;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book java = new Book(123,"Head first","kathy",450);
		
		BookService service = new BookService();
		
		boolean result = service.writeObject(java);
		
		if(result)
		{
			System.out.println("Book persisted");
		} 
		else
		{
			System.out.println("Error-Check");
		} 
		result = service.writeWithDataStream(java,new File("book.ser"));
		
		if(result)
		{
			System.out.println("Book written on file");
		} 
		else
		{
			System.out.println("Error-Check");
		} 
		
		Book book1 = service.readObject();
		System.out.println("Book details "+ book1.getAuthorName()+ " "+ book1.getBookName()+ " price :"+book1.getPrice());
		
	}

}
