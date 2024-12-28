<%@page import="java.util.Iterator"%>
<%@page import="com.plazza.pojo.Food"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FoodList</title>
</head>
<jsp:include page="Header.jsp"></jsp:include>
<body>

<% 
String uemail=(String)session.getAttribute("uemail");
String aemail=(String)session.getAttribute("aemail");
List<Food>l=(List)session.getAttribute("foodlist");
%>
<form action="food">
<center><table border="2" ></center>
<caption>Foodlist</caption>
<tr>
<th>Food Id</th>
<th>Food Name</th>
<th>Food Category</th>
<th>Food Type</th>
<th>Food Price</th>
<%if(uemail==null && aemail!=null){%>
<th colspan="2">Action</th>
<%}%>
<%if(uemail!=null && aemail==null){%>
<th>Action</th>
<%}%>
</tr>

<%Iterator<Food>itr=l.iterator();
  while(itr.hasNext()){
	  Food f=itr.next();
	  %>
	 <tr>
	 <td><%=f.getFoodId()%></td>
	 <td><%=f.getFoodName()%></td>
	 <td><%=f.getFoodType()%></td>
	 <td><%=f.getFoodCategory()%></td>
	  <td><%=f.getFoodPrice()%></td>
	  
	  <%if(uemail==null && aemail!=null){%>
	  <td>
	  <a href="updatefood.jsp?foodid=<%=f.getFoodId()%>">Update</a>
	   <a href="food?action=delete&foodid=<%=f.getFoodId()%>">Delete</a>
	   </td>
	   <%}%>
	   <%if(uemail!=null && aemail==null){%>
	    <td>
	  <a href="addcart.jsp?foodid=<%=f.getFoodId()%>">Add</a>
	  </td>
	  <%}%>
	 </tr>
	  <%}%>


</table>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>