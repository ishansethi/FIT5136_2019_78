package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {

	public static ArrayList<Customer> customerList = new ArrayList<Customer>();
	static Scanner scanner = new Scanner(System.in);

	public CustomerController() {

	}

	public static ArrayList<Customer> getCustomerList() {
		return customerList;
	}

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
	public static void registerCustomer(String firstName, String lastName, String customerEmail, String customerPassword) {

		ArrayList<Owner> ownerList = AdminController.getOwnerList();
		
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(customerEmail)) {
				System.out.println("Existing restaurant owner cannot be registered as a customer");
				return;
			}
		}
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(customerEmail)) {
				System.out.println("Existing customer cannot be registered as a new customer");
				return;
			}
		}
		
		if(!Utility.isValidPassword(customerPassword)) {
			return;
		}
		Customer newCustomer = new Customer(firstName, lastName, customerEmail, customerPassword);

		customerList.add(newCustomer);
		System.out.println("Customer added successfully");
	}

	/*
	 * Method to delete a customer
	 */
	public static void deleteCustomer() {
		System.out.println("Please enter the email address: ");
		String email = scanner.nextLine();
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
			}
		}

		return login;
	}
}
