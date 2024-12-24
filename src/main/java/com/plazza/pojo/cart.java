package com.plazza.pojo;

public class cart {
       
	private int cartid,foodid,foodprice,quantity,totalprice;
	private String email,foodname;
	
	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cart(int foodid, int foodprice, int quantity, int totalprice, String email, String foodname) {
		super();
		this.foodid=foodid;
		this.foodprice = foodprice;
		this.quantity = quantity;
		this.totalprice = totalprice;
		this.email = email;
		this.foodname = foodname;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public int getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	@Override
	public String toString() {
		return "cart [foodid=" + foodid + ", foodprice=" + foodprice + ", quantity=" + quantity + ", totalprice="
				+ totalprice + ", email=" + email + ", foodname=" + foodname + "]";
	}
	
	

}
