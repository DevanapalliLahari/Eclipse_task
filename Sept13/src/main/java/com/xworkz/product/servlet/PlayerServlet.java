package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/player",loadOnStartup = 1)
public class PlayerServlet extends HttpServlet{
public PlayerServlet()
{
	System.out.println("Invoking the no-args cons..");
}
@Override
	public void init() throws ServletException {
		System.out.println("Intilize the init in player servlet");
		super.init();
	}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("sending the data to the server");
		super.service(req, resp);
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String sport=req.getParameter("sport");
		String country=req.getParameter("country");
		String wife=req.getParameter("wife");
		String married=req.getParameter("married");
		String alive=req.getParameter("alive");
		String gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		String father=req.getParameter("father name");
		String mother=req.getParameter("mother name");
		String jersey=req.getParameter("jersey no");
		String captain=req.getParameter("captain name");
		String coach=req.getParameter("coach name");
	    String age=req.getParameter("age");
	    
	    System.out.println(name);
	    System.out.println(sport);
	    System.out.println(country);
	    System.out.println(wife);
	    System.out.println(married);
	    System.out.println(alive);
	    System.out.println(gender);
	    System.out.println(dob);
	    System.out.println(father);
	    System.out.println(mother);
	    System.out.println(jersey);
	    System.out.println(captain);
	    System.out.println(coach);
	    System.out.println(age);
	    
	    req.setAttribute("Name", name);
	    req.setAttribute("Sport", sport);
	    req.setAttribute("Country", country);
	    req.setAttribute("Wife", wife);
	    req.setAttribute("Married", married);
	    req.setAttribute("Alive", alive);
	    req.setAttribute("Gender", gender);
	    req.setAttribute("Dob", dob);
	    req.setAttribute("Father", father);
	    req.setAttribute("Mother", mother);
	    req.setAttribute("Jersey", jersey);
	    req.setAttribute("Captain", captain);
	    req.setAttribute("Coach", coach);
	    req.setAttribute("Age", age);
	    
	    RequestDispatcher dispacher=req.getRequestDispatcher("playerSuccess.jsp");
		dispacher.forward(req, resp);
		}
	@Override
		public void destroy() {
			System.out.println("Delete the data");
			super.destroy();
		}
	    
				
	
}
