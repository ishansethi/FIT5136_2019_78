package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantController {

	// instance variables
	private static ArrayList<Restaurant> allRestaurants = new ArrayList<Restaurant>();
	Scanner scanner = new Scanner(System.in);

	// constructor
	public RestaurantController() {

	}

	public static ArrayList<Restaurant> getAllRestaurants() {

		// Retrieve all the restaurants in the system
		ArrayList<Owner> ownerList = AdminController.getOwnerList();
		for (Owner owner : ownerList) {
			for (Restaurant restaurant : owner.getRestaurantList()) {
				allRestaurants.add(restaurant);
			}
		}
		return allRestaurants;
	}

	public ArrayList<Restaurant> searchRestaurant() {

		getAllRestaurants();

		ArrayList<Restaurant> searchResult = new ArrayList<Restaurant>();

		String userChoice = scanner.nextLine();
		searchChoices();
		if (!Utility.isIntString(userChoice)) {
			System.out.println("Invalid choice. Please choose again.");
			searchChoices();
		}

		switch (userChoice) {
		case "1":
			System.out.println("Enter restaurant name: ");
			String resName = scanner.nextLine();
			for (Restaurant restaurant : allRestaurants) {
				if (restaurant.getName().equalsIgnoreCase(resName)) {
					searchResult.add(restaurant);
				}
			}
			if (searchResult.isEmpty()) {
				System.out.println("Restaurant name not found.");
			}
			break;
		case "2":
			System.out.println("Enter suburb name: ");
			String resSuburb = scanner.nextLine();
			for (Restaurant restaurant : allRestaurants) {
				if (restaurant.getSuburb().equalsIgnoreCase(resSuburb)) {
					searchResult.add(restaurant);
				}
			}
			if (searchResult.isEmpty()) {
				System.out.println("Suburb has no restaurants.");
			}
			break;
		case "3":
			System.out.println("Enter cuisine: ");
			String resCuisine = scanner.nextLine();
			for (Restaurant restaurant : allRestaurants) {
				if (restaurant.getCuisine().equalsIgnoreCase(resCuisine)) {
					searchResult.add(restaurant);
				}
			}
			if (searchResult.isEmpty()) {
				System.out.println("Cuisine not present in any restaurant.");
			}
			break;
		case "4":
			System.out.println("Enter postcode: ");
			String resPostcode = scanner.nextLine();
			for (Restaurant restaurant : allRestaurants) {
				if (String.valueOf(restaurant.getPostcode()).equalsIgnoreCase(resPostcode)) {
					searchResult.add(restaurant);
				}
			}
			if (searchResult.isEmpty()) {
				System.out.println("Postcode has no restaurants.");
			}
			break;
		default:
			System.out.println("Invalid choice. Please choose again.");
			searchResult = searchRestaurant();
			break;
		}
		return searchResult;
	}

	private void searchChoices() {

		System.out.println("Choose search filter: ");
		System.out.println("1. Name");
		System.out.println("2. Suburb");
		System.out.println("3. Cuisine");
		System.out.println("4. Postcode");
		System.out.println("5. Back to main menu");
	}
}
