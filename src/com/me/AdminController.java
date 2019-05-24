package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminController {

	private static ArrayList<Owner> ownerList = new ArrayList<Owner>();
	private static ArrayList<Admin> adminList = new ArrayList<Admin>();
	private static Scanner scanner = new Scanner(System.in);

	public static ArrayList<Owner> getOwnerList() {
		return ownerList;
	}

	/**
	 * Method to register a new owner
	 * 
	 * @param firstName
	 * @param lastName
	 * @param ownerEmail
	 * @param ownerPassword
	 */
	public static boolean registerOwner(String firstName, String lastName, String ownerEmail, String ownerPassword) {

		// local copy of customer list
		ArrayList<Customer> customerList = CustomerController.getCustomerList();

		// password not strong enough
		if (!Utility.isValidPassword(ownerPassword)) {
			System.out.println("Entered password is not strong enough.");
			return false;
		}

		// email address not valid
		if (!Utility.isValidEmail(ownerEmail)) {
			System.out.println("Entered email is not valid.");
			return false;
		}

		// owner email has been used previously for registration
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(ownerEmail)) {
				System.out.println("Email already exists.");
				return false;
			}
		}

		// email already exists for registered customer
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(ownerEmail)) {
				System.out.println("Existing customer cannot be registered as an owner");
				return false;
			}
		}

		// create new owner if all previous validation passes
		Owner newOwner = new Owner(firstName, lastName, ownerEmail, ownerPassword);

		// Sample data for restaurant
		Restaurant sampleRestaurant = new Restaurant("Student Canteen", "1, Monash Drive", "Caulfield", 3162,
				"stucan@gmail.com", "04111222333", "Snacks", newOwner);

		Item item1 = new Item("Non vegetarian item", "Item 1 Description", 5);
		Item item2 = new Item("Vegetarian item", "Item 2 Description", 50);
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		sampleRestaurant.setMenu(itemList);

		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(sampleRestaurant);
		newOwner.setRestaurantList(restaurantList);

		// add owner to list of owners
		ownerList.add(newOwner);
		System.out.println("Owner added successfully");
		return true;
	}

	/**
	 * Method to delete an owner
	 */
	public static void deleteOwner() {
		System.out.println("Please enter an email address: ");
		String email = scanner.nextLine();
		int ownerIndex = -1;

		// find index of the owner
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(email)) {
				ownerIndex = ownerList.indexOf(owner);
			} else {
				System.out.print("Owner does not exist");
			}
		}

		// remove owner
		if (ownerIndex >= 0) {
			ownerList.remove(ownerIndex);
			System.out.println("Owner has been removed.");
		} else {
			System.out.println("Owner was not removed.");
		}
	}

	/**
	 * Method to validate login for an admin credentials
	 * 
	 * @param adminEmail
	 * @param adminPassword
	 * @return
	 */
	public static boolean validateAdminLogin(String adminEmail, String adminPassword) {

		// Sample data
		Admin sampleAdmin = new Admin("Sample", "Admin", "sa@gmail.com", "pass");
		AdminController.adminList.add(sampleAdmin);

		boolean login = false;

		// validate email and password pair
		for (Admin admin : adminList) {
			if (admin.getEmail().equals(adminEmail)) {
				if (admin.getPassword().equals(adminPassword)) {
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

	/**
	 * Method to validate login for owner credentials
	 * 
	 * @param ownerEmail
	 * @param ownerPassword
	 * @return
	 */
	public static boolean validateOwnerLogin(String ownerEmail, String ownerPassword) {

		// Sample data
		Owner sampleOwner = new Owner("Sample", "Owner", "so@gmail.com", "pass");
		ownerList.add(sampleOwner);

		boolean login = false;

		// validate email and password pair
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(ownerEmail)) {
				if (owner.getPassword().equals(ownerPassword)) {
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

	/**
	 * Method to delete a restaurant
	 * 
	 * @param ownerEmail
	 * @param restaurantName
	 * @return
	 */
	public static boolean deleteRestaurant(String ownerEmail, String restaurantName) {
		Owner restaurantOwner = null;
		int index = -1;

		// find the owner that was entered
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(ownerEmail)) {
				restaurantOwner = owner;
				index = ownerList.indexOf(owner);
			} else {
				System.out.println("Owner not found.");
				return false;
			}
		}

		// find the restaurant and delete it
		if (restaurantOwner != null && index >= 0) {
			restaurantOwner.getRestaurantList().remove(index);
		} else {
			System.out.println("Restaurant not found");
			return false;
		}
		return true;
	}

}
