package com.plazza.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.plazza.dao.foodDaoImpl;
import com.plazza.pojo.Food;
import com.plazza.utility.DBUtility;

public class FoodTest {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		InputStreamReader ins= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);
		foodDaoImpl fimpl = new foodDaoImpl();
		
		
		
		int foodId;
		String foodName , foodType, foodCategory ,foodDescription
		,foodImg;
		
		double foodPrice;
		int choice;
		
		
		while(true) {
		
		System.out.println("Enter your Choice :");
		
		System.out.println("1.Add Food \n 2.Update Food \n 3.Delete Food \n 4.Search Food by id \n 5.Get all Food Item \n 6.Exit");
		choice =sc.nextInt();
		
	
		
		switch(choice) {
		
		
		case 1:
		
			try {
				
				//System.out.println("Enter the FoodID :");
				//food_id =sc.nextInt();
				
				System.out.println("Enter the Food Name :");
				foodName = br.readLine();
				
				System.out.println("Enter the Food Type :");
				foodType = br.readLine();
				
				System.out.println("Enter the Food Category :");
				foodCategory = br.readLine();
				
				System.out.println("Enter the Food Description :");
				foodDescription = br.readLine();
				
				System.out.println("Enter the Food Price :");
				foodPrice = sc.nextDouble();
				
				System.out.println("Enter the Food Image :");
				foodImg = br.readLine();
				
				Food fd = null;
				
				Connection con = DBUtility.getConnected();
				
				fd= new Food(foodName, foodCategory, foodType, foodImg, foodPrice);
				
				boolean b =fimpl.addFood(fd);
				
				if(b) {
					System.out.println("Added Successfully");
				}else {
					System.out.println("Adding Failed");
				}
				
				
				
			}catch (IOException e) {
				// TODO: handle exception
			}		
		
		break;
		
		
		case 2:
			try {
			System.out.println("Enter the Existing ID");
			foodId = sc.nextInt();
			
			System.out.println("Entr the Food NAme to update: ");
			foodName = br.readLine();
			
			System.out.println("Enter the Food Type to update :");
			foodType = br.readLine();
			
			System.out.println("Enter the Food Category to update:");
			foodCategory = br.readLine();
			
			System.out.println("Enter the Food Description to update:");
			foodDescription = br.readLine();
			
			System.out.println("Enter the Food Price to update:");
			foodPrice = sc.nextDouble();
			
			System.out.println("Enter the Food Image to update:");
			foodImg = br.readLine();
					
			Food fd = null;
			
			fd= new Food(foodName, foodCategory, foodType, foodImg, foodPrice);
			fd.setFoodId(foodId);
			boolean b = fimpl.updateById(fd);
			if(b) {
				System.out.println("Update Successfull");
			}else {
				System.out.println("Update Failed");
			}
					
			}catch (IOException e) {
				// TODO: handle exception
			}
			break;
		
			
		case 3:
			
			System.out.println("Enter the food_id to be delete :");
			foodId = sc.nextInt();
			
			Food fd= null;
			
			fd=new Food();
			boolean b  =fimpl.deleteById(foodId);
			
			
			
			if(b) {
				System.out.println("Delete Successfull");
			}else {
				System.out.println("Delete Failed!");
			}
			
			
			
			break;
			
		case 4:
			
			System.out.println("Enter the id which data you want :");
			foodId =sc.nextInt();
			
			
			Food fd1=fimpl.searchById(foodId);
			
			if(fd1!=null) {
				System.out.println(fd1);
			}else {
				System.out.println("Failed");
			}
			 
			break;
			
		case 5:
			
			System.out.println("Showing all Customer !!!");
			List<Food>alist =fimpl.getAllfood();
			Iterator<Food> it = alist.iterator();
			
			while(it.hasNext()) {
				
				System.out.println(it.next());
			}
			
			
			break;
			
		case 6:
			System.out.println("Thank you");
			System.exit(0);
			
			break;
		}
		
		
		
		
		}
		
		
	}

}
