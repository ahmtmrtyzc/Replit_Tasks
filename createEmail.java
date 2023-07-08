package com.neotech.lesson16;

import java.util.Scanner;

public class createEmail {
	// Create a method createEmail(). Based on provided user firstName,
	// lastName emailType, your method should return
	// Complete email address
	// Example:
	// First name ++>John
	// Last name ++>Snow
	// Email type++> Gmail
	// Return ++> johnsnow@gmail.com
	// Lets also ask for the year they were born
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param emailType
	 * @param year
	 * @return
	 */
	String creatEmail(String firstName, String lastName, String emailType, int year) {
		// firstNamelastNameYear@emailType.com
		String email = firstName + lastName + year + "@" + emailType + ".com";

		return email;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fName = input.next();
		System.out.println("Please enter your last name: ");
		String lName = input.next();
		System.out.println("Please enter yhe year you were born: ");
		int y = input.nextInt();
		System.out.println("What is your email type: ");
		String eType = input.next();
		//Create an object of the homework1 class
		createEmail cE = new createEmail();
		String fullEmail = cE.creatEmail(fName, lName, eType, y);
		System.out.println(fullEmail);
		input.close();

	}

}
