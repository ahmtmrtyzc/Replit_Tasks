package ReplitTries;

import java.util.Scanner;

public class FindACube {

	public static void cube() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result  = num*num*num;
		System.out.println(result);
	}

	public static void main(String[] args) {

		cube();

	}

}
