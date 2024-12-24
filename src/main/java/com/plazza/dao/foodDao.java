package com.plazza.dao;

import java.util.List;

import com.plazza.pojo.Food;

public interface foodDao {

	boolean addFood(Food food);
	boolean updateById(Food Food);
	boolean deleteById(int foodId);
	Food searchById(int foodId);
	List<Food>getAllfood();

}
