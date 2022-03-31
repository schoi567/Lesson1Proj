package com.view.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

 

import Product.Product;

 

public class productDAO {
	private static Connection getConnection() {
		Connection con=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			//Step 2: Database information 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root","12345678");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}

		public Product getProductId(int ProIDNo) {

			
			Product product =null;
			try {
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("Select * from productdetails where ProductID=?");
				ps.setInt(1, ProIDNo);
				ResultSet rs=ps.executeQuery();
				
				if(rs.next())
				{	
					product = new Product(rs.getInt(1),rs.getString(2),rs.getString(3));
					}
			 
				con.close(); 
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return product; }
		
		
		
		
		public ArrayList<Product> getRecords() {
			ArrayList<Product> list=new ArrayList<>();
			try {
				Connection con=getConnection();
		 
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from productdetails");
		 
				while(rs.next()) {
					 
					list.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3)));
		 
					
				}
				stmt.close();
				con.close();
			}
				catch(Exception e) {
				e.printStackTrace();
			}
			return list;
		}
		
		

}

	

