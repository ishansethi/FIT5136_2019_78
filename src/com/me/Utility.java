package com.me;

public class Utility {
	private static int customerId = 0;

	public static String getNextCustomerId() {
		customerId += 1;
		return String.valueOf(customerId);
	}

	public static boolean validateEmail(String email) {
		String emailCheckRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(emailCheckRegex);
	}
}
