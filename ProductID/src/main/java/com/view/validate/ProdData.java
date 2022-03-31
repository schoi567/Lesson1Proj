package com.view.validate;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.view.control.productDAO;

import Product.Product;

@WebServlet("/ProdData")
public class ProdData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ProdData() {
        super();
      
    }
   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		
		
		try {int ProIDNo=Integer.parseInt(request.getParameter("ProIDNo"));
		Product product =new productDAO().getProductId(ProIDNo);
    	
		if(product != null)
    		{response.getWriter().println("Record found");
    	
  
    	PrintWriter out=response.getWriter();
    	out.println("<table border=2>");
	 
		out.println("<tr><td>" + product.getProductID() + "</td><td>" 
			+product.getProductName()+ "</td><td>" + product.getProductionDate()+"</td>");   

		out.println("</table>");
		return; 
    		
    		}
		else if (product == null)
			{response.getWriter().println("Record not found");} 
    	
		
		}
		
catch(Exception e) {e.printStackTrace();}  
		
		response.getWriter().println("Please type in valid int ");}


	
		
	
	
	
	}
 