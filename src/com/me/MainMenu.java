package com.me;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class MainMenu {

//	private String userInput;
//	private AdminController adminControl;
//	private RestaurantController restaurantControl;
//	private CustomerController customerControl;
//	private Utility utility;

	static Scanner scanner = new Scanner(System.in);

	public MainMenu() {
//		userInput = "noinput";
//		utility = new Utility();
//		customerControl = new CustomerController();
//		restaurantControl = new RestaurantController();
//		adminControl = new AdminController();
	}

	/**
	 * A method to display the main menu
	 */
	public static void displayMainMenu() {
		// clear();
		System.out.println("==================================================");
		System.out.println("Welcome to Monash Eats");
		System.out.println("==================================================");
		System.out.println("(1) Login");
		System.out.println("(2) Register");
		System.out.println("(3) Enter as guest");
		System.out.println("(4) Exit");
		System.out.print("Please choose an option....... ");
	}

	/**
	 * A method to display the login menu
	 */
	public static void displayLogin() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Login ->");
		System.out.println("========================================================");
		System.out.println("(1) Customer");
		System.out.println("(2) Restaurant Owner");
		System.out.println("(3) Admin");
		System.out.println("(4) Back to Main Menu");
		System.out.print("Please choose an option.......");
	}

	/**
	 * A method to display the register menu
	 */
	public static void displayRegister() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Please select 1 for register or 2 for back to main menu.");
		System.out.println("========================================================");
		System.out.println("(1) Register");
		System.out.println("(2) Back to Main Menu");
		System.out.print("Please choose an option....... ");
	}

	/**
	 * A method to display the admin dashboard menu
	 */
	public static void displayAdminDashboard() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Welcome to Admin Portal");
		System.out.println("========================================================");
		System.out.println("Choose any option to continue ");
		System.out.println("========================================================");
		System.out.println("(1) Manage Customer Feedback");
		System.out.println("(2) Manage Restaurant");
		System.out.println("(3) Manage Restaurant Owner");
		System.out.println("(4) Log out");
		System.out.print("Please choose an option.......");
	}

	/**
	 * A method to display the customer management dashboard
	 */
	public static void displayCustomerManagementMenu() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Welcome to Customer Feedback Management Menu");
		System.out.println("========================================================");
		System.out.println("(1) View FeedBack");
		System.out.println("(2) View Customers");
		System.out.println("(3) Go back to Admin Main Menu");
		System.out.println("Please choose an option....... ");
	}

	/**
	 * A method to display the Restaurant management dashboard
	 */
	public static void displayRestaurantManagementMenu() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Welcome to Restaurant Management Menu");
		System.out.println("========================================================");
		System.out.println("(1) View Restaurants");
		System.out.println("(3) Delete Restaurant");
		System.out.println("(4) Go back to Admin Main Menu");
		System.out.println("Please choose an option....... ");
	}

	/**
	 * A method to display the Restaurant Owner management dashboard
	 */
	public static void displayRestaurantOwnerManagementMenu() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Welcome to Restaurant Owner Management Menu");
		System.out.println("========================================================");
		System.out.println("(1) View Restaurant Owners");
		System.out.println("(2) Add Restaurant Owner");
		System.out.println("(3) Delete Restaurant Owner");
		System.out.println("(4) Go back to Admin Main Menu");
		System.out.println("Please choose an option....... ");
	}

	/**
	 * A method to display the visitor dashboard
	 */
	public static void displayGuestDashboard() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Welcome to the Monash Eats!");
		System.out.println("========================================================");
		System.out.println("(1) View Restaurants");
		System.out.println("(2) Back to Main Menu");
		System.out.println("Please choose an option....... ");
	}

	/**
	 * A method to display the customer dashboard
	 */
	public static void displayCustomerDashboard() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Hi! Welcome to Monash Eats, Let's Order Some food!");
		System.out.println("========================================================");
		System.out.println("(1) View Restaurants");
		System.out.println("(2) Manage Cart");
		System.out.println("(3) Checkout ");
		System.out.println("(4) View your orders");
		System.out.println("(5) Log out");
		System.out.println("Please select an option: ");
	}

	public static void main(String[] args) {

		startProgram();

	}

	private static void startProgram() {
		boolean loop = true;
		while (loop) {
			displayMainMenu();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {
				switch (userChoice) {
				case "1":
					// login
					login();
					break;
				case "2":
					// register
					register();
					break;
				case "3":
					// enter as a guest
					enterAsGuest();
					break;
				case "4":
					// exit
					loop = false;
					System.out.println("Thank you, Goodbye!");
					break;
				default:
					System.out.println("Entered number is not a choice. Please choose again ");
					break;
				}

			} else {
				System.out.println("Invalid choice. Please choose again.");
				// retryInput();
			}

		}
	}

	private static void login() {

		boolean loop = true;
		while (loop) {
			displayLogin();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {
				switch (userChoice) {
				case "1":
					// customer login
					customerLogin();
				case "2":
					// owner
					ownerLogin();
				case "3":
					// admin
					adminLogin();
					break;
				default:
					System.out.println("Entered number is not a choice. Please choose again ");
					break;
				}
			} else {
				System.out.println("Invalid choice. Please choose again.");
				// retryInput();
			}
		}
	}

	private static void register() {

		boolean loop = true;
		while (loop) {
			displayRegister();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {

			} else {
				System.out.println("Invalid choice. Please choose again.");
				// retryInput();
			}
		}
	}

	private static void enterAsGuest() {

		boolean loop = true;
		while (loop) {
			displayGuestDashboard();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {

			} else {
				System.out.println("Invalid choice. Please choose again.");
				// retryInput();
			}
		}
	}

	private static void customerLogin() {

		boolean loop = true;
		while (loop) {
			System.out.println("Enter customer email: ");
			String customerEmail = scanner.nextLine();
			if (Utility.isValidEmail(customerEmail)) {
				System.out.println("Enter password: ");
				String customerPassword = scanner.nextLine();
				if (CustomerController.validateLogin(customerEmail, customerPassword)) {
					customerDashboard();
					loop = false;
				}
			} else {
				System.out.println("Invalid email entered. Try again.");
			}
		}
	}

	private static void ownerLogin() {

		boolean loop = true;
		while (loop) {
			System.out.println("Enter owner email: ");
			String ownerEmail = scanner.nextLine();
			if (Utility.isValidEmail(ownerEmail)) {
				System.out.println("Enter password: ");
				String ownerPassword = scanner.nextLine();
				if (OwnerController.validateLogin(ownerEmail, ownerPassword)) {
					displayRestaurantOwnerManagementMenu();
					loop = false;
				}
			} else {
				System.out.println("Invalid email entered. Try again.");
			}
		}
	}

	private static void adminLogin() {

		boolean loop = true;
		while (loop) {
			System.out.println("Enter admin email: ");
			String adminEmail = scanner.nextLine();
			if (Utility.isValidEmail(adminEmail)) {
				System.out.println("Enter password: ");
				String adminPassword = scanner.nextLine();
				if (AdminController.validateLogin(adminEmail, adminPassword)) {
					displayAdminDashboard();
					loop = false;
				}
			} else {
				System.out.println("Invalid email entered. Try again.");
			}
		}
	}

	private static void customerDashboard() {

		boolean loop = true;
		while (loop) {
			displayCustomerDashboard();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {

//				System.out.println("(1) View Restaurants");
//				System.out.println("(2) Manage Cart");
//				System.out.println("(3) Checkout ");
//				System.out.println("(4) View your orders");
//				System.out.println("(5) Log out");
				
			} else {
				System.out.println("Invalid choice. Please choose again.");
				// retryInput();
			}
		}
	}

	private static void retryInput() {
		// TODO Auto-generated method stub

	}

}
