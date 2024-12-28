<%@page import="java.util.List"%>
<%@page import="com.plazza.pojo.Customer"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerList</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<%List<Customer>l=(List)session.getAttribute("customerlist"); %>
<form action="customer">
<center><table border="2" ></center>
<caption>CustomerList</caption>
<tr>
<th>Name</th>
<th>EmailId</th>
<th>Password</th>
<th>Adress</th>
<th>Contact</th>
<th colspan="2">Action</th>
</tr>
<%Iterator<Customer>itr=l.iterator();
   while(itr.hasNext()){
	   Customer cs=itr.next();
%>
<tr>
	 <td><%=cs.getCustomerName()%></td>
	 <td><%=cs.getCustomerEmailId()%></td>
	 <td><%=cs.getPassword()%></td>
	 <td><%=cs.getCustomerAdd()%></td>
	  <td><%=cs.getCustomerContactNo()%></td>
<td>
<a href="updatecustomer.jsp?customeremailid=<%=cs.getCustomerEmailId()%>">Update</a>
<a href="customer?action=delete&customeremailid=<%=cs.getCustomerEmailId()%>">Delete</a>
</td>
</tr>
<%}%>
</table>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>