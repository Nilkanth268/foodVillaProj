package com.plazza.test;

import java.sql.Connection;

import com.plazza.utility.DBUtility;

public class ConnectivityTest {

	public static void main(String[] args) {
		
	
	Connection con = DBUtility.getConnected();
	
	
	if(con !=null) {
		System.out.println("Done");
	}
	else {
		System.out.println("Failed");
	}
	
	}
}
