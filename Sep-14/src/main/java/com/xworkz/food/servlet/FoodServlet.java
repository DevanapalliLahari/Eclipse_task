package com.xworkz.food.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/food",loadOnStartup = 1)
public class FoodServlet extends HttpServlet{
public FoodServlet()
{
	System.out.println("invoking the no args cons...");
}
@Override
	public void init() throws ServletException {
		System.out.println("Initilize the init in food servlet");
		super.init();
	}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("To maintain the do methods");
		super.service(req, resp);
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String type=req.getParameter("type");
	String hotelName=req.getParameter("hotel name");
	String price=req.getParameter("price");
	String quantity=req.getParameter("quantity");
	
	System.out.println(name);
	System.out.println(type);
	System.out.println(hotelName);
	System.out.println(price);
	System.out.println(quantity);
	
	
	
	
	
	req.setAttribute("Name",name);
	req.setAttribute("Type", type);
	req.setAttribute("Hotel Name", hotelName);
	req.setAttribute("price", price);
	req.setAttribute("Quantity", quantity);

	int price1=Integer.parseInt(price);
	double quantity1=Double.parseDouble(quantity);
	double  total=price1*quantity1;
	String totalAmount = String.valueOf(total);

	
	System.out.println(totalAmount);
	req.setAttribute("Total", totalAmount);
	
	RequestDispatcher dispacher=req.getRequestDispatcher("foodSuccess.jsp");
	dispacher.forward(req, resp);
	}
}
