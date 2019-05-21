package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminController {
	
	private static ArrayList<Owner> ownerList = new ArrayList<Owner>();
	Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Owner> getOwnerList() {
		return ownerList;
	}

	/*
	 * Method for registering an owner
	 */
	public void registerOwner() {//String firstName, String lastName, String email, String password) {
		//Owner newOwner = new Owner(firstName, lastName, email, password);
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
	public void deleteOwner() {
		System.out.println("Please enter an email address: ");
		String email = scanner.nextLine();
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(email)) {
				ownerList.remove(owner);
				System.out.print("This owner has been deleted");
				break;
			}
			else {
				System.out.print("Owner does not exist");
			}
		}
	}

}
