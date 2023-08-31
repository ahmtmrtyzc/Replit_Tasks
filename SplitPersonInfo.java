package ReplitTries;

import java.util.Scanner;

public class SplitPersonInfo {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
	}

	public static void person(String info) {

		String[] strArray = info.split(",");

		System.out.println("person name: " + strArray[0] + "\nlast name: " + strArray[1] + "\nage: " + strArray[2]);

	}

}
