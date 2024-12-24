package com.plazza.pojo;

public class oder {
    private int orderid;
	private String emailid,date;
	private double totalprice;
	
	public oder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public oder( String emailid, String date, double totalprice) {
		super();
		
		this.emailid = emailid;
		this.date = date;
		this.totalprice = totalprice;
	}

	public int getOrderid() {
		
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "oder [orderid=" + orderid + ", emailid=" + emailid + ", date=" + date + ", totalprice=" + totalprice
				+ "]";
	}

}
