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
		// Sample data
		Admin sampleAdmin = new Admin("Sample", "Admin", "sa@gmail.com", "pass");
		adminList.add(sampleAdmin);

		// Dummy data
		Owner sampleOwner = new Owner("Sample", "Owner", "so@gmail.com", "pass");
		ownerList.add(sampleOwner);
	}

	/*
	 * Method for registering an owner
	 */
	public static void registerOwner() {

		Owner newOwner = new Owner("", "", "", "");
		System.out.println("Please enter a first name: ");
		newOwner.setFirstName(scanner.nextLine());
		
		System.out.println("Please enter a last name: ");
		newOwner.setLastName(scanner.nextLine());
		
		System.out.println("Please enter email address: ");
		String ownerEmail = scanner.nextLine();
		//newOwner.setEmail();
		ArrayList<Customer> customerList = CustomerController.getCustomerList();
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(ownerEmail)) {
				System.out.println("Existing restaurant owner cannot be registered as a customer");
				return;
			}
		}
		newOwner.setEmail(ownerEmail);
		
		System.out.println("Please enter password: ");
		newOwner.setPassword(scanner.nextLine());
		
		ownerList.add(newOwner);
		System.out.println("Owner added successfully");
	}

	/*
	 * Method for deleting an owner
	 */
	public static void deleteOwner() {
		System.out.println("Please enter an email address: ");
		String email = scanner.nextLine();
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(email)) {
				ownerList.remove(owner);
				System.out.print("The owner has been deleted");
				break;
			} else {
				System.out.print("Owner does not exist");
			}
		}
	}

	public static boolean validateAdminLogin(String adminEmail, String adminPassword) {

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
