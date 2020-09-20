package com.training;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Book {

	private int bookId;
	private String bookName;
	private String authorName;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, String authorName, double price) throws RangeCheckException{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		if(this.price<=100.0 || this.price>500.0)
			
		{
			throw new RangeCheckException("Price of the book should be in the range 100-500 !!!");
		} 
		else
		{
		this.price = price;
		}
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName)throws MyCustomException {
		if(this.bookName==null)
		{
			try{
				throw new NullPointerException();
			} 
			catch(Exception e){
				throw new MyCustomException("Book name should not be empty", e);
				
			}
		}
		else{
		this.bookName = bookName;
		}
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		
		return price;
	}
	public void setPrice(double price) throws RangeCheckException{
		if(this.price<100 || this.price>500)
		{
			
				throw new RangeCheckException("Invalid price");
			
		} 
		else{
		this.price = price;
		}
	}
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", authorName=" + authorName + ", price=" + price + "]";
	}
	
}
