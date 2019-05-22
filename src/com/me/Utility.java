package com.me;

public class Utility {
	private static int customerId = 1000;
	private static int restaurantId = 100;
	private static final int minPasswordLength = 8;
	private static final int minAlphabetCount = 3;
	private static final int minNumberCount = 2;

	public static String getNextCustomerId() {
		customerId += 1;
		return String.valueOf(customerId);
	}

	public static String getNextRestaurantId() {
		restaurantId += 1;
		return String.valueOf(restaurantId);
	}

	public static boolean isValidEmail(String email) {
		String emailCheckRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(emailCheckRegex);
	}

	/**
	 * Check if password satisfies safety criteria
	 * 
	 * @param password
	 * @return
	 */
	public static boolean isValidPassword(String password) {

		if (password.length() < minPasswordLength) {
			return false;
		}

		int alphabetCount = 0;
		int numberCount = 0;

		for (int i = 0; i < password.length(); i++) {
			// check for alphabets
			if (password.toLowerCase().charAt(i) >= 'a' && password.toLowerCase().charAt(i) <= 'z') {
				alphabetCount++;
			}
			// check for numbers
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				numberCount++;
			}
		}

		boolean alphabetCheck = alphabetCount >= minAlphabetCount;
		boolean numberCheck = numberCount >= minNumberCount;

		if (!alphabetCheck) {
			System.out.println("Password doesn't meet minimum alphabet count of " + minAlphabetCount);
			return false;
		}

		if (!numberCheck) {
			System.out.println("Password doesn't meet minimum number count of " + minNumberCount);
			return false;
		}

		return true;
	}

	/**
	 * Check if the string entered contains only numbers
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isIntString(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Check if the string entered is purely alphabetic
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isAlphabetic(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isAlphabetic(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
