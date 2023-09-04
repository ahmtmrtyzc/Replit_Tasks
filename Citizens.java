//1. Declare int variables: seniorCitizens, nonSeniorCitizens, age
//2. Create a Scanner object
//3. Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:

// "Enter current count for seniorCitizens and nonSeniorCitizens:"

//4. Ask user to enter age:

//  "What is new citizen's age?"

//- if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

//- if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

//5. Last print another message:

//  "New seniorCitizens count ValueOfVariable"

//  "New nonSeniorCitizens count ValueOfVariable"


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
