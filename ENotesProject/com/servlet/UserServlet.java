package com.servlet;

import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@webServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IoException
	{
		
		String name=request.getParameter("fname");
		String email=request.getParameter("uemail");
		String password=request.getParameter("upassword");

		
		UserDetails us=new UserDetails();
		us.setName(name);
		us.setEmail(email);
		us.setPassword(password);
		
		UserDao dao=new UserDao(DbConnect.getConn());
		
		boolean f=dao.addUser(us);
		PrintWriter out=response.getWriter();
		HttpSession session;

		
		if(f)
		{
			
			HttpSession session=request.getSession();
			session.setAttribute("reg-success","Registration Successfully");
			response.sendRedirect("register.jsp");
			
		}
		
		else {
			
			session=request.getSession();
			session.setAttribute("failed-msg", "Something went wrong on server");
			response.sendRedirect("register.jsp");
			
			
		}
		

	}
	
	

}
