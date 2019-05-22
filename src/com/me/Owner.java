package com.me;

import java.util.ArrayList;

public class Owner {
	// instance variables
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNo;
	private String email;
	private String password;
	private ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();

	// creating instance of customer with mandatory fields
	public Owner(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Restaurant> getRestaurantList() {
		return restaurantList;
	}

	public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
		this.restaurantList = restaurantList;
	}

}
