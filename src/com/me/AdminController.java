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
		newOwner.setEmail(scanner.nextLine());
		System.out.println("Please enter password: ");
		newOwner.setPassword(scanner.nextLine());
		ownerList.add(newOwner);
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

	public static boolean validateLogin(String adminEmail, String adminPassword) {

		// Sample data
		Admin sampleAdmin = new Admin("Sample", "Admin", "sa@gmail.com", "pass");
		adminList.add(sampleAdmin);

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

}
