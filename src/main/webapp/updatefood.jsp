<%@page import="com.plazza.pojo.Food"%>
<%@page import="com.plazza.dao.foodDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Food</title>
<script type="text/javascript" src="Validation.js"></script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<%
    foodDaoImpl fd=new foodDaoImpl();
    int foodid=Integer.parseInt(request.getParameter("foodid"));
    Food f=fd.searchById(foodid);
    
%>
<form action="food" onsubmit="return UpdateFoodValidation()" method="post">
<center><table border="2"></center>
<caption>Update FOOD</caption>
<tr>
<th>Food Id:</th>
<th><input type="text" name="foodid" id="foodid" placeholder="Enter food Id" value="<%=f.getFoodId()%>"></th>
<th><span id="foodidr" style="color:red;"></span></th>
</tr>

<tr>
<th>Food Name:</th>
<th><input type="text" name="foodname" id="foodname" placeholder="Enter food name" value="<%=f.getFoodName()%>"></th>
<th><span id="foodnamer" style="color:red;"></span></th>
</tr>

<tr>
<th>Food Category:</th>
<th><input type="text" name="foodcategory" id="foodcategory" placeholder="Enter food category" value="<%=f.getFoodCategory()%>"></th>
<th><span id="foodcategoryr" style="color:red;"></span></th>
</tr>

<tr>
<th>Food Type:</th>
<th><input type="text" name="foodtype" id="foodtype" placeholder="Enter food type" value="<%=f.getFoodType()%>"></th>
<th><span id="foodtyper" style="color:red;"></span></th>
</tr>

<tr>
<th>Food Price:</th>
<th><input type="text" name="foodprice" id="foodprice" placeholder="Enter food Price" value="<%=f.getFoodPrice()%>"></th>
<th><span id="foodpricer" style="color:red;"></span></th>
</tr>
</table>
<button type="submit" name="action" value="UpdateFood">Update Food</button>
<button type="reset">Reset</button>
</form>

<script type="text/javascript">
function UpdateFoodValidation(){
	fn=document.getElementById("foodname").value;
	if(fn==""){
		document.getElementById("foodnamer").innerHTML="Please Enter FoodName";
		return false;
	}
	
	fc=document.getElementById("foodcategory").value;
	if(fc==""){
		document.getElementById("foodcategoryr").innerHTML="Please Enter FoodCategory";
		return false;
	}
	
	ft=document.getElementById("foodtype").value;
	if(ft==""){
		document.getElementById("foodtyper").innerHTML="Please Enter Foodype";
		return false;
	}
	
	fp=document.getElementById("foodprice").value;
	if(fp==""){
		document.getElementById("foodpricer").innerHTML="Please Enter FoodPrice";
		return false;
	}
	
	return true;
}


</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>