package com.training.ifaces;
import com.training.Invoice;

import java.util.*;

public interface InvoiceDAO {
	
	
	Collection<Invoice> findAll();
	boolean add(Invoice entity);
	boolean add(Invoice ...invoices);
	Invoice findById(int id);
	boolean remove(Invoice entity);
	boolean update(Invoice oldEntity,Invoice updatedEntity);
	//Collection sortedByInvoiceNumber();
	//Collection <Invoice> sortedBy(String propName);
	//Collection <Invoice> sortedByInvoiceNumber();
	
	
	
	

}
