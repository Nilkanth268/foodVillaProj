package com.plazza.pojo;

public class Customer {

	private String customerName, customerEmailId, password, customerAdd;
	private double customerContactNo;

	public Customer(String customerName, String customerEmailId, String password, String customerAdd,
			double customerContactNo) {
		super();
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.password = password;
		this.customerAdd = customerAdd;
		this.customerContactNo = customerContactNo;
	}

	public Customer() {
		super();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerAdd() {
		return customerAdd;
	}

	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}

	public double getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(double customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerEmailId=" + customerEmailId + ", password="
				+ password + ", customerAdd=" + customerAdd + ", customerContactNo=" + customerContactNo + "]";
	}

}
