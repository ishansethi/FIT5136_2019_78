package com.me;

import java.util.ArrayList;

public class CustomerController {

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

	public static void registerCustomer() {
		// TODO: Add customer
	}

	public static boolean validateLogin(String customerEmail, String customerPassword) {

		// Dummy data
		Customer sampleCustomer = new Customer("Sample", "Customer", "sc@gmail.com", "pass");
		System.out.println("Sample Customer ID: " + sampleCustomer.getCustId());
		customerList.add(sampleCustomer);

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
