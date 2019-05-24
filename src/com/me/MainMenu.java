package com.me;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {

	// scanner to obtain user input
	static Scanner scanner = new Scanner(System.in);

	CustomerController customerController = new CustomerController();
	RestaurantController restaurantController = new RestaurantController();
	AdminController adminController = new AdminController();

	/**
	 * A method to display the main menu
	 */
	public static void displayMainMenu() {
		System.out.println("==================================================");
		System.out.println("Welcome to Monash Eats");
		System.out.println("==================================================");
		System.out.println("(1) Login");
		System.out.println("(2) Register as a new customer");
		System.out.println("(3) Enter as guest");
		System.out.println("(4) Exit");
		System.out.print("Please choose an option....... ");
	}

	/**
	 * A method to display the login menu
	 */
	public static void displayLogin() {
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
		System.out.println("(2) Manage Restaurant Owner");
		System.out.println("(3) Log out");
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
	 * A method to display the restaurant management dashboard
	 */
	public static void displayRestaurantManagementMenu() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Welcome to Restaurant Management Menu");
		System.out.println("========================================================");
		System.out.println("(1) View Restaurants");
		System.out.println("(2) Delete Restaurant");
		System.out.println("(3) Logout");
		System.out.println("Please choose an option....... ");
	}

	/**
	 * A method to display the manage restaurant owner dashboard
	 */
	public static void displayRestaurantOwnerManagementMenu() {
		// clear();
		System.out.println("========================================================");
		System.out.println("Welcome to Owner Management Menu");
		System.out.println("========================================================");
		System.out.println("(1) Register a new owner");
		System.out.println("(2) Delete an owner");
		System.out.println("(3) View Restaurant Owners");
		System.out.println("(4) Go back to admin dashboard");
		System.out.println("Please select an option: ");
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
		System.out.println("(2) Search Restaurants");
		System.out.println("(3) View Cart");
		System.out.println("(4) Checkout ");
		System.out.println("(5) View past orders");
		System.out.println("(6) Delete customer account");
		System.out.println("(7) Log out");
		System.out.println("Please select an option: ");
	}

	// main method
	public static void main(String[] args) {
		startProgram();
	}

	// first method to be called
	private static void startProgram() {

		// sample data
		Customer sampleCustomer1 = new Customer("Sample", "Customer", "sc@gmail.com", "pass");
		CustomerController.customerList.add(sampleCustomer1);

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
					System.out.println("Please enter a first name: ");
					String firstName = scanner.nextLine();

					System.out.println("Please enter a last name: ");
					String lastName = scanner.nextLine();

					System.out.println("Please enter email address: ");
					String customerEmail = scanner.nextLine();

					System.out.println(
							"Please choose password [Min length = 8; With at least 3 alphabets and 2 numbers]: ");
					String customerPassword = scanner.nextLine();

					while (!CustomerController.registerCustomer(firstName, lastName, customerEmail, customerPassword)) {
						System.out.println("Retry registration");
					}
					break;
				case "3":
					// enter as a guest
					enterAsGuest();
					break;
				case "4":
					// exit system
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

	// login menu
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
					break;
				case "2":
					// owner
					ownerLogin();
					break;
				case "3":
					// admin
					adminLogin();
					break;
				case "4":
					// back to main menu
					loop = false;
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

	// enter as a guest
	private static void enterAsGuest() {

		boolean loop = true;
		while (loop) {
			displayGuestDashboard();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {
				switch (userChoice) {
				case "1":
					// view restaurants
					RestaurantController.searchRestaurant();
					break;
				case "2":
					// back to main menu
					loop = false;
					break;
				default:
					System.out.println("Entered number is not a choice. Please choose again ");
					break;
				}
			} else {
				System.out.println("Invalid choice. Please choose again.");
			}
		}
	}

	// customer login
	private static void customerLogin() {

		boolean loop = true;
		while (loop) {
			System.out.println("Enter customer email: ");
			String customerEmail = scanner.nextLine();
			if (Utility.isValidEmail(customerEmail)) {
				System.out.println("Enter password: ");
				String customerPassword = scanner.nextLine();

				// validate login credentials
				if (CustomerController.validateLogin(customerEmail, customerPassword)) {
					int customerIndex = -1;
					for (Customer customer : CustomerController.getCustomerList()) {
						if (customer.getEmail().equals(customerEmail)) {
							customerIndex = CustomerController.getCustomerList().indexOf(customer);
						}
					}
					String customerId = "-1";
					if (customerIndex >= 0) {
						customerId = CustomerController.customerList.get(customerIndex).getCustId();
					}
					if (!customerId.equals("-1")) {
						customerDashboard(customerId);
					}
					loop = false;
				} else {
					System.out.println("Invalid credentials. Try again.");
				}
			} else {
				System.out.println("Invalid email entered. Try again.");
			}
		}
	}

	// owner login
	private static void ownerLogin() {

		boolean loop = true;
		while (loop) {
			System.out.println("Enter owner email: ");
			String ownerEmail = scanner.nextLine();
			if (Utility.isValidEmail(ownerEmail)) {
				System.out.println("Enter password: ");
				String ownerPassword = scanner.nextLine();

				// validate owner credentials
				if (AdminController.validateOwnerLogin(ownerEmail, ownerPassword)) {
					ownerDashboard(ownerEmail);
					loop = false;
				}
			} else {
				System.out.println("Invalid email entered. Try again.");
			}
		}
	}

	// admin login
	private static void adminLogin() {

		boolean loop = true;
		while (loop) {
			System.out.println("Enter admin email: ");
			String adminEmail = scanner.nextLine();

			if (Utility.isValidEmail(adminEmail)) {
				System.out.println("Enter password: ");
				String adminPassword = scanner.nextLine();

				// validate admin credentials
				if (AdminController.validateAdminLogin(adminEmail, adminPassword)) {
					adminDashboard();
					loop = false;
				}
			} else {
				System.out.println("Invalid email entered. Try again.");
			}
		}
	}

	// customer dashboard for a particular customer id
	private static void customerDashboard(String customerId) {
		Cart cart = new Cart(customerId);
		boolean loop = true;
		boolean cartloop = false;
		float Totalsum = 0;
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Item> itemList = new ArrayList<Item>();

		while (loop) {
			displayCustomerDashboard();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {
				// local list of all restaurants
				ArrayList<Restaurant> allRestaurants = RestaurantController.getAllRestaurants();
				switch (userChoice) {
				case "1":
					// list all restaurants
					System.out.println("Restaurant names: ");
					for (Restaurant restaurant : allRestaurants) {
						System.out.println("\n" + restaurant.getName());
					}
					System.out.println("----------------------------------");
					System.out.println("Choose from restaurant list? (y/n)");
					String userInput = scanner.nextLine();

					// user chooses restaurant
					if ((userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"))
							&& Utility.isAlphabetic(userInput)) {
						System.out.println("Enter name of chosen restaurant: ");
						String choice = scanner.nextLine();
						Restaurant chosenRestaurant = null;
						for (Restaurant rest : allRestaurants) {
							if (rest.getName().equalsIgnoreCase(choice)) {
								chosenRestaurant = rest;
								cartloop = true;
							}
						}

						while (cartloop) {
							// get item list for chosen restaurant
							System.out.println("Menu for " + chosenRestaurant.getName() + ": ");
							for (Item item : chosenRestaurant.getMenu()) {
								System.out.println("\nName: " + item.getName() + "\t$" + item.getPrice());
							}
							System.out.println("Choose item by entering its name or enter 'back' to go back");
							String itemChoice = scanner.nextLine();

							// go back
							if (itemChoice.equalsIgnoreCase("back")) {
								cartloop = false;
								break;
							}

							// choose item
							if (!itemChoice.equalsIgnoreCase("back")) {
								for (Item item : chosenRestaurant.getMenu()) {
									if (itemChoice.equalsIgnoreCase(item.getName())) {
										itemList.add(item);
									}
								}
								cart.setItemList(itemList);
								System.out.println("Item is added to cart");

								System.out.println("Want to add more items? (y/n)");
								String userC = scanner.nextLine();

								// check to add more items
								if (userC.equalsIgnoreCase("y") || userC.equalsIgnoreCase("yes")) {
									continue;
								} else if (userC.equalsIgnoreCase("n") || userC.equalsIgnoreCase("no")) {
									cartloop = false;
									break;
								}
							}
						}
					}
					break;
				case "2":
					// search for a restaurant
					ArrayList<Restaurant> foundRestaurants = RestaurantController.searchRestaurant();
					System.out.println("Restaurant names: ");
					for (Restaurant rest : foundRestaurants) {
						System.out.println(rest.getName());
					}
					break;
				case "3":
					// View cart
					if (!cart.getItemList().isEmpty()) {
						Totalsum = 0;
						System.out.println("Cart Item List ");
						for (Item item : cart.getItemList()) {
							System.out.println(item.getName() + " $" + item.getPrice());
							Totalsum += item.getPrice();
						}
						System.out.println("Cart Total Value : $" + Totalsum);
					} else {
						System.out.println("Cart is empty.");
					}

					break;
				case "4":
					// checkout
					System.out.println("Cart Total Value : $" + Totalsum);
					System.out.println("Do you like to Place the order?(y/n)");

					String userChoi = scanner.nextLine();
					if (userChoi.equalsIgnoreCase("y") || userChoi.equalsIgnoreCase("yes")) {
						// create new order
						Order custOrder = new Order();

						custOrder.setId(Utility.getNextOrderId());
						custOrder.setCustId(customerId);
						custOrder.setTotalCost(Totalsum);
						custOrder.setStatus("ACCEPTED");
						custOrder.setDateCreated(new Date());
						orderList.add(custOrder);

						System.out.println("Order has been placed.");
					}

					break;
				case "5":
					// view past orders
					boolean looporder = false;
					for (Order custOrder : orderList) {
						System.out.println("OrderId:" + custOrder.getId());
						System.out.println("CustId: " + custOrder.getCustId());
						System.out.println("TotalCost: $" + custOrder.getTotalCost());
						System.out.println("Order Date: " + custOrder.getDateCreated());
						System.out.println("Order Status: " + custOrder.getStatus());
						looporder = true;
					}

					while (looporder) {
						System.out.println("Go back to Main Menu ?(y/n)");
						String userOrderChoice = scanner.nextLine();
						if (userOrderChoice.equalsIgnoreCase("y") || userOrderChoice.equalsIgnoreCase("yes")) {
							looporder = false;
							break;
						} else {
							continue;
						}
					}
					break;
				case "6":
					// delete customer
					CustomerController.deleteCustomer();
					break;
				case "7":
					// logout
					System.out.println("Logged out successfully.");
					loop = false;
					break;
				default:
					System.out.println("Entered number is not a choice. Please choose again ");
					break;
				}
			} else {
				System.out.println("Invalid choice. Please choose again.");
			}
		}
	}

	// owner dashboard
	private static void ownerDashboard(String ownerEmail) {

		boolean loop = true;
		while (loop) {
			displayRestaurantManagementMenu();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {
				ArrayList<Restaurant> allRestaurants = RestaurantController.getListOfRestaurantsOwned(ownerEmail);
				switch (userChoice) {
				case "1":
					// view all restaurants
					System.out.println("Restaurant names: ");
					for (int i = 0; i < allRestaurants.size(); i++) {
						System.out.println("\n" + i + ". " + allRestaurants.get(i).getName());
					}
					break;
				case "2":
					// delete restaurant
					System.out.println("Choose restaurant to delete: ");
					for (int i = 0; i < allRestaurants.size(); i++) {
						System.out.println("\n" + i + ". " + allRestaurants.get(i).getName());
					}
					String userInput = scanner.nextLine();
					if (Utility.isIntString(userInput)) {
						String restaurantName = allRestaurants.get(Integer.valueOf(userInput)).getName();
						if (AdminController.deleteRestaurant(ownerEmail, restaurantName)) {
							System.out.println("Restaurant deleted successfully.");
						} else {
							System.out.println("Restaurant was not deleted.");
						}
					}
					break;
				case "3":
					// logout
					System.out.println("Logged out successfully.");
					loop = false;
					break;
				default:
					System.out.println("Entered number is not a choice. Please choose again ");
					break;
				}
			} else {
				System.out.println("Invalid choice. Please choose again.");
			}
		}
	}

	// admin dashboard
	private static void adminDashboard() {

		boolean loop = true;
		while (loop) {
			displayAdminDashboard();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {
				switch (userChoice) {
				case "1":
					System.out.println("Feature not implemented.");
					break;
				case "2":
					// manage restaurant owners
					manageRestaurantOwner();
					break;
				case "3":
					// logout
					System.out.println("Logged out successfully.");
					loop = false;
					break;
				default:
					System.out.println("Entered number is not a choice. Please choose again ");
					break;
				}
			} else {
				System.out.println("Invalid choice. Please choose again.");
			}
		}
	}

	// manage restaurant owner
	private static void manageRestaurantOwner() {

		boolean loop = true;
		while (loop) {
			displayRestaurantOwnerManagementMenu();
			String userChoice = scanner.nextLine();
			if (Utility.isIntString(userChoice)) {
				switch (userChoice) {
				case "1":
					// register new restaurant owner
					System.out.println("Please enter a first name: ");
					String firstName = scanner.nextLine();

					System.out.println("Please enter a last name: ");
					String lastName = scanner.nextLine();

					System.out.println("Please enter email address: ");
					String ownerEmail = scanner.nextLine();

					System.out.println(
							"Please choose password [Min length = 8; With at least 3 alphabets and 2 numbers]: ");
					String ownerPassword = scanner.nextLine();

					while (!AdminController.registerOwner(firstName, lastName, ownerEmail, ownerPassword)) {
						System.out.println("Retry registration.");
					}
					break;
				case "2":
					// delete restaurant owner
					AdminController.deleteOwner();
					break;
				case "3":
					// retrieve list of all owners
					ArrayList<Owner> ownerList = AdminController.getOwnerList();
					for (Owner owner : ownerList) {
						System.out.println("Name: " + owner.getFirstName() + " " + owner.getLastName() + "; Email: "
								+ owner.getEmail());
					}
					break;
				case "4":
					// back to admin dashboard
					loop = false;
					break;
				default:
					System.out.println("Entered number is not a choice. Please choose again ");
					break;

				}

			} else {
				System.out.println("Invalid choice. Please choose again.");
			}
		}
	}

}
