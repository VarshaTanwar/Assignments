package com.training;

import java.util.Comparator;

import com.training.Invoice;

public class InvoiceNumberComparator implements Comparator<Invoice> {

	public int compare(Invoice obj1, Invoice obj2) {
		if(obj1.getInvoiceNumber()>obj2.getInvoiceNumber())return -1;
		if(obj1.getInvoiceNumber()<obj2.getInvoiceNumber())return 1;
		return 0;
	}

}
