package com.plazza.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
	
	public static Connection getConnected() {
		
		Connection con=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neeldatabase","root","root123");
			
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return con;
		
		
	}

}
