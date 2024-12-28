<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Feedback</title>
<script type="text/javascript" src="Validation.js"></script>
</head>
<center><body></center>
<jsp:include page="Header.jsp"></jsp:include>
<form action="feedback" onsubmit="return AddFeedbackValidation()" method="post">
<table border="2">
<caption>ADD Feedback</caption>
<tr>
<th>Name:</th>
<th><input type="text" name="name" id="name" placeholder="Enter Name"></th>
<th><span id="namer" style="color:red;"></span></th>
</tr>

<tr>
<th>Email Id:</th>
<th><input type="text" name="emailid" id="emailid" placeholder="Enter EmailId"></th>
<th><span id="emailidr" style="color:red;"></span></th>
</tr>

<tr>
<th>Ranks:</th>
<th><input type="text" name="ranks" id="ranks" placeholder="Enter Ranks"></th>
<th><span id="ranksr" style="color:red;"></span></th>
</tr>

<tr>
<th>Review:</th>
<th><input type="text" name="review" id="review" placeholder="Enter Review"></th>
<th><span id="reviewr" style="color:red;"></span></th>
</tr>

<tr>
<th>Suggestion:</th>
<th><input type="text" name="suggestion" id="suggestion" placeholder="Enter Suggestion"></th>
<th><span id="suggestionr" style="color:red;"></span></th>
</tr>
</table>
<button type="submit"  name="action" value="AddFeedback">Add Feedback</button>
<button type="reset">Reset</button>
</form>
<script type="text/javascript">
function AddFeedbackValidation(){
	
	na=document.getElementById("name").value;
	if(na==""){
		document.getElementById("namer").innerHTML="Please Enter Name";
		return false;
	}
	
	
	ei=document.getElementById("emailid").value;
	if(ei==""){
		document.getElementById("emailidr").innerHTML="Please Enter Emailid";
		return false;
	}
	
	
	ra=document.getElementById("ranks").value;
	if(ra==""){
		document.getElementById("ranksr").innerHTML="Please Enter Rank";
		return false;
	}
	
	
	re=document.getElementById("review").value;
	if(re==""){
		document.getElementById("reviewr").innerHTML="Please Enter Review";
		return false;
	}
	
	
	sg=document.getElementById("suggestion").value;
	if(sg==""){
		document.getElementById("suggestionr").innerHTML="Please Enter Suggestion";
		return false;
	}
	return true;
}
</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>