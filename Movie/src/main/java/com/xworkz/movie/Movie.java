package com.xworkz.movie;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns ="/plan" )
public class Movie extends HttpServlet{
public Movie()
{
	System.out.println("Invoking the no args cons......");
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("Movie name");
		String lang=req.getParameter("Movie Lang");
		String director=req.getParameter("Movie Director");
		String producer=req.getParameter("Movie Producer");
		String  budget=req.getParameter("Movie Budget");
		String date=req.getParameter("Movie Release date");
		
		System.out.println(name);
		System.out.println(lang);
		System.out.println(director);
		System.out.println(producer);
		System.out.println(budget);
		System.out.println(date);
		
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		printWriter.print("<title></title>");
		printWriter.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n"
				+"");
		printWriter.print("</head>");
		printWriter.print("<body>");
		
		printWriter.print("<nav class=\"navbar bg-primary\" data-bs-theme=\"dark\">\r\n"
				+ "    <ul class=\"nav nav-pills card-header-pills\">\r\n"
				+ "    <li class=\"nav-item\">\r\n"
				+ "        <a class=\"nav-link active\" href=index.html>Home</a></br>\r\n"
				+ "       \r\n"
				+ "      </li>\r\n"
				+ "      <li class=\"nav-item\">\r\n"
				+ "        <a class=\"nav-link active\" href=movie.html>Movie</a>\r\n"
				+ "      </li>\r\n"
				+ "    </ul>\r\n"
				+ "  </nav>\r\n"
				+ "\r\n"
				+ "");
		printWriter.print("Sucessfully saved the data");
		printWriter.print("<br> Movie name:"+name);
		printWriter.print("<br> Movie Lang:"+lang);
		printWriter.print("<br> Movie Director:"+director);
		printWriter.print("<br> Movie Producer:"+producer);
		printWriter.print("<br> Movie Budget:"+budget);
		printWriter.print("<br> Movie Realeased Date:"+date);
		printWriter.print("<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		
	}
}