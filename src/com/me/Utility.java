package com.me;

public class Utility {
	private static int customerId = 1;

	public static int getNextCustomerId() {
		customerId += 1;
		return customerId;
	}
}
