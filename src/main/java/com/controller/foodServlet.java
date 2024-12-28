package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.plazza.dao.foodDaoImpl;
import com.plazza.pojo.Customer;
import com.plazza.pojo.Food;

@WebServlet("/food")
public class foodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	foodDaoImpl fd = new foodDaoImpl();

	public foodServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("type/html");
		HttpSession session = request.getSession();
		String action = request.getParameter("action");

		if (action != null && action.equals("delete")) {
			int fid = Integer.parseInt(request.getParameter("foodid"));
			boolean b = fd.deleteById(fid);
			if (b) {
				response.sendRedirect("food");
			} else {
				response.sendRedirect("failed.jsp");
			}
		} else {
			List<Food> list = fd.getAllfood();
			if (list != null && !list.isEmpty()) {
				session.setAttribute("foodlist", list);
				response.sendRedirect("foodlist.jsp");
			} else {
				response.sendRedirect("failed.jsp");
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("type/html");
		String action = request.getParameter("action");

		String foodname = request.getParameter("foodname");
		String foodcategory = request.getParameter("foodcategory");
		String foodtype = request.getParameter("foodtype");
		double foodprice = Double.parseDouble(request.getParameter("foodprice"));

		if (action != null && action.equals("AddFood")) {
			boolean b = fd.addFood(new Food(foodname, foodcategory, foodtype, foodtype, foodprice));
			if (b) {
				response.sendRedirect("success.jsp");
			} else {
				response.sendRedirect("failed.jsp");
			}
		}

		if (action != null && action.equals("UpdateFood")) {
			int foodid = Integer.parseInt(request.getParameter("foodid"));

			Food f = new Food(foodname, foodcategory, foodtype, foodtype, foodprice);
			f.setFoodId(foodid);
			boolean b = fd.updateById(f);
			if (b) {
				response.sendRedirect("success.jsp");
			} else {
				response.sendRedirect("failed.jsp");
			}
		}
	}

}
