function AddFoodValidation(){
	fn=document.getElementById("foodname").value;
	if(fn==""){
		document.getElementById("foodname").innerHTML="Please Enter FoodName";
		return false;
	}
	
	fc=document.getElementById("foodcategory").value;
	if(fc==""){
		document.getElementById("foodcategory").innerHTML="Please Enter FoodCategory";
		return false;
	}
	
	ft=document.getElementById("foodtype").value;
	if(ft==""){
		document.getElementById("foodtype").innerHTML="Please Enter Foodype";
		return false;
	}
	
	fp=document.getElementById("foodprice").value;
	if(fp==""){
		document.getElementById("foodprice").innerHTML="Please Enter FoodPrice";
		return false;
	}
	
	return true;
}

function UpdateFoodValidation(){
	fn=document.getElementById("foodname").value;
	if(fn==""){
		document.getElementById("foodname").innerHTML="Please Enter FoodName";
		return false;
	}
	
	fc=document.getElementById("foodcategory").value;
	if(fc==""){
		document.getElementById("foodcategory").innerHTML="Please Enter FoodCategory";
		return false;
	}
	
	ft=document.getElementById("foodtype").value;
	if(ft==""){
		document.getElementById("foodtype").innerHTML="Please Enter Foodype";
		return false;
	}
	
	fp=document.getElementById("foodprice").value;
	if(fp==""){
		document.getElementById("foodprice").innerHTML="Please Enter FoodPrice";
		return false;
	}
	
	return true;
}

function AddCustomerValidation(){
	cn=document.getElementById("customername").value;
	if(cn==""){
		document.getElementById("customername").innerHTML="Please Enter CustomerName";
		return false;
	}
	
	ce=document.getElementById("customeremailid").value;
	if(ce==""){
		document.getElementById("customeremailid").innerHTML="Please Enter CustomerEmailId";
		return false;
	}
	
	pa=document.getElementById("password").value;
	if(pa==""){
		document.getElementById("password").innerHTML="Please Enter Password";
		return false;
	}
	
	ca=document.getElementById("customeradd").value;
	if(ca==""){
		document.getElementById("customeradd").innerHTML="Please Enter CustomerAddress";
		return false;
	}
	
	cno=document.getElementById("customercontactno").value;
	if(cno==""){
		document.getElementById("customercontactno").innerHTML="Please Enter CustomerNo";
		return false;
	}
	return true
}


function UpdateCustomerValidation(){
	
	cn=document.getElementById("customername").value;
	if(cn==""){
		document.getElementById("customername").innerHTML="Please Enter CustomerName";
		return false;
	}
	
	ce=document.getElementById("customeremailid").value;
	if(ce==""){
		document.getElementById("customeremailid").innerHTML="Please Enter CustomerEmailId";
		return false;
	}
	
	pa=document.getElementById("password").value;
	if(pa==""){
		document.getElementById("password").innerHTML="Please Enter Password";
		return false;
	}
	
	ca=document.getElementById("customeradd").value;
	if(ca==""){
		document.getElementById("customeradd").innerHTML="Please Enter CustomerAddress";
		return false;
	}
	
	cno=document.getElementById("customercontactno").value;
	if(cno==""){
		document.getElementById("customercontactno").innerHTML="Please Enter CustomerNo";
		return false;
	}
	return true
	
}

function AddCartValidation(){
	fd=document.getElementById("foodid").value;
	if(fd==""){
		document.getElementById("foodid").innerHTML="Please Enter FoodId";
		return false;
	}
	
	ei=document.getElementById("email").value;
	if(ei==""){
		document.getElementById("email").innerHTML="Please Enter EmailId";
		return false;
	}
	
	fn=document.getElementById("foodname").value;
	if(fn==""){
		document.getElementById("foodname").innerHTML="Please Enter FoodName";
		return false;
	}
	
	fp=document.getElementById("foodprice").value;
	if(fp==""){
		document.getElementById("foodprice").innerHTML="Please Enter FoodPrice";
		return false;
	}
	
	fq=document.getElementById("quantity").value;
	if(fq==""){
		document.getElementById("quantity").innerHTML="Please Enter Quantity";
		return false;
	}
	
	return true;
}

function AddFeedbackValidation(){
	
	na=document.getElementById("name").value;
	if(na==""){
		document.getElementById("name").innerHTML="Please Enter Name";
		return false;
	}
	
	
	ei=document.getElementById("emailid").value;
	if(ei==""){
		document.getElementById("emailid").innerHTML="Please Enter Emailid";
		return false;
	}
	
	
	ra=document.getElementById("ranks").value;
	if(ra==""){
		document.getElementById("ranks").innerHTML="Please Enter Rank";
		return false;
	}
	
	
	re=document.getElementById("review").value;
	if(re==""){
		document.getElementById("review").innerHTML="Please Enter Review";
		return false;
	}
	
	
	sg=document.getElementById("suggestion").value;
	if(sg==""){
		document.getElementById("suggestion").innerHTML="Please Enter Suggestion";
		return false;
	}
	return true;
}

function LoginValidation(){
	type=document.getElementById("type").value;
	if(type.selectedIndex<0){
		document.getElementById("type").innerHTML="Please Select Type";
		return false;
	}
	
	
	email=document.getElementById("email").value;
	if(email==""){
		document.getElementById("email").innerHTML="Please Enter Email";
		return false;
	}
	
	if(email.indexOf('@')<0 || email.indexOf('.')<0){
		document.getElementById("email").innerHTML="Please Enter Valid Email";
		return false;
	}
	
	
	pa=document.getElementById("pass").value;
	if(pa==""){
		document.getElementById("pass").innerHTML="Please Enter Password";
		return false;
	}
	
	if(pa.length<8){
		document.getElementById("pass").innerHTML="Please Enter Valid Password";
		return false;
	}
	
	return true;
}
function changepassValidation(){
	email=document.getElementById("email").value;
	if(email==""){
		document.getElementById("email").innerHTML="Please Enter Email";
		return false;
	}
		if(email.indexOf('@')<0 || email.indexOf('.')<0){
		document.getElementById("email").innerHTML="Please Enter Valid Email";
		return false;
	}
	
	op=document.getElementById("opass").value;
	if(op==""){
		document.getElementById("opass").innerHTML="Please Enter Old Password";
		return false;
	}
	
	if(op.length<8){
		document.getElementById("opass").innerHTML="Please Enter Valid Password";
		return false;
	}
	
	np=document.getElementById("npass").value;
	if(np==""){
		document.getElementById("npass").innerHTML="Please Enter New Password";
		return false;
	}
	if(np.length<8){
		document.getElementById("npass").innerHTML="Please Enter Valid Password";
		return false;
	}
	
	cp=document.getElementById("conpass").value;
	if(cp==""){
		document.getElementById("conpass").innerHTML="Please Confirm Password";
		return false;
	}
	if(cp.length<8){
		document.getElementById("conpass").innerHTML="Please Enter Valid Password";
		return false;
	}
	
	return true;
}

