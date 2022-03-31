package com.view.validate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import com.view.control.productDAO;

import Product.Product;

 
@WebServlet("/ViewRecords")
public class ViewRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ViewRecords() {
        super();
 
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read data from ArrayList
		try{ ArrayList<Product> list=new productDAO().getRecords();
		PrintWriter out=response.getWriter();
		out.println("<table border=2>");
		for(Product product:list) 
		{
			out.println("<tr><td>"+product.getProductID()+
					"</td><td> "+product.getProductName()+
					"</td><td> "+product.getProductionDate()+"</td> ");}
		
		out.println("</table>");}
		catch(Exception e) {
		e.printStackTrace();
	}
}

	}

 
	 
 
