package com.me;

public class Item {

	// attributes of Item
	private String name;
	private String description;
	private float price;

	// constructor
	public Item(String name, String description, float price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
