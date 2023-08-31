package ReplitTries;

import java.util.Scanner;

public class NextThree {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		// get input from the user
		System.out.println("enter number");
		int num = inp.nextInt();
		
		nextThree(num);

	}

	public static void nextThree(int num) {
		System.out.println((num + 1) + " " + (num + 2) + " " + (num + 3) + " ");

	}

}
