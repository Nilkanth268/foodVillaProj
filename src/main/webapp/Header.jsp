<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
     String userEmail=(String)session.getAttribute("uemail");
     String adminEmail=(String)session.getAttribute("aemail");
%>
 
     <!--  Free CSS Template by TemplateMo.com  -->
	<div id="templatemo_container">
		<div id="templatemo_header">
			<div id="site_title"></div>
		</div>
		<!-- end of header -->

		<div id="templatemo_menu">
			<ul>
				<%if(userEmail==null && adminEmail==null){ %>
				<li class="current"></li>
				<li><a href="index.jsp"><b>Home</b></a></li>
				<li><a href="food"><b>Food List</b></a></li>
				<li><a href="login.jsp"><b>Login</b></a></li>
				<li><a href="addcustomer.jsp"><b>Register Customer</b></a></li>
				<li><a href="contactUs.jsp"><b>Contact Us</b></a></li>
				<%} %>
				
				<%if(userEmail==null && adminEmail!=null){ %>

				<li><a href="addfood.jsp"><b>Add Food</b></a></li>
				<li><a href="food"><b>Food List</b></a></li>
				<li><a href="customer"><b>Customer List</b></a></li>
				<li><a href="feedback"><b>feedback List</b></a></li>
				<li><a href="changepass.jsp"><b>Change Password</b></a></li>
				<li><a href="Login"><b>Log Out</b></a></li>
				<%} %>
				
				<%if(userEmail!=null && adminEmail==null){ %>
				
				<li><a href="food"><b>Food List</b></a></li>
				<li><a href="cart"><b>Cart List</b></a></li>
				<li><a href="addfeedback.jsp"><b>Add Feedback</b></a></li>
				<li><a href="changepass.jsp"><b>Change Password</b></a></li>
				<li><a href="updatecustomer.jsp?customeremailid=<%=userEmail%>"><b>Edit Profile</b></a></li>
				<li><a href="Login"><b>Log Out</b></a></li>
				<%} %>
			</ul>
		</div>
</body>
</html>