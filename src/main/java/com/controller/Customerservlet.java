package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.plazza.dao.customerDaoImpl;
import com.plazza.pojo.Customer;
import com.plazza.pojo.Food;

@WebServlet("/customer")
public class Customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       customerDaoImpl cd=new customerDaoImpl();
   
    public Customerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("type/html");
		HttpSession session=request.getSession();
		String action=request.getParameter("action");
		String fid=request.getParameter("customeremailid");
		if(action!=null && action.equals("delete")) {
			boolean b=cd.DeleteById(fid);
			if(b) {
				response.sendRedirect("customer");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
		else {
			List<Customer>list=cd.getAllcustomer();
			if(list!=null && !list.isEmpty()) {
				session.setAttribute("customerlist", list);
				response.sendRedirect("customerlist.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("type/html");
		String action=request.getParameter("action");
		
		String customername=request.getParameter("customername");
		String customeremailid=request.getParameter("customeremailid");
		String password=request.getParameter("password");
		String customeradd=request.getParameter("customeradd");
		double customercontactno=Double.parseDouble(request.getParameter("customercontactno"));
		
		if(action!=null && action.equals("AddCustomer")) {
			boolean b=cd.addCustomer(new Customer(customername,customeremailid,password,customeradd,customercontactno));
			if(b) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		
		}
		
		if(action!=null && action.equals("UpdateCustomer")) {
			
			boolean b=cd.UpdateByEmailid(new Customer(customername,customeremailid,password,customeradd,customercontactno));
			if(b) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
	}}
		
	


