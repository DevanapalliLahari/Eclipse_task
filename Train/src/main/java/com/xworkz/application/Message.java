package com.xworkz.application;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/domain")
public class Message extends HttpServlet{
public Message()
{
	System.out.println("Invoking the no args cons...");
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	{
		System.out.println("invoking the method in to the message");
		String names= req.getParameter("name");
		String msgs= req.getParameter("msg");
		System.out.println(names);
		System.out.println(msgs);
	}

}
}
