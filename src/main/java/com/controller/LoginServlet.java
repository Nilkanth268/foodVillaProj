package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.plazza.dao.AdminDaoImpl;
import com.plazza.pojo.feedback;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       AdminDaoImpl ad= new AdminDaoImpl();
 
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.invalidate();
		response.sendRedirect("index.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String type=request.getParameter("type");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String action=request.getParameter("action");
		
		if(action!=null && action.equals("Login")) {
			
			if(type.equals("admin")) {
				System.out.println("Admin login called...");
				boolean b=ad.AdminLogin(email, pass);	
				if(b) {
					session.setAttribute("aemail", email);
					response.sendRedirect("index.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
			if(type.equals("user")) {
				System.out.println("User login called..");
				System.out.println(email + ","+pass);
				boolean b=ad.userLogin(email, pass);
				if(b) {
					session.setAttribute("uemail", email);
					response.sendRedirect("index.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
		}else if(action!=null && action.equals("Changepass")) {
			String npass=request.getParameter("npass");
			
			if(type.equals("admin")) {
				boolean b=ad.AdminChangePassword(email, pass);
				if(b) {
					response.sendRedirect("success.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
			
			if(type.equals("user")) {
				boolean b=ad.userChangePassword(email, pass);
				if(b) {
			
					response.sendRedirect("success.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
		}
			
			
		
		
	}

}
