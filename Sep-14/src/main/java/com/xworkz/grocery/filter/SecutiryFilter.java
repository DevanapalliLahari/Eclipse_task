package com.xworkz.grocery.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/*")
public class SecutiryFilter implements Filter {

	public SecutiryFilter() {
		System.out.println("Create SecurityFilter...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Runnning do filter in SecurityFilter...");
	
  HttpServletRequest req=(HttpServletRequest) request;
  HttpServletResponse res=(HttpServletResponse) response;
  String uri=req.getRequestURI();
  System.out.println("the uri  is:"+uri);
  if(uri.endsWith("login")||uri.endsWith("/")||uri.endsWith("index.jsp")||uri.endsWith("Login.jsp"))
  {
	  System.out.println("uri default or index");
	  if(uri.endsWith("login"))
	  {
		  String name=req.getParameter("name");
		  String password=req.getParameter("password");
		  if(name.equals("Xworkz")&&password.equals("btm"))
		  {
			  System.out.println("User valid go togrocery save");
			  Cookie cookie=new Cookie("Xworkz",String.valueOf(Math.random()));
			  res.addCookie(cookie);
			  res.sendRedirect("Grocery.jsp");
			  return;
		  }
		  else
		  {
			  req.setAttribute("errror", "UserId or password is not maching");
			  res.sendRedirect("Login.jsp");
			  return;
		  }
	  }
	  chain.doFilter(request,response);
  }
  else
  {
	  Cookie[]cookies=req.getCookies();
	  for(Cookie cookie:cookies) {
		  if(cookie.getName().equals("Xworkz"))
{
	System.out.println("User already logged in");
	return;
}
	  }
	  System.err.println("You con't access the page");
	  res.sendRedirect("Login.jsp");
  }

	}

}
