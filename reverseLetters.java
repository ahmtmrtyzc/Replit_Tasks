package com.neotech.lesson16;

public class reverseLetters {

	public static void main(String[] args) {
		String Sunday = "Sunday";
		for (int i = Sunday.length(); i > 0; i--) {

			System.out.print(Sunday.charAt(i - 1));
		}

	}

}
