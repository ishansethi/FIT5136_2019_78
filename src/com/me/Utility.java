package com.me;

public class Utility {
	private static int customerId = 0;

	public static String getNextCustomerId() {
		customerId += 1;
		return String.valueOf(customerId);
	}
}
