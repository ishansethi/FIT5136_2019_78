package com.me;

import java.util.ArrayList;

public class AdminController {
	private static ArrayList<Owner> ownerList = new ArrayList<Owner>();
	
	public static ArrayList<Owner> getOwnerList() {
		return ownerList;
	}

	/*
	 * Method for registering an owner
	 */
	public void registerOwner(String firstName, String lastName, String email, String password) {
		Owner newOwner = new Owner(firstName, lastName, email, password);
		ownerList.add(newOwner);
	}
	
	/*
	 * Method for deleting an owner
	 */
	public void deleteOwner(String email) {
		for (Owner owner : ownerList) {
			if (owner.getEmail().equals(email)) {
				ownerList.remove(owner);
				break;
			}
			else {
				System.out.print("Owner not found");
			}
		}
	}

}
