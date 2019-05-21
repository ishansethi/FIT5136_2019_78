package com.me;

public class AdminController {
	
	/*
	 * Method for registering an owner
	 */
	public void registerOwner(String firstName, String lastName, String email, String password) {
		
		Owner newOwner = new Owner(firstName, lastName, email, password);
	}
	
	/*
	 * Method for deleting an owner
	 */
	public void deleteOwner(Owner owner) {
		
	}

}
