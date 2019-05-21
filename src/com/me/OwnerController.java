package com.me;

import java.util.ArrayList;

public class OwnerController {
	
	public static ArrayList<Owner> ownerList = new ArrayList<Owner>();

	public static boolean validateLogin(String ownerEmail, String ownerPassword) {

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
}
