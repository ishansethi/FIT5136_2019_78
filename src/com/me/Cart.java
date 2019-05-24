package com.me;

import java.util.ArrayList;

public class Cart {

	// attributes of cart
	private String custId;
	private ArrayList<Item> itemList = new ArrayList<Item>();

	// Constructor of Cart class
	public Cart(String custId) {
		this.custId = custId;
	}

	// getters and setters
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

}