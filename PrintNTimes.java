package ReplitTries;

import java.util.Scanner;

public class PrintNTimes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}

	}

}
