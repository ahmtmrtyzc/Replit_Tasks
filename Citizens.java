package ReplitTries;

import java.util.Scanner;

public class Citizens {

	public static void main(String[] args) {
		int seniorCitizens, nonSeniorCitizens, age;
		Scanner object = new Scanner(System.in);

		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int countSenior = object.nextInt();
		int countNonSenior = object.nextInt();
		System.out.println("Ask user to enter age:");
		int newAge = object.nextInt();
		nonSeniorCitizens = countNonSenior;
		seniorCitizens = countSenior;

		if (newAge >= 65) {
			seniorCitizens = countSenior + 1;
			System.out.println("New seniorCitizens count " + seniorCitizens);
			System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
		} else {
			nonSeniorCitizens = countNonSenior + 1;
			System.out.println("New seniorCitizens count " + seniorCitizens);
			System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
		}

	}

}
