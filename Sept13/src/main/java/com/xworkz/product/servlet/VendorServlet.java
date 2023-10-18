package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/vendor",loadOnStartup = 1)
public class VendorServlet extends HttpServlet{
public VendorServlet()
{
	System.out.println("Invoking the no-args cons...");
}
@Override
	public void init() throws ServletException {
	System.out.println("Initilizze the init in vendor servlet");
		super.init();
	}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Sending the innformation");
		super.service(req, resp);
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String gst=req.getParameter("gst");
		String owner=req.getParameter("owner");
		String location=req.getParameter("location");
		
		System.out.println("Name:"+name);
		System.out.println("Gst:"+gst);
		System.out.println("Owner:"+owner);
		System.out.println("Location:"+location);
		
		req.setAttribute("Name",name);
		req.setAttribute("Gst",gst);
		req.setAttribute("Owner",owner);
		req.setAttribute("Location",location);
		
		RequestDispatcher dispacher=req.getRequestDispatcher("vendorSuccess.jsp");
		dispacher.forward(req, resp);
	}
@Override
	public void destroy() {
	System.out.println("Delete the data");
		super.destroy();
	}
}
