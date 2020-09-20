package com.training;

import java.util.NoSuchElementException;

public class BookService {  
	
	int i = 0;
	boolean b = false;
	Book BookList[] = new Book[10];
	
	public void addBook(Book book)
	{   
		
		
		BookList[i] = book;
		i++;
		
	}
	
	public Book[] getAllBooks(){
		
		return BookList;
	}

	public Book getOneBook(int bookId)
	{   
		Book selected = new Book();
		for(int j=0;j<i;j++)
		{
			if(BookList[j].getBookId()==bookId)
			{
				selected = BookList[j];
				b = true;
			} 
			if(b==false)
			{  
				
				try {
					throw new NoSuchElementException();
				} catch (Exception e) {
					System.out.println("Cannot find this book with bookId :"+bookId);
					e.printStackTrace();
				}
			}
		} 
		return selected;
	} 
	
}
