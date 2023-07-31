package ReplitTries;

import java.util.Scanner;

public class ApartmentLeasing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to NeoTechAcademy Apartments!");
		System.out.println("Number of bedrooms you are interested:");
		int bedRoom = scan.nextInt();
		switch (bedRoom) {
		case 1:
			System.out.println("One Bedroom Selected");
			System.out.println("Starting Price: 1100");
			break;
		case 2:
			System.out.println("Two Bedroom Selected");
			System.out.println("Starting Price: 1850");
			break;

		case 3:
			System.out.println("Three Bedroom Selected");
			System.out.println("Starting Price: 2550");
			break;

		default:
			System.out.println("No such Bedrooms available");
			break;
		}
	}

}
