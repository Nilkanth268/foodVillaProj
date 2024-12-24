package com.plazza.pojo;

public class AdiminLogin {
	
	
	private String Emailid;
	private String password;
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdiminLogin [Emailid=" + Emailid + ", password=" + password + "]";
	}
	
	

}
