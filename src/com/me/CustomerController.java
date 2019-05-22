package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {

	public static ArrayList<Customer> customerList = new ArrayList<Customer>();
	static Scanner scanner = new Scanner(System.in);

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

	/*
	 * Method to register a customer
	 */
	public static void registerCustomer() {

		Customer newCustomer = new Customer("", "", "", "");
		System.out.println("Please enter a first name: ");
		newCustomer.setFirstName(scanner.nextLine());
		System.out.println("Please enter a last name: ");
		newCustomer.setLastName(scanner.nextLine());
		System.out.println("Please enter email address: ");
		newCustomer.setEmail(scanner.nextLine());
		System.out.println("Please enter password: ");
		newCustomer.setPassword(scanner.nextLine());
		customerList.add(newCustomer);
	}

	/*
	 * Method to delete a customer
	 */
	public static void deleteCustomer(String email) {
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(email)) {
				customer.setAddress("");
				customer.setFirstName("");
				customer.setLastName("");
				customer.setPassword("");
				customer.setPhoneNo("");
				System.out.print("The customer has been deleted");
				break;
			} else {
				System.out.print("Customer does not exist");
			}
		}
	}

	public static boolean validateLogin(String customerEmail, String customerPassword) {

		// Dummy data
		Customer sampleCustomer1 = new Customer("Sample", "Customer", "sc@gmail.com", "pass");
		System.out.println("Sample Customer ID: " + sampleCustomer1.getCustId());
		customerList.add(sampleCustomer1);

		boolean login = false;

		for (Customer customer : customerList) {
			if (customer.getEmail().equals(customerEmail)) {
				if (customer.getPassword().equals("")) {
					System.out.println("User does not exist in the system anymore");
				} else if (customer.getPassword().equals(customerPassword)) {
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
