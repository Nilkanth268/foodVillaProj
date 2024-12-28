<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<form action="customer" onsubmit="return AddCustomerValidation()" method="post">
<center><table border="2"></center>
<caption>ADD Customer</caption>
<tr>
<th>Customer Name:</th>
<th><input type="text" name="customername" id="customername" placeholder="Enter Customer Name"></th>
<th><span id="customernamer" style="color:red;"></span></th>
</tr>

<tr>
<th>Customer EmailId:</th>
<th><input type="text" name="customeremailid" id="customeremailid" placeholder="Enter Customer Emailid"></th>
<th><span id="customeremailidr" style="color:red;"></span></th>
</tr>

<tr>
<th>Password:</th>
<th><input type="text" name="password" id="password" placeholder="Enter Password"></th>
<th><span id="passwordr" style="color:red;"></span></th>
</tr>

<tr>
<th>Customer Add:</th>
<th><input type="text" name="customeradd" id="customeradd" placeholder="Enter Customer Add"></th>
<th><span id="customeraddr" style="color:red;"></span></th>
</tr>

<tr>
<th>Customer Contact:</th>
<th><input type="text" name="customercontactno" id="customercontactno" placeholder="Enter Customer Contact"></th>
<th><span id="customercontactnor" style="color:red;"></span></th>
</tr>
</table>
<br>
<button type="submit" name="action" value="AddCustomer">Add Customer</button>
<button type="reset">Reset</button>
</form>
<script type="text/javascript">
function AddCustomerValidation(){
	cn=document.getElementById("customername").value;
	if(cn==""){
		document.getElementById("customernamer").innerHTML="Please Enter CustomerName";
		return false;
	}
	
	ce=document.getElementById("customeremailid").value;
	if(ce==""){
		document.getElementById("customeremailidr").innerHTML="Please Enter CustomerEmailId";
		return false;
	}
	
	pa=document.getElementById("password").value;
	if(pa==""){
		document.getElementById("passwordr").innerHTML="Please Enter Password";
		return false;
	}
	
	ca=document.getElementById("customeradd").value;
	if(ca==""){
		document.getElementById("customeraddr").innerHTML="Please Enter CustomerAddress";
		return false;
	}
	
	cno=document.getElementById("customercontactno").value;
	if(cno==""){
		document.getElementById("customercontactnor").innerHTML="Please Enter CustomerNo";
		return false;
	}
	return true
}
</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>