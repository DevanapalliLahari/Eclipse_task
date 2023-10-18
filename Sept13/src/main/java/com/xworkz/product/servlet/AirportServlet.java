package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/airport",loadOnStartup = 1)
public class AirportServlet extends HttpServlet{
public AirportServlet()
{
	System.out.println("Invoking the no-args cons...");
}
@Override
	public void init() throws ServletException {
		System.out.println("intilize the init in airport servlet");
		super.init();
	}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Sending the data to the server");
		super.service(req, resp);
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String type=req.getParameter("type");
		String city=req.getParameter("city");
		String capacity=req.getParameter("capacity");
		String width=req.getParameter("width");
		String terminal=req.getParameter("terminal");
		String open=req.getParameter("open date");
		String operation=req.getParameter("operation");
		String ingrauted=req.getParameter("ingrauted");
		
		
		System.out.println(name);
		System.out.println(country);
		System.out.println(type);
		System.out.println(city);
		System.out.println(capacity);
		System.out.println(width);
		System.out.println(terminal);
		System.out.println(open);
		System.out.println(operation);
		System.out.println(ingrauted);
		
		req.setAttribute("Name", name);
		req.setAttribute("Country", country);
		req.setAttribute("Type", type);
		req.setAttribute("City", city);
		req.setAttribute("Capacity", capacity);
		req.setAttribute("Width", width);
		req.setAttribute("Terminal", terminal);
		req.setAttribute("Open", open);
		req.setAttribute("Operation", operation);
		req.setAttribute("Ingrauted", ingrauted);
		
		
		RequestDispatcher dispacher=req.getRequestDispatcher("airportSuccess.jsp");
		dispacher.forward(req, resp);
	}
@Override
	public void destroy() {
		System.out.println("delete the data");
		super.destroy();
	}
}
