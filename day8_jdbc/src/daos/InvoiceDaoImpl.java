package com.training.daos;

import com.training.utils.ConnectionUtility;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Collection;

import org.apache.derby.impl.sql.compile.GetCurrentConnectionNode;

import com.training.ifaces.InvoiceDAO;
import com.training.utils.CustomerNameComparator;
import com.training.Invoice;
import com.training.InvoiceNumberComparator;

public class InvoiceDaoImpl implements InvoiceDAO {
	
	private List<Invoice> invList;
	private Connection derbyConnection;

	public InvoiceDaoImpl() {
		super();
		this.invList = new ArrayList<Invoice>();
		this.derbyConnection = ConnectionUtility.getDerbyConnection();
	}

	public Collection<Invoice> findAll() {
		// TODO Auto-generated method stub
		invList.clear();
		String sql = "Select * from invoice";
		PreparedStatement pstmt = null;
		try{
			pstmt = this.derbyConnection.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			ResultSetMetaData metadata = result.getMetaData();
			int columnCount = metadata.getColumnCount();
			
			for(int i =1;i<=columnCount;i++)
			{
				System.out.println("====Column : " + metadata.getColumnName(i));
			} 
			
			DatabaseMetaData dbInfo = this.derbyConnection.getMetaData();
			System.out.println("Driver Name : " + dbInfo.getDriverName());
			System.out.println("Product Version " +dbInfo.getDatabaseProductVersion());
			while(result.next())
			{
				int invoicenumber = result.getInt("invoiceNumber");
				String customerName = result.getString("customerName");
				double amount = result.getDouble("amount");
				
				Invoice inv = new Invoice(invoicenumber,customerName,amount);
				this.invList.add(inv);
			}
		}
			catch(SQLException e){
				e.printStackTrace();
			}
		
		return this.invList;
	}

	public boolean add(Invoice entity) {
		// TODO Auto-generated method stub
		String sql = "insert into invoice values(?,?,?)";
		PreparedStatement pstmt = null;
		int rowUpdated = 0;
		
		
		try
		{
			 pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1,entity.getInvoiceNumber());
			pstmt.setString(2, entity.getCustomerName());
			pstmt.setDouble(3, entity.getAmount());
			
			rowUpdated = pstmt.executeUpdate();
		} 
		
		catch(SQLException e){
			e.printStackTrace();
		} 
		finally
		{
			try{
				pstmt.close();
			} catch(SQLException e){
				e.printStackTrace();
				
			}
		}
		
		return rowUpdated ==1?true:false;
		
	} 
	

	public boolean remove(Invoice entity) {
		String sql = "delete from invoice where invoiceNumber = ?";
		PreparedStatement pstmt = null;
		int result =0;
		try{
			pstmt = this.derbyConnection.prepareStatement(sql);
			pstmt.setInt(1,entity.getInvoiceNumber());
			result = pstmt.executeUpdate();
		} 
		catch(SQLException e){
			e.printStackTrace();
		} 
		
		return result==1?true:false;


	}

	public Invoice findById(int id) {
		String sql = "Select * from invoice where invoiceNumber = ?";
		PreparedStatement pstmt = null;
		Invoice inv = null;
		try{
			pstmt = this.derbyConnection.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet result = pstmt.executeQuery();
			while(result.next())
			{
				int invoicenumber = result.getInt("invoiceNumber");
				String customerName = result.getString("customerName");
				double amount = result.getDouble("amount");
				
				inv = new Invoice(invoicenumber,customerName,amount);
				//this.invList.add(inv);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return inv;
	}

	public boolean add(Invoice... invoices) {
		boolean result = false;
		for(Invoice eachInvoice:invoices)
		{
			add(eachInvoice);
			result = true;
		}
		return result;
	}

	public boolean update(Invoice oldEntity, Invoice updatedEntity) {
		boolean result = false;
		int index = 0;
		if(this.invList.contains(oldEntity))
		{
			index = this.invList.indexOf(oldEntity);
			this.invList.set(index, updatedEntity);
			result = true;
			
		} 
		return result;
		
	}

	public Collection<Invoice> sortedByInvoiceNumber() {
		Collections.sort(this.invList);
		return this.invList;
	}


	
	}

	
	

