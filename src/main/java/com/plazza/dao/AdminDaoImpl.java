package com.plazza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.plazza.pojo.AdiminLogin;
import com.plazza.utility.DBUtility;

public class AdminDaoImpl implements AdminDao {
	Connection con;
	PreparedStatement ps;
	String sql;
	ResultSet rs;
	int row;
	

	@Override
	public boolean userLogin(String UEmailid, String Upassword) {
		try {
			con=DBUtility.getConnected();
			sql="Select*from CustomerTb where customerEmailId=? and password_1=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, UEmailid);
			ps.setString(2, Upassword);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean userChangePassword(String UEmailid, String newUpassword) {
		try {
			con=DBUtility.getConnected();
			sql="Update CustomerTb set password_1=? where customerEmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, newUpassword);
			ps.setString(2, UEmailid);
			row=ps.executeUpdate();
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean AdminLogin(String Emailid, String password) {
		try {
			con=DBUtility.getConnected();
			sql="select*from AdminLoginTb where AdminEmailId=? and password_1=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, Emailid);
			ps.setString(2, password);
		      rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean AdminChangePassword(String Emailid, String newpassword) {
		try {
			con=DBUtility.getConnected();
			 sql="Update AdminLoginTb set password_1=? where AdminEmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, newpassword);
			ps.setString(2, Emailid);
		 row=ps.executeUpdate();
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	

}
