package ReplitTries;

import java.util.*;

public class WriteQuartersPennies {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter cents:");
		int cents = input.nextInt();
		if (cents < 100 && cents > 0) {
			int quarters = cents / 25;
			int remaining1 = cents % 25;
			int dimes = remaining1 / 10;
			int remaining2 = remaining1 % 10;
			int nickels = remaining2 / 5;
			int pennies = remaining2 % 5;

			System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels
					+ " nickels, and " + pennies + " pennies");

		} else {
			System.out.println("Invalid cents amount");
		}

	}
}