package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.service.TempleServiceImpl;


@WebServlet(urlPatterns = {"/save","/total","/view"},loadOnStartup = 12)
public class TempleController extends HttpServlet{
TempleRepository repository=new TempleRepositoryImpl();
TempleService service=new TempleServiceImpl(repository);
public TempleController()
{
	System.out.println("Creaate the servlet");
}
@Override
public void init() throws ServletException {
System.out.println("Initilize the init in grocery servlet");
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
		String place=req.getParameter("place");
		String god=req.getParameter("mainGod");
		String year=req.getParameter("year");
		int convertTo=Integer.parseInt(year);
		String cons=req.getParameter("constBy");
		
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
		System.out.println("MainGod:"+god);
		System.out.println("Year:"+convertTo);
		System.out.println("ConsBy:"+cons);
		
		TempleDTO DTO=new TempleDTO(name, place, god, convertTo, cons);
		boolean saved=service.validateAndSave(DTO);
		 System.out.println("Saved"+saved);
		  req.setAttribute("total", this.service.total());
		  RequestDispatcher dispacher=req.getRequestDispatcher("Temple.jsp");
			dispacher.forward(req, resp);
			}	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running doGet in TempleController");
			String uri=req.getRequestURI();
			System.out.println("URI is:"+uri);	
			if(uri.endsWith("/total"))
			{
				req.setAttribute("total",this.service.total());
				req.getRequestDispatcher("Temple.jsp").forward(req, resp);
			}else if(uri.endsWith("/view"))
			{
				req.setAttribute("view",this.service.getAll());
				req.getRequestDispatcher("TempleView.jsp").forward(req, resp);
			}
	}
}
