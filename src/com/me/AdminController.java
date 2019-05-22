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

	public AdminController() {

	}

	/*
	 * Method for registering an owner
	 */
	public static void registerOwner(String firstName, String lastName, String ownerEmail, String ownerPassword) {

		ArrayList<Customer> customerList = CustomerController.getCustomerList();

		if (!Utility.isValidPassword(ownerPassword) || !Utility.isValidEmail(ownerEmail)) {
			return;
		}

		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(ownerEmail)) {
				System.out.println("Email already exists.");
				return;
			}
		}
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(ownerEmail)) {
				System.out.println("Existing customer cannot be registered as an owner");
				return;
			}
		}

		Owner newOwner = new Owner(firstName, lastName, ownerEmail, ownerPassword);
//		ownerList.add(newOwner);
//		System.out.println("Owner added successfully");

		System.out.println("SAMPLE DATA BEING ADDED");
		// Sample data
		Restaurant sampleRestaurant = new Restaurant("Student Canteen", "1, Monash Drive", "Caulfield", 3162,
				"stucan@gmail.com", "04111222333", "Snacks", newOwner);

		Item item1 = new Item("Item 1", "Item 1 Description", 5);
		Item item2 = new Item("Item 2", "Item 2 Description", 50);
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		sampleRestaurant.setMenu(itemList);

		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(sampleRestaurant);
		newOwner.setRestaurantList(restaurantList);

		ownerList.add(newOwner);
		System.out.println("Owner added successfully");
	}

	/*
	 * Method for deleting an owner
	 */
	public static void deleteOwner() {
		System.out.println("Please enter an email address: ");
		String email = scanner.nextLine();
		int ownerIndex = -1;
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(email)) {
				ownerIndex = ownerList.indexOf(owner);
			} else {
				System.out.print("Owner does not exist");
			}
		}
		if (ownerIndex >= 0) {
			ownerList.remove(ownerIndex);
			System.out.println("Owner has been removed");
		}
	}

	public static boolean validateAdminLogin(String adminEmail, String adminPassword) {

		// Sample data
		Admin sampleAdmin = new Admin("Sample", "Admin", "sa@gmail.com", "pass");
		AdminController.adminList.add(sampleAdmin);

		boolean login = false;

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

	public static boolean validateOwnerLogin(String ownerEmail, String ownerPassword) {

		// Dummy data
		Owner sampleOwner = new Owner("Sample", "Owner", "so@gmail.com", "pass");
		ownerList.add(sampleOwner);

		boolean login = false;

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

	public static boolean deleteRestaurant(String ownerEmail, String restaurantName) {
		Owner restaurantOwner = null;
		int index = -1;
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(ownerEmail)) {
				restaurantOwner = owner;
				index = ownerList.indexOf(owner);
			} else {
				System.out.println("Owner not found.");
				return false;
			}
		}
		if (restaurantOwner != null && index >= 0) {
			restaurantOwner.getRestaurantList().remove(index);
		} else {
			System.out.println("Restaurant not found");
			return false;
		}
		return true;
	}

}
