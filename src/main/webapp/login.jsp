<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<script type="text/javascript" src="Validation.js"></script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<form action="Login" onsubmit="return LoginValidation()" method="post">
<center><table border="2"></center>
<caption>Log In</caption>
<tr>
<th>
<select name="type" id="type">
<option>Select</option>

<option value="admin">Admin</option>
<option value="user">User</option>
</select></th>
<th><span id="selecterror" style="color: red;"></span></th>
</tr>

<tr>
<th>Email id:</th>
<th><input type="email" name="email" id="email" placeholder="Enter the email"></th>
<th><span id="emailr" style="color:red;"></span></th>
</tr>

<tr>
<th>Password:</th>
<th><input type="password" name="pass" id="pass" placeholder="Enter the Password "></th>
<th><span id="passr" style="color:red;"></span></th>
</tr>




</table>
<button type="submit" name="action" value="Login">Log In</button>
<button type="reset">Reset</button>
</form>
<script type="text/javascript">

function LoginValidation(){
	type=document.getElementById("type").value;
	if(type.selectedIndex<0){
		document.getElementById("selecterror").innerHTML="Please Select Type";
		return false;
	}
	
	
	email=document.getElementById("email").value;
	if(email==""){
		document.getElementById("emailr").innerHTML="Please Enter Email";
		return false;
	}
	
	if(email.indexOf('@')<0 || email.indexOf('.')<0){
		document.getElementById("emailr").innerHTML="Please Enter Valid Email";
		return false;
	}
	
	
	pa=document.getElementById("pass").value;
	if(pa==""){
		document.getElementById("passr").innerHTML="Please Enter Password";
		return false;
	}
	
	if(pa.length<8){
		document.getElementById("passr").innerHTML="Please Enter Valid Password";
		return false;
	}
	
	return true;
}

</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>