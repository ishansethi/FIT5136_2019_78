package com.me;

public class Utility {
	private static int customerId = 0;
	private static final int minPasswordLength = 8;
	private static final int minAlphabetCount = 3;
	private static final int minNumberCount = 2;

	public static String getNextCustomerId() {
		customerId += 1;
		return String.valueOf(customerId);
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

		int characterCount = 0;
		int numericCount = 0;

		for (int i = 0; i < password.length(); i++) {
			// check for alphabets
			if (password.toLowerCase().charAt(i) >= 'a' && password.toLowerCase().charAt(i) >= 'z') {
				characterCount++;
			}
			// check for numbers
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				numericCount++;
			}
		}

		return (characterCount >= minAlphabetCount && numericCount >= minNumberCount);
	}

	public static boolean isIntString(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i)))
				return false;
		}
		return true;
	}
}
