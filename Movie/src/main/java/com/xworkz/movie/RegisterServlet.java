package com.xworkz.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/register",loadOnStartup=1)
public class RegisterServlet extends HttpServlet{
 public RegisterServlet()
{
	System.out.println("Invoking  the no-args cons");
}
 @Override
	public void init(ServletConfig config) throws ServletException {
	 System.out.println("The email,name,password are running in register Servelet");
		super.init(config);
	}
 
 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("The service is running in the register servelet");
		super.service(req, resp);
	}
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("EnterName");
		String lastName=req.getParameter("Last Name");
		String email=req.getParameter("your @gmail.com");
		String password=req.getParameter("Password");
		String re_Password=req.getParameter("Re_Password");
		String oTP=req.getParameter("OTP");
		System.out.println("name:"+name);
		System.out.println("LastName:"+lastName);

		System.out.println("email:"+email);
		System.out.println("xxxxxxx");
		System.out.println("xxxxxxx");
		System.out.println("Ener OTP:"+oTP);
		
	
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
	
	printWriter.print("<div class=\"navbar navbar-expand-sm bg-warning navbar-succes\">\r\n"
			+ "            <ul class=\"navbar-nav\">\r\n"
			+ "                <li class=\"nav-item\">\r\n"
			+ "                    <a class=\"nav-link\" href=\"movie.html\">Movie</a>\r\n"
			+ "                    </li>\r\n"
			+ "                    <li class=\"nav-item\">\r\n"
			+ "                        <a class=\"nav-link\" href=\"register.html\">Register</a>\r\n"
			+ "                    </li>\r\n"
			+ "                    <li class=\"nav-item\">\r\n"
			+ "                        <a class=\"nav-link\" href=\"index.html\">Home</a>\r\n"
			+ "                    </li>\r\n"
			+ "            </ul>\r\n"
			+ "           </div>"
			+ "");
	printWriter.print("Sucessfully saved the data");
	printWriter.print("<br> Name:"+name);
	printWriter.print("<br> Last Name:"+lastName);
	printWriter.print("<br> Enter OTP:"+oTP);
	printWriter.print("<br> Email:"+email);
	printWriter.print("<script\r\n"
			+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n"
			+ "		integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\"\r\n"
			+ "		crossorigin=\"anonymous\"></script>");
	printWriter.print("</body>");
	printWriter.print("</html>");
 }

@Override
	public void destroy() {
	 System.out.println("Delete the data");
		super.destroy();
	}
}
