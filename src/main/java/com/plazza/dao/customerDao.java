package com.plazza.dao;

import java.util.List;

import com.plazza.pojo.Customer;

public interface customerDao {
	
	boolean addCustomer (Customer cus);
	boolean UpdateByEmailid (Customer cus);
	boolean DeleteById (String customeremailid);
	Customer SearchById (String customeremailid);
	List<Customer>getAllcustomer();

	

}
