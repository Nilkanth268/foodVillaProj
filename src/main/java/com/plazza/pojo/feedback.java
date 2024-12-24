package com.plazza.pojo;

public class feedback {
    private String name,emailid,ranks,review,suggestion;

	public feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public feedback(String name, String emailid, String ranks, String review, String suggestion) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.ranks = ranks;
		this.review = review;
		this.suggestion = suggestion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getRanks() {
		return ranks;
	}

	public void setRanks(String ranks) {
		this.ranks = ranks;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	
    
    
    
    
    
    
    
    
}
