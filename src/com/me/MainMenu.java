package com.me;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
public class MainMenu{
	private Scanner console;
	private AdminController adminControl;
	private RestaurantController restaurantControl;
	private CustomerController customerControl;
	private Validator validate;
	public MainMenu() {
		
		

        console = new Scanner(System.in);
        validate = new Validator();
        customerControl = new CustomerController();
        restaurantControl = new RestaurantController();
        adminControl  = new AdminController();
		
	
	}
	/**
     * A method to display the main menu
     */
    private void displayMainMenu()
    {
        //clear();
        System.out.println("==================================================");
        System.out.println("Welcome to Monash Eats");
        System.out.println("==================================================");
        System.out.println("(1) Login");
        System.out.println("(2) Register");
        System.out.println("(3) View Menu");
        System.out.println("(4) Help");
        System.out.println("(5) Exit");
        System.out.print("Please choose an option....... ");
    }
    
    
    /**
     * A method to display the login menu
     */
    private void displayLogin()
    {
       //clear();
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
    private void displayRegister()
    {
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
    private void displayAdminDashboard()
    {
       //clear();
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
    private void displayCustomerManagementMenu()
    {
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
     * A method to display the Restaurant Owner management dashboard
     */
    private void displayRestaurantOwnerManagementMenu()
    {
        //clear();
        System.out.println("========================================================");
        System.out.println("Welcome to Restaurant Owner Management Menu");
        System.out.println("========================================================");
        System.out.println("(1) View Restaurant Owners");
        System.out.println("(2) Add Restaurant Owner");
        System.out.println("(3) Delete Restaurant Owner");
        System.out.println("(4) Go back to Admin Main Menu");
        System.out.println("Please choose an option....... ");
    }
	
}
	