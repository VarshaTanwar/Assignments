package com.training;
import java.sql.*;

import org.apache.derby.client.am.SqlException;

import com.training.utils.ConnectionUtility;

public class Transaction {

	public static void main(String[] args) {
		
		Connection con = ConnectionUtility.getDerbyConnection();
		Savepoint point1;
		
		try {
			con.setAutoCommit(false);
			
			String sqlOne = "insert into invoice values (?,?,?)";
			String sqlTwo = "insert into invoice values (?,?,?)";
			
			
			PreparedStatement pstmt = null;
			PreparedStatement pstmt2 = null;
			int rowUpdated  = 0;
			
				pstmt = con.prepareStatement(sqlOne);
				
				pstmt.setInt(1,183);
				pstmt.setString(2,"JOeyy");
				pstmt.setDouble(3,233);
				pstmt.executeUpdate();
				
			 point1 = con.setSavepoint("savepointt");
				
pstmt2 = con.prepareStatement(sqlTwo);
				
				pstmt2.setInt(1,133);
				pstmt2.setString(2,"DOeyy");
				pstmt2.setDouble(3,533);
				pstmt2.executeUpdate();
				
				con.commit();
			
		} catch (SQLException e) {
			try{
				//con.rollback(point1);
				con.commit();
				System.out.println("rolling back");
			} 
			catch(SQLException e1){
				e1.printStackTrace();
				
			} 			
			
		}
	}

}
