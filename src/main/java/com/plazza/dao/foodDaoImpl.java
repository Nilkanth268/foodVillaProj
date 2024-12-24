package com.plazza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.plazza.pojo.Food;
import com.plazza.utility.DBUtility;

public class foodDaoImpl implements foodDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;

	@Override
	public boolean addFood(Food food) {
		try {
			con = DBUtility.getConnected();
			sql = "insert into Food(foodName ,foodCategory ,foodType ,foodPrice , foodImg)values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, food.getFoodName());
			ps.setString(2, food.getFoodCategory());
			ps.setString(3, food.getFoodType());
			ps.setDouble(4, food.getFoodPrice());
			ps.setString(5, food.getFoodImg());
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
	public boolean updateById(Food food) {
		try {
			con = DBUtility.getConnected();
			sql = "Update food set foodname=?,foodcategory=?,foodtype=?,foodprice=? where foodid=?";
			ps = con.prepareStatement(sql);

			ps.setString(1, food.getFoodName());
			ps.setString(2, food.getFoodCategory());
			ps.setString(3, food.getFoodType());
			ps.setDouble(4, food.getFoodPrice());
			ps.setInt(5, food.getFoodId());
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
	public boolean deleteById(int foodId) {
		try {
			con = DBUtility.getConnected();
			sql = "Delete From food where foodid=?";
			ps = con.prepareStatement(sql);

			ps.setInt(1, foodId);
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
	public Food searchById(int foodid) {
		Food food2 = null;
		try {
			con = DBUtility.getConnected();
			sql = "Select*from food where foodid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, foodid);
			rs = ps.executeQuery();
			while (rs.next()) {
				food2 = new Food();
				food2.setFoodId(rs.getInt("foodid"));
				food2.setFoodName(rs.getString("foodname"));
				food2.setFoodCategory(rs.getString("foodcategory"));
				food2.setFoodType(rs.getString("foodtype"));
				food2.setFoodPrice(rs.getDouble("foodprice"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return food2;
	}

	@Override
	public List<Food> getAllfood() {
		List<Food> foodlist = new ArrayList<>();
		try {
			con = DBUtility.getConnected();
			sql = "Select * from food";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Food food = new Food();
				food.setFoodId(rs.getInt("foodid"));
				food.setFoodName(rs.getString("foodname"));
				food.setFoodCategory(rs.getString("foodcategory"));
				food.setFoodType(rs.getString("foodtype"));
				food.setFoodPrice(rs.getDouble("foodprice"));
				foodlist.add(food);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foodlist;
	}

}
