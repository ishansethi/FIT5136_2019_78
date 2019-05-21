package com.me;

public class Restaurant {
	private String id;
	private String name;
	private String address;
	private String suburb;
	private int postcode;
	private String email;
	private String phone;
	private String cuisine;	
	
	public Restaurant() 
	{
		
	}

	public Restaurant(String resId, String resName, String resAdd, String resSub, int resPcode,  String resEmail, String resPhone, String resCuisine) {	
		this.id = resId;
		this.name = resName;
		this.address = resAdd;
		this.suburb = resSub;
		this.postcode = resPcode;
		this.email = resEmail;
		this.phone = resPhone;
		this.cuisine = resCuisine;
	}

	public String getResId() {
		return id;
	}

	public void setResId(String resId) {
		this.id = resId;
	}

	public String getResName() {
		return name;
	}

	public void setResName(String resName) {
		this.name = resName;
	}

	public String getResAdd() {
		return address;
	}

	public void setResAdd(String resAdd) {
		this.address = resAdd;
	}

	public String getResSub() {
		return suburb;
	}

	public void setResSub(String resSub) {
		this.suburb = resSub;
	}

	public int getResPcode() {
		return postcode;
	}

	public void setResPcode(int resPcode) {
		this.postcode = resPcode;
	}

	public String getResEmail() {
		return email;
	}

	public void setResEmail(String resEmail) {
		this.email = resEmail;
	}

	public String getResPhone() {
		return phone;
	}

	public void setResPhone(String resPhone) {
		this.phone = resPhone;
	}

	public String getResCuisine() {
		return cuisine;
	}

	public void setResCuisine(String resCuizine) {
		this.cuisine = resCuizine;
	}
	
	
}
