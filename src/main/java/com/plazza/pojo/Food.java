package com.plazza.pojo;

public class Food {

	private int foodId;
	private String foodName, foodCategory, foodType, foodImg;
	private double foodPrice;

	public Food() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodCategory=" + foodCategory + ", foodType="
				+ foodType + ", foodImg=" + foodImg + ", foodPrice=" + foodPrice + "]";
	}

	public Food( String foodName, String foodCategory, String foodType, String foodImg, double foodPrice) {
		super();
	
		this.foodName = foodName;
		this.foodCategory = foodCategory;
		this.foodType = foodType;
		this.foodImg = foodImg;
		this.foodPrice = foodPrice;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getFoodImg() {
		return foodImg;
	}

	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	
}