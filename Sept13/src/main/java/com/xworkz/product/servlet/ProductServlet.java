package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/product",loadOnStartup = 1)
public class ProductServlet extends HttpServlet{
public ProductServlet()
{
	System.out.println("Invoking the no-args cons....");
}
@Override
	public void init() throws ServletException {
	System.out.println("Initilize the init in product Servlet");
		super.init();
	}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("send the service to  the product Service");
		super.service(req, resp);
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("Name");
	String price=req.getParameter("price");
	String type=req.getParameter("type");
	String quantity=req.getParameter("quantity");
	
	System.out.println("Name:"+name);
	System.out.println("Price:"+price);
	System.out.println("type:"+type);
	System.out.println("Quantity:"+quantity);
	
	req.setAttribute("Name", name);
	req.setAttribute("Price", price);
	req.setAttribute("Type", type);
	req.setAttribute("Quantity", quantity);
	
	RequestDispatcher dispacher=req.getRequestDispatcher("productSuccess.jsp");
	dispacher.forward(req, resp);
	}
@Override
	public void destroy() {
		System.out.println("Delete the data");
		super.destroy();
	}
}
