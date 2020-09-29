package com.training;

import com.training.daos.InvoiceDaoImpl;
import com.training.ifaces.InvoiceDAO;
import com.training.utils.ConnectionUtility;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ConnectionUtility.getDerbyConnection());
		
		InvoiceDAO dao = new InvoiceDaoImpl();
		Invoice ramesh = new Invoice(124,"ramesh",1000);
		
		
		
		boolean result = dao.remove(ramesh);
		
		if(result)
		{
			System.out.println("Row deleted");
		} 
		
		//System.out.println(dao.findById(123));
		System.out.println(dao.findAll());
		
	}

}
