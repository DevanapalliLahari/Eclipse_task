package com.xworkz.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.app.DTO.WasteDTO;
import com.xworkz.app.repository.WasteRepository;
import com.xworkz.app.repository.WasteRepositoryImpl;
import com.xworkz.app.service.WasteService;
import com.xworkz.app.service.WasteServiceImpl;
@WebServlet(urlPatterns = "/save",loadOnStartup = 1)
public class WasteServlet extends HttpServlet{
public WasteServlet()
{
	System.out.println("Creating the servlet");
}

@Override
	public void init() throws ServletException {
		System.out.println("....");
		super.init();
	}
@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	System.out.println("To call the do methods to the  server");
		super.service(arg0, arg1);
	}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String weight=req.getParameter("weight");
		double convert=Double.parseDouble(weight);
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
		System.out.println("Weight:"+convert);
		
		req.setAttribute("Name", name);
		req.setAttribute("Type", type);
		req.setAttribute("Weight", convert);
		 WasteDTO dto=new WasteDTO(name, type, convert);
		WasteRepository repository=new WasteRepositoryImpl();
		WasteService service=new WasteServiceImpl(repository);
	   
		boolean saved=service.validateAndSave(dto);
		if(saved) {
			System.out.println("waste is saved");
			req.setAttribute("msg", "waste is  saved");
		}else {
			System.out.println("waste is not saved");
			req.setAttribute("msg", "waste is not saved");
			}
		RequestDispatcher dispacher=req.getRequestDispatcher("WasteSuccess.jsp");
		dispacher.forward(req, resp);
		}
	}

