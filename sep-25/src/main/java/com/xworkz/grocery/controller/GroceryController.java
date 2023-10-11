package com.xworkz.grocery.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.xworkz.grocery.dto.GroceryDto;
import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocery.repository.GroceryRepositoryImpl;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImpl;
@WebServlet(urlPatterns = { "/grocery","/total","/view"},loadOnStartup = 1)
public class GroceryController extends HttpServlet{
	
	private GroceryRepository repository=new GroceryRepositoryImpl();
	private GroceryService service=new GroceryServiceImpl(repository);
	
public GroceryController()
{
	System.out.println("invoking the no args cons in grocery servlet ");
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
	String type=req.getParameter("type");
	String price=req.getParameter("price");
	Double price1=Double.parseDouble(price);
	String quantity=req.getParameter("quantity");
	double quantity1=Double.parseDouble(quantity);
	
	
	System.out.println(name);
	System.out.println(type);
	
	System.out.println(price1);
	System.out.println(quantity1);
	
	
	
	
	
	req.setAttribute("Name",name);
	req.setAttribute("Type", type);
	req.setAttribute("price", price1);
	req.setAttribute("Quantity", quantity1);

  GroceryDto Dto=new GroceryDto(name, type, price1, quantity1);
  
  boolean stored=service.validateAndSave(Dto);
  System.out.println("Saved"+stored);
  req.setAttribute("total", this.service.total());
  RequestDispatcher dispacher=req.getRequestDispatcher("Grocery.jsp");
	dispacher.forward(req, resp);
	}	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running doGet in GroceryController");
	String uri=req.getRequestURI();
	System.out.println("URI is:"+uri);	
	if(uri.endsWith("/total"))
	{
		req.setAttribute("total",this.service.total());
		req.getRequestDispatcher("Grocery.jsp").forward(req, resp);
	}else if(uri.endsWith("/view"))
	{
		req.setAttribute("view",this.service.getAll());
		req.getRequestDispatcher("GroceryView.jsp").forward(req, resp);
	}

}
	
}
