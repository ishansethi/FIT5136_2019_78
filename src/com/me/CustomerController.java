package com.me;

import java.util.ArrayList;

public class CustomerController {
	// instances of customers
	public static ArrayList<Customer> customerList = new ArrayList<Customer>();
	

	/*
	 * Method to view Cart
	 */
	public ArrayList<Item> viewCart() {
		ArrayList<Item> itemList = new ArrayList<Item>();
		return itemList;
	}

	/*
	 * Method to edit Cart
	 */
	public void editCart() {

	}

	public static boolean validateLogin(String customerEmail, String customerPassword) {
		
		//TODO: Dummy data, remove later
		Customer c1 = new Customer("John", "Doe", "jd@gmail.com", "pass");
		customerList.add(c1);
		
		
		boolean login = false;

		for (Customer customer : customerList) {
			if (customer.getEmail().equals(customerEmail)) {
				if (customer.getPassword().equals(customerPassword)) {
					login = true;
				} else {
					System.out.println("Wrong password entered.");
				}
			} else {
				System.out.println("Email address not found in records.");
			}
		}

		return login;
	}
}
