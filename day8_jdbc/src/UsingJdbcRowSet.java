package com.training;

import java.sql.*;

import javax.sql.*;
import javax.sql.rowset.*;
import javax.sql.rowset.spi.*;

import com.training.utils.ConnectionUtility;
public class UsingJdbcRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = ConnectionUtility.getDerbyConnection();
		
		String derbyURL = "jdbc:derby:SampleDB;create=true";
		
		RowSetFactory fact;
		try{
			
			fact = RowSetProvider.newFactory();
			CachedRowSet rowSet = fact.createCachedRowSet();
			
			rowSet.setUrl(derbyURL);
			
			String sql = "select* from invoice";
			rowSet.setPageSize(2);
			rowSet.setCommand(sql);
			rowSet.execute();
			
			int i =1;
			
			do{
			
				System.out.println("Page==== "+ i);
			while(rowSet.next())
			
			{
				int invoicenumber = rowSet.getInt("invoiceNumber");
				String customerName = rowSet.getString("customerName");
				double amount = rowSet.getDouble("amount");
				
				Invoice inv = new Invoice(invoicenumber,customerName,amount);
				System.out.println(inv);
				
			}
			i++;
			}while(rowSet.nextPage());
			
		}
		catch(SQLException e )
		{
			e.printStackTrace();
		}

	}

}
