package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {

	public static ArrayList<Customer> customerList = new ArrayList<Customer>();
	private static Scanner scanner = new Scanner(System.in);

	// getter for customer list
	public static ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	/**
	 * Method to retrieve item list of a cart
	 * 
	 * @return
	 */
	public ArrayList<Item> viewCart() {
		ArrayList<Item> itemList = new ArrayList<Item>();
		return itemList;
	}

	/**
	 * Method to register a new customer
	 * 
	 * @param firstName
	 * @param lastName
	 * @param customerEmail
	 * @param customerPassword
	 */
	public static boolean registerCustomer(String firstName, String lastName, String customerEmail,
			String customerPassword) {

		// local list of all owners
		ArrayList<Owner> ownerList = AdminController.getOwnerList();

		// password not strong enough
		if (!Utility.isValidPassword(customerPassword)) {
			System.out.println("Entered password is not strong enough.");
			return false;
		}

		// email address not valid
		if (!Utility.isValidEmail(customerEmail)) {
			System.out.println("Entered email is not valid.");
			return false;
		}

		// check if new customer is an owner already
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(customerEmail)) {
				System.out.println("Existing restaurant owner cannot be registered as a customer");
				return false;
			}
		}

		// check if customer email is already used
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(customerEmail)) {
				System.out.println("Email already exists.");
				return false;
			}
		}

		Customer newCustomer = new Customer(firstName, lastName, customerEmail, customerPassword);

		// add customer to customer list
		customerList.add(newCustomer);
		System.out.println("Customer added successfully");
		return true;
	}

	/**
	 * Method to delete a customer
	 */
	public static void deleteCustomer() {

		// delete all the fields of the customer except email address
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

	/**
	 * Method to validate customer login credentials
	 * 
	 * @param customerEmail
	 * @param customerPassword
	 * @return
	 */
	public static boolean validateLogin(String customerEmail, String customerPassword) {

		boolean login = false;

		// validate email and password pair
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
