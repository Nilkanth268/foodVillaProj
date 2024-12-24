package com.plazza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.plazza.pojo.Customer;
import com.plazza.utility.DBUtility;

public class customerDaoImpl implements customerDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;

	@Override
	public boolean addCustomer(Customer cus) {
		try {
			con = DBUtility.getConnected();
			sql = "insert into CustomerTb (customerName,customerEmailId,password,customerAdd,customerContactNo)values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, cus.getCustomerName());
			ps.setString(2, cus.getCustomerEmailId());
			ps.setString(3, cus.getPassword());
			ps.setString(4, cus.getCustomerAdd());
			ps.setDouble(5, cus.getCustomerContactNo());

			row = ps.executeUpdate();
			if (row > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean UpdateByEmailid(Customer cus) {
		try {
			con = DBUtility.getConnected();
			sql = "Update CustomerTb set customerName=?,password=?,customerAdd=?,customerContactNo=? where customerEmailId=?";
			ps = con.prepareStatement(sql);

			ps.setString(1, cus.getCustomerName());
			ps.setString(2, cus.getPassword());
			ps.setString(3, cus.getCustomerAdd());
			ps.setDouble(4, cus.getCustomerContactNo());
			ps.setString(5, cus.getCustomerEmailId());

			row = ps.executeUpdate();
			if (row > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean DeleteById(String customerEmailId) {
		try {
			con = DBUtility.getConnected();
			sql = "Delete from CustomerTb where customerEmailId=?";
			ps = con.prepareStatement(sql);

			ps.setString(1, customerEmailId);
			row = ps.executeUpdate();
			if (row > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Customer SearchById(String customeremailid) {
		Customer cus2 = null;
		try {
			con = DBUtility.getConnected();
			sql = "Select * from CustomerTb where customerEmailId=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, customeremailid);

			rs = ps.executeQuery();
			if (rs.next()) {
				cus2 = new Customer();
				cus2.setCustomerName(rs.getString("customerName"));
				cus2.setCustomerEmailId(rs.getString("customerEmailId"));
				cus2.setPassword(rs.getString("password"));
				cus2.setCustomerAdd(rs.getString("customerAdd"));
				cus2.setCustomerContactNo(rs.getDouble("customerContactNo"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cus2;
	}

	@Override
	public List<Customer> getAllcustomer() {
		List<Customer> customerlist = new ArrayList<>();
		try {
			con = DBUtility.getConnected();
			sql = "Select * from CustomerTb";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Customer cus = new Customer();
				cus.setCustomerName(rs.getString("customerName"));
				cus.setCustomerEmailId(rs.getString("customerEmailId"));
				cus.setPassword(rs.getString("password"));
				cus.setCustomerAdd(rs.getString("customerAdd"));
				cus.setCustomerContactNo(rs.getDouble("customerContactNo"));
				customerlist.add(cus);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customerlist;
	}

}
