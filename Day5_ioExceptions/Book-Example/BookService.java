package com.training;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class BookService {
 
	public boolean writeObject(Book book)
	{
		boolean persisted = false;
		ObjectOutputStream outstream = null;
		try{
		outstream = new ObjectOutputStream(new FileOutputStream(new File("book.ser")));
		outstream.writeObject(book);
		persisted = true;
		} 
		
		catch(IOException e){
			System.err.println(e.getMessage());
		}
		finally{
			try{
				outstream.close();
			}catch(IOException e){
				e.printStackTrace();
				
			}
		}
		return persisted;
	} 
	
	public Book readObject()
	{
		Book book = null;
		ObjectInputStream input = null;
		try{
			  input =new ObjectInputStream(new FileInputStream("book.ser")); 
			  book = (Book)input.readObject();
		} 
		catch(IOException e)
		{
			System.err.println(e.getMessage());
		} 
		catch(ClassNotFoundException e)
		{
			System.err.println(e.getMessage());
		} 
		finally{
			try{
				input.close();
			}catch(IOException e){
				e.printStackTrace();
				
			}
		}
		return book;
	} 
	public boolean writeWithDataStream(Book book,File file)
	{  
		DataOutputStream dataOut = null;
		boolean written= false;
	
	try {
		dataOut = new DataOutputStream(new FileOutputStream(file));
		dataOut.writeInt(book.getBookNumber());
		dataOut.writeUTF(book.getBookName());
		dataOut.writeUTF(book.getAuthorName());
		dataOut.writeDouble(book.getPrice());

		 written = true;
	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	finally {
		try{
			dataOut.close();
			} 
			catch(IOException e)
			{
				e.getMessage();
			}
	}
		return written;
	} 
	
	public Book readWithDataStream(File file)
	{
		DataInputStream dataIn = null;
		Book book = new Book();
		try {
			dataIn = new DataInputStream(new FileInputStream(file)); 
			
			
			book.setBookNumber(dataIn.readInt());
			book.setBookName(dataIn.readUTF());
			book.setAuthorName(dataIn.readUTF());
			book.setPrice(dataIn.readDouble());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally { 
			try{
			dataIn.close();
			} 
			catch(IOException e)
			{
				e.getMessage();
			}
		}  
		return book;
	}  
}




