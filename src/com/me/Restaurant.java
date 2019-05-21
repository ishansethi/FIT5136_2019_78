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

	public Restaurant(String name, String address, String suburb, int postcode, String email, String phoneNumber,
			String cuisine) {
		this.id = Utility.getNextRestaurantId();
		this.name = name;
		this.address = address;
		this.suburb = suburb;
		this.postcode = postcode;
		this.email = email;
		this.phone = phoneNumber;
		this.cuisine = cuisine;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

}
